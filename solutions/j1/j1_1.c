#include <stdio.h>
#include <stdlib.h>

const uint BUFFSIZE = 8;
const uint MAXSIZE = 1024;

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
            else if(line[0] == '\n'){
                calories[i] = cal;
                cal = 0;
                i++;
            }
            else {
                fprintf(stderr, "Error extracting data\n");
                break;
            }
        }
        if (ferror(file) != 0){
            fprintf(stderr, "Error reading file content\n");
        }
        fclose(file);

        int max = 0;
        int index = 0;
        for (int j = 0; j < i; j++){
            if (calories[j] > max){
                max = calories[j];
                index = j;
            }
        }
        printf("Elf %d has the most calories with %d\n", index, max);
    }
    else{
        fprintf(stderr, "Error opening file\n");
    }
    return 0;
}