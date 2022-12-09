#include <stdio.h>
#include <stdlib.h>

#define BUFFSIZE 8

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
        int H_x = start_x;
        int H_y = start_y;
        int T_x = start_x;
        int T_y = start_y;

        rewind(file);

        while (fgets(line, BUFFSIZE, file)) {
            // show(grid, width, height);
            // printf("\n");
            if (sscanf(line, "%c %d\n", &dir, &dist) == 2) {
                for (int i = 0; i < dist; i++) {
                    switch (dir) {
                        case 'U':
                            H_y--;
                            if (T_y == H_y+2){
                                T_y--;
                                if (T_x != H_x) {
                                    T_x = H_x;
                                }
                            }
                            break;
                        case 'D':
                            H_y++;
                            if (T_y == H_y-2){
                                T_y++;
                                if (T_x != H_x) {
                                    T_x = H_x;
                                }
                            }
                            break;
                        case 'R':
                            H_x++;
                            if (T_x == H_x-2){
                                T_x++;
                                if (T_y != H_y) {
                                    T_y = H_y;
                                }
                            }
                            break;
                        case 'L':
                            H_x--;
                            if (T_x == H_x+2){
                                T_x--;
                                if (T_y != H_y) {
                                    T_y = H_y;
                                }
                            }
                            break;
                    }
                    if (grid[T_y][T_x] == '.'){
                        grid[T_y][T_x] = '#';
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
