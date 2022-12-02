#include <stdio.h> 
#include <stdlib.h>

const uint BUFFSIZE = 8;
const uint SCORE_ROCK = 1;
const uint SCORE_PAPER = 2;
const uint SCORE_SCISSORS = 3;
const uint SCORE_WIN = 6;
const uint SCORE_DRAW = 3;
const uint SCORE_LOSE = 0; 
const char O_ROCK = 'A';
const char O_PAPER = 'B';
const char O_SCISSORS = 'C';
const char STRAT_LOSE = 'X';
const char STRAT_DRAW = 'Y';
const char STRAT_WIN = 'Z';


int main(int argc, char **argv) {
    FILE *file;
    if (file = fopen("../../input/j2.txt", "r")) { // on essaie d'ouvrir le fichier
        char line[BUFFSIZE];

        int score = 0;

        char outcome = '\0';
        char o_shape = '\0';

        while (fgets(line, BUFFSIZE, file)) { // tant qu'on est pas à la fin du fichier
            if (sscanf(line, "%c %c\n", &o_shape, &outcome) == 2) { // on essaie de récupérer les données de la ligne courante
                if (o_shape == O_ROCK) {
                    if (outcome == STRAT_DRAW) {
                        score += SCORE_ROCK + SCORE_DRAW;
                    }
                    else if (outcome == STRAT_WIN) {
                        score += SCORE_PAPER + SCORE_WIN;
                    }
                    else if (outcome == STRAT_LOSE) {
                        score += SCORE_SCISSORS + SCORE_LOSE;
                    }
                }
                else if (o_shape == O_PAPER) {
                    if (outcome == STRAT_LOSE) {
                        score += SCORE_ROCK + SCORE_LOSE;
                    }
                    else if (outcome == STRAT_DRAW) {
                        score += SCORE_PAPER + SCORE_DRAW;
                    }
                    else if (outcome == STRAT_WIN) {
                        score += SCORE_SCISSORS + SCORE_WIN;
                    }
                }
                else if (o_shape == O_SCISSORS) {
                    if (outcome == STRAT_WIN) {
                        score += SCORE_ROCK + SCORE_WIN;
                    }
                    else if (outcome == STRAT_LOSE) {
                        score += SCORE_PAPER + SCORE_LOSE;
                    }
                    else if (outcome == STRAT_DRAW) {
                        score += SCORE_SCISSORS + SCORE_DRAW;
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
        fclose(file);

        printf("Score according to strategy : %d\n", score);
    }
    else {
        fprintf(stderr, "Error opening file\n");
    }
    return 0;
}
