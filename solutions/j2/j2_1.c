#include <stdio.h> 
#include <stdlib.h>

#define BUFFSIZE 8
#define SCORE_ROCK 1
#define SCORE_PAPER 2
#define SCORE_SCISSORS 3
#define SCORE_WIN 6
#define SCORE_DRAW 3
#define SCORE_LOSE 0 
#define O_ROCK 'A'
#define O_PAPER 'B'
#define O_SCISSORS 'C'
#define M_ROCK 'X'
#define M_PAPER 'Y'
#define M_SCISSORS 'Z'


int main(int argc, char **argv) {
    FILE *file = NULL;
    if (file = fopen("../../input/j2.txt", "r")) { // on essaie d'ouvrir le fichier
        char line[BUFFSIZE];

        int score = 0;

        char m_shape = '\0';
        char o_shape = '\0';

        while (fgets(line, BUFFSIZE, file)) { // tant qu'on est pas à la fin du fichier
            if (sscanf(line, "%c %c\n", &o_shape, &m_shape) == 2) { // on essaie de récupérer les données de la ligne courante
                if (o_shape == O_ROCK) {
                    if (m_shape == M_ROCK) {
                        score += SCORE_ROCK + SCORE_DRAW;
                    }
                    else if (m_shape == M_PAPER) {
                        score += SCORE_PAPER + SCORE_WIN;
                    }
                    else if (m_shape == M_SCISSORS) {
                        score += SCORE_SCISSORS + SCORE_LOSE;
                    }
                }
                else if (o_shape == O_PAPER) {
                    if (m_shape == M_ROCK) {
                        score += SCORE_ROCK + SCORE_LOSE;
                    }
                    else if (m_shape == M_PAPER) {
                        score += SCORE_PAPER + SCORE_DRAW;
                    }
                    else if (m_shape == M_SCISSORS) {
                        score += SCORE_SCISSORS + SCORE_WIN;
                    }
                }
                else if (o_shape == O_SCISSORS) {
                    if (m_shape == M_ROCK) {
                        score += SCORE_ROCK + SCORE_WIN;
                    }
                    else if (m_shape == M_PAPER) {
                        score += SCORE_PAPER + SCORE_LOSE;
                    }
                    else if (m_shape == M_SCISSORS) {
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
