package src.main.java.Caro;

public class Board {
    public char matrix[][];
    public int size;
    public int directionX[] = {1, 1, 1, -1, -1, -1, 0, 0};
    public int directionY[] = {1, 0, -1, 1, 0, -1, 1, -1};

    public void playSymbol(char symbol, int coorX, int coorY) {
        matrix[coorX][coorY] = symbol;
    }

    public void printBoard() {
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                System.out.print(matrix[i][j] +  " ");
            }
            System.out.println();
        }
    }
    public Board(int size) {
        this.size = size;
        this.matrix = new char[size][size];
        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                this.matrix[i][j] = '.';
            }
        }
    }

    public boolean isWin() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                for (int k = 0; k < 8; k++) {
                    int cnt = 0;
                    for(int l = 1; l < 5; l++) {
                        int curx = i + l * directionX[k];
                        int cury = j + l * directionY[k];
                        if(curx >= 0 && curx < size && cury >= 0 && cury < size) {
                            if(matrix[curx][cury] != matrix[i][j]) {
                                break;
                            }
                            else if(matrix[curx][cury] == matrix[i][j]) {
                                cnt++;
                            }
                        }
                        else break;
                    }
                    if((matrix[i][j] == 'X' || matrix[i][j] == 'O') &&cnt == 4) return true;
                }
            }
        }
        return false;
    }
    public boolean isValid(int coorX, int coorY) {
        if(matrix[coorX][coorY] != '.') {
            return false;
        }
        return true;
    }
}
