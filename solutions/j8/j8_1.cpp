#include <fstream>
#include <iostream>
#include <vector>

const unsigned int WIN_SIZE = 4U;

int main() {
    std::ifstream file("../../input/j8.txt");

    if (file) {
        std::vector<std::vector<int>> map;
        std::string line;

        while (getline(file, line)) {
            std::vector<int> row;
            for (char c: line) {
                row.push_back(c - '0');
            }
            map.push_back(row);
        }

        int visible = 2*(map.size() + map[0].size()) - 4;

        int N = map.size();
        int M = map[0].size();
        bool visibleTree;
        int tmp = 0;
        for (int i = 1; i < N-1; i++) {
            for (int j = 1; j < M-1; j++){
                tmp = map[i][j];
                visibleTree = true;
                for (int t = 0; t < i; t++) {
                    if (map[t][j] >= tmp) {
                        visibleTree = false;
                        break;
                    }
                }
                if (!visibleTree) {
                    visibleTree = true;
                    for (int t = N-1; t > i; t--) {
                        if (map[t][j] >= tmp) {
                            visibleTree = false;
                            break;
                        }
                    }

                    if (!visibleTree) {
                        visibleTree = true;
                        for (int t = 0; t < j; t++) {
                            if (map[i][t] >= tmp) {
                                visibleTree = false;
                                break;
                            }
                        }

                        if (!visibleTree) {
                            visibleTree = true;
                            for (int t = M-1; t > j; t--) {
                                if (map[i][t] >= tmp) {
                                    visibleTree = false;
                                    break;
                                }
                            }
                        }
                    }
                }
                visible += visibleTree;
            }
        }

        
        if (file.eof()) {
            printf("There are %d visible trees\n", visible);
        }
        else {
            std::cerr<<"Error reading file content\n";
        }
    }
    else {
        std::cerr<<"Error opening file\n";
    }
}