#include <stdio.h>
#include <stdlib.h>

#define BUFFSIZE 8U
#define MAXSIZE 1024U

int main(int argc, char **argv) {
    FILE *file;
    if (file = fopen("../../input/j1.txt", "r")) { // on essaie d'ouvrir le fichier
        char line[BUFFSIZE];
        int calories[MAXSIZE];

        int cal = 0;
        int tmp = 0;
        int i = 0;

        while (fgets(line, BUFFSIZE, file)) { // tant qu'on est pas à la fin du fichier
            if (sscanf(line, "%d", &tmp) == 1) { // on essaie de récupérer les données de la ligne courante
                cal += tmp;
            }
            else if (line[0] == '\n') {
                calories[i] = cal;
                cal = 0;
                i++;
            }
            else {
                fprintf(stderr, "Error extracting data\n");
                break;
            }
        }
        if (ferror(file) != 0) {
            fprintf(stderr, "Error reading file content\n");
        }
        fclose(file);

        int first = 0;
        int second = 0;
        int third = 0;
        for (int j = 0; j < i; j++) {
            if (calories[j] > first) {
                third = second;
                second = first;
                first = calories[j];
            }
            else if (calories[j] > second) {
                third = second;
                second = calories[j];
            }
            else if (calories[j] > third) {
                third = calories[j];
            }
        }
        int sum = first + second + third;
        printf("The three elves with the most calories have a total of %d cal\n", sum);
    }
    else {
        fprintf(stderr, "Error opening file\n");
    }
    return 0;
}