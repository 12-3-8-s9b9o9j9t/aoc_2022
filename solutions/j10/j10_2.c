#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define BUFFSIZE 16
#define WIDTH 40
#define HEIGHT 6

int main(int argc, char **argv) {
    FILE *file = NULL;
    if (file = fopen("../../input/j10.txt", "r")) {
        char line[BUFFSIZE];
        char op[BUFFSIZE/2];
        int v = 0;

        int x = 1;
        int cycle = 0;

        int op_cycle = 0;

        while (fgets(line, BUFFSIZE, file)) {
            if (sscanf(line, "%s %d\n", op, &v) >=1 ) {
                if (strcmp(op, "addx") == 0) {
                    op_cycle = 2;
                }
                else if (strcmp(op, "noop") == 0) {
                    op_cycle = 1;
                }
                for (int i = 0; i < op_cycle; i++) {
                    cycle++;
                    if (abs(x - ((cycle - 1) % 40)) <= 1) {
                        printf("#");
                    }
                    else {
                        printf(".");
                    }
                    if (cycle % WIDTH == 0) {
                        printf("\n");
                    }
                }
                if (strcmp(op, "addx") == 0) {
                    x += v;
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
    }
    else {
        fprintf(stderr, "Error opening file\n");
    }
}
