#include <fstream>
#include <iostream>
#include <vector>
#include <stack>

int main() {
    std::ifstream file("../../input/j5.txt");

    if (file) {
        std::vector<std::string> draw;
        std::string line;
        std::vector<std::stack<char>> stacks;

        while (std::getline(file, line) && !line.empty()) {
            draw.push_back(line);
        }
        if (file) {
            int n = (draw.back().size()+1) /4;
            draw.pop_back();

            for (int i = 0; i < n; i++) {
                stacks.push_back(std::stack<char>());
            }

            while (!draw.empty()) {
                line = draw.back();
                draw.pop_back();

                char crate = '\0';
                for (int i = 0; i < n; i++) {
                    crate = line[4*i +1];
                    if (crate != ' ') {
                        stacks[i].push(crate);
                    }
                }
            }
            int nb = 0;
            int from = 0;
            int to = 0;
            std::stack<char> tmp;
            while (getline(file, line)) {
                if (sscanf(line.c_str(), "move %d from %d to %d", &nb, &from, &to) == 3) {
                    for (int i = 0; i < nb; i++) {
                        tmp.push(stacks[from-1].top());
                        stacks[from-1].pop();
                    }
                    while (!tmp.empty()) {
                        stacks[to-1].push(tmp.top());
                        tmp.pop();
                    }
                }
                else {
                    std::cerr<<"Error extracting data\n";
                }
            }
        }
        if (file.eof()) {
            std::string res = "";
            for (int i = 0; i < stacks.size(); i++) {
                res += stacks[i].top();
            }
            printf("The message is %s\n", res.c_str());
        }
        else {
            std::cerr<<"Error reading file content\n";
        }
    }
    else {
        std::cerr<<"Error opening file\n";
    }
}