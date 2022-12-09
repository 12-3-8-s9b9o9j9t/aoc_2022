#include <stdio.h>
#include <stdlib.h>

#define BUFFSIZE 16

int main(int argc, char **argv) {
    FILE *file = NULL;
    if (file = fopen("../../input/j4.txt", "r")) { // on essaie d'ouvrir le fichier
        char line[BUFFSIZE];

        int overlap = 0;

        int a1 = 0;
        int b1 = 0;
        int a2 = 0;
        int b2 = 0;

        while (fgets(line, BUFFSIZE, file)) { // tant qu'on est pas à la fin du fichier
            if (sscanf(line, "%d-%d,%d-%d", &a1, &b1, &a2, &b2) == 4) { // on essaie de récupérer les données de la ligne courante
                if ((a1 <= a2 && b2 <= b1) || (a2 <= a1 && b1 <= b2)) {
                    overlap += 1;
                }
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

        printf("In %d assignment pairs, one range fully contains the other\n", overlap);
    }
    else {
        fprintf(stderr, "Error opening file\n");
    }
    return 0;
}