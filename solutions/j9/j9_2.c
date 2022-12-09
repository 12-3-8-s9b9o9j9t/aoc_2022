#include <stdio.h>
#include <stdlib.h>

#define BUFFSIZE 8
#define KNOTS 10

void show(char** grid, int width, int height) {
    for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
            printf("%c", grid[i][j]);
        }
        printf("\n");
    }
}

int main(int argc, char **argv) {
    FILE *file = NULL;

    if (file = fopen("../../input/j9.txt", "r")) {
        char line[BUFFSIZE];

        char dir = '\0';
        int dist = 0;
        
        int min_x = 0;
        int max_x = 0;
        int min_y = 0;
        int max_y = 0;
        
        int current_x = 0;
        int current_y = 0;

        while (fgets(line, BUFFSIZE, file)) {
            if (sscanf(line, "%c %d\n", &dir, &dist) == 2) {
                switch (dir) {
                    case 'U':
                        current_y -= dist;
                        break;
                    case 'D':
                        current_y += dist;
                        break;
                    case 'R':
                        current_x += dist;
                        break;
                    case 'L':
                        current_x -= dist;
                        break;
                }
                if (current_x < min_x) {
                    min_x = current_x;
                }
                else if (current_x > max_x) {
                    max_x = current_x;
                }
                if (current_y < min_y) {
                    min_y = current_y;
                }
                else if (current_y > max_y) {
                    max_y = current_y;
                }
            }
            else {
                fprintf(stderr, "Error extracting data\n");
                break;
            }
        }

        int width = max_x - min_x +1;
        int height = max_y - min_y +1;

        int start_x = -min_x;
        int start_y = -min_y;

        char** grid = (char **)malloc(height * sizeof(char*));
        for (int i = 0; i < height; i++) {
            grid[i] = (char *)malloc(width * sizeof(char));
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                grid[i][j] = '.';
            }
        }
        grid[start_y][start_x] = 's';

        int K_x[KNOTS];
        int K_y[KNOTS];

        for (int i = 0; i < KNOTS; i++) {
            K_x[i] = start_x;
            K_y[i] = start_y;
        }

        rewind(file);

        while (fgets(line, BUFFSIZE, file)) {
            // show(grid, width, height);
            // printf("\n");
            if (sscanf(line, "%c %d\n", &dir, &dist) == 2) {
                for (int i = 0; i < dist; i++) {
                    /*{
                        char** tmp = (char **)malloc(height * sizeof(char*));
                        for (int i = 0; i < height; i++) {
                            tmp[i] = (char *)malloc(width * sizeof(char));
                        }

                        for (int i = 0; i < height; i++) {
                            for (int j = 0; j < width; j++) {
                                tmp[i][j] = '.';
                            }
                        }
                        for (int i = KNOTS-1; i >= 0; i--) {
                            tmp[K_y[i]][K_x[i]] = '0'+i;
                        }
                        show(tmp, width, height);
                        printf("\n");
                        for (int i = 0; i < height; i++) {
                            free(tmp[i]);
                        }
                        free(tmp);
                    }*/
                    switch (dir) {
                        case 'U':
                            K_y[0]--;
                            break;
                        case 'D':
                            K_y[0]++;
                            break;
                        case 'R':
                            K_x[0]++;
                            break;
                        case 'L':
                            K_x[0]--;
                            break;
                    }
                    for (int n = 1; n < KNOTS; n++) {
                        if (K_y[n] == K_y[n-1]+2) { // U
                            K_y[n]--;
                            if (K_x[n] < K_x[n-1]) {
                                K_x[n]++;
                            }
                            else if (K_x[n] > K_x[n-1]) {
                                K_x[n]--;
                            }
                        }
                        else if (K_y[n] == K_y[n-1]-2) { // D
                            K_y[n]++;
                            if (K_x[n] < K_x[n-1]) {
                                K_x[n]++;
                            }
                            else if (K_x[n] > K_x[n-1]) {
                                K_x[n]--;
                            }
                        }
                        else if (K_x[n] == K_x[n-1]-2) { // R
                            K_x[n]++;
                            if (K_y[n] < K_y[n-1]) {
                                K_y[n]++;
                            }
                            else if (K_y[n] > K_y[n-1]) {
                                K_y[n]--;
                            }
                        }
                        else if (K_x[n] == K_x[n-1]+2) { // L
                            K_x[n]--;
                            if (K_y[n] < K_y[n-1]) {
                                K_y[n]++;
                            }
                            else if (K_y[n] > K_y[n-1]) {
                                K_y[n]--;
                            }
                        }
                    }
                    if (grid[K_y[KNOTS-1]][K_x[KNOTS-1]] == '.') {
                        grid[K_y[KNOTS-1]][K_x[KNOTS-1]] = '#';
                    }
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
        else {
            // show(grid, width, height);
            /*{
                char** tmp = (char **)malloc(height * sizeof(char*));
                for (int i = 0; i < height; i++) {
                    tmp[i] = (char *)malloc(width * sizeof(char));
                }

                for (int i = 0; i < height; i++) {
                    for (int j = 0; j < width; j++) {
                        tmp[i][j] = '.';
                    }
                }
                for (int i = KNOTS-1; i >= 0; i--) {
                    tmp[K_y[i]][K_x[i]] = '0'+i;
                }
                show(tmp, width, height);
                printf("\n");
                for (int i = 0; i < height; i++) {
                    free(tmp[i]);
                }
                free(tmp);
            }*/
            int count = 0;
            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (grid[i][j] != '.') {
                        count++;
                    }
                }
            }
            printf("The tail of the rope visited %d positions\n", count);
        }
        for (int i = 0; i < height; i++) {
            free(grid[i]);
        }
        free(grid);
        fclose(file);
    }
    else {
        fprintf(stderr, "Error opening file\n");
    }
}
