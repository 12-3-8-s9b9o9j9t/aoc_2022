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

        int maxview = 0;

        int N = map.size();
        int M = map[0].size();
        int tmpview;
        int tmp = 0;
        for (int i = 1; i < N-1; i++) {
            for (int j = 1; j < M-1; j++){
                tmpview = 1;
                for (int t = i-1; t >= 0; t--) {
                    tmp++;
                    if (map[t][j] >= map[i][j]) {
                        break;
                    }
                }
                tmpview *= tmp;
                tmp = 0;
                for (int t = i+1; t < N; t++) {
                    tmp++;
                    if (map[t][j] >= map[i][j]) {
                        break;
                    }
                }
                tmpview *= tmp;
                tmp = 0;
                for (int t = j-1; t >= 0; t--) {
                    tmp++;
                    if (map[i][t] >= map[i][j]) {
                        break;
                    }
                }
                tmpview *= tmp;
                tmp = 0;
                for (int t = j+1; t < M; t++) {
                    tmp++;
                    if (map[i][t] >= map[i][j]) {
                        break;
                    }
                }
                tmpview *= tmp;
                tmp = 0;
                if (tmpview > maxview) {
                    maxview = tmpview;
                }
            }
        }

        
        if (file.eof()) {
            printf("The highest scenic score is %d\n", maxview);
        }
        else {
            std::cerr<<"Error reading file content\n";
        }
    }
    else {
        std::cerr<<"Error opening file\n";
    }
}