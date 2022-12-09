#include <stdio.h> 
#include <stdlib.h>
#include <string.h>

#define BUFFSIZE 128U
#define NB_TYPES 52U

int priority(char* compartment1 , char* compartment2, int size) {
    int items1[NB_TYPES] = {0};
    int items2[NB_TYPES] = {0};

    char item1 = '\0';
    char item2 = '\0';

    for (int i = 0; i < size; i++) {
        item1 = compartment1[i];
        item2 = compartment2[i];

        if ('a' <= item1 && item1 <= 'z') {
            items1[item1 - 'a']++;
        }
        else {
            items1[item1 - 'A' + 26]++;
        }

        if ('a' <= item2 && item2 <= 'z') {
            items2[item2 - 'a']++;
        }
        else {
            items2[item2 - 'A' + 26]++;
        }
    }

    for (int i = 0; i < NB_TYPES; i++) {
        if (items1[i] > 0 && items2[i] > 0) {
            return i+1;
        }
    }

    return 0;
}

int main(int argc, char **argv) {
    FILE *file = NULL;
    if (file = fopen("../../input/j3.txt", "r")) { // on essaie d'ouvrir le fichier
        char line[BUFFSIZE];

        int total_priority = 0;

        while (fgets(line, BUFFSIZE, file)) { // tant qu'on est pas à la fin du fichier
            int len = strlen(line)/2;
            total_priority += priority(line, line + len, len);
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
