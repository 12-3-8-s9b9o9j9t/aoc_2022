#include <stdio.h> 
#include <stdlib.h>
#include <string.h>

#define BUFFSIZE 128U
#define NB_TYPES 52U

int priority(char **rucksacks) {
    int items[3][NB_TYPES] = {{0}};

    char item = '\0';

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < strlen(rucksacks[i]); j++) {
            item = rucksacks[i][j];

            if ('a' <= item && item <= 'z') {
                items[i][item - 'a']++;
            }
            else {
                items[i][item - 'A' + 26]++;
            }
        }
    }

    for (int i = 0; i < NB_TYPES; i++) {
        if (items[0][i] > 0 && items[1][i] > 0 && items[2][i] > 0) {
            return i+1;
        }
    }

    return 0;
}

int main(int argc, char **argv) {
    FILE *file;
    if (file = fopen("../../input/j3.txt", "r")) { // on essaie d'ouvrir le fichier
        char lines[3][BUFFSIZE] = {{0}};

        int total_priority = 0;

        int i = 0;
        while (fgets(lines[i], BUFFSIZE, file)) { // tant qu'on est pas à la fin du fichier
            i = (i+1)%3;
            if (i == 0) {
                total_priority += priority(lines);
            }
        }
        if (ferror(file) != 0) {
            fprintf(stderr, "Error reading file content\n");
        }
        fclose(file);

        printf("Sum of priorities : %d\n", total_priority);
    }
    else {
        fprintf(stderr, "Error opening file\n");
    }
    return 0;
}
