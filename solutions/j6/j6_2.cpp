#include <fstream>
#include <iostream>
#include <list>
#include <set>

const uint WIN_SIZE = 14U;

int main() {
    std::ifstream file("../../input/j6.txt");

    if (file) {
        bool marker = false;
        std::list<char> window;
        char c;

        int i = 0;
        while (i<WIN_SIZE-1) {
            file>>c;
            window.push_back(c);
            i++;
        }
        while (file && !marker) {
            file>>c;
            window.push_back(c);
            std::set<char> tmp(window.begin(), window.end());
            marker = tmp.size() == WIN_SIZE;
            i++;
            window.pop_front();
        }
        if (marker) {
            printf("The marker is after char %d\n", i);
        }
        else {
            std::cerr<<"Error reading file content\n";
        }
    }
    else {
        std::cerr<<"Error opening file\n";
    }
}