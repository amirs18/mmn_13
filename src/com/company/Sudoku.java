package com.company;

/**
 * Class Sudoku , represents a 3*3 array of a 3*3 arrays(Square3*3)
 */
public class Sudoku {
    //crating local private veritable
    private final Square3x3[][] SQUARE_3X3_ARRAY = new Square3x3[3][3];

    /**
     * first contractor crates an empty sudoku with all the cells set to -1
     */
    public Sudoku() {
        for (int i = 0; i < SQUARE_3X3_ARRAY.length; i++) {
            for (int j = 0; j < SQUARE_3X3_ARRAY[0].length; j++) {
                SQUARE_3X3_ARRAY[i][j] = new Square3x3();
            }
        }
    }

    /**
     * second contractor builds a sudoku from a given 3*3 array
     * @param square3x3 a given square3x3 array
     */
    public Sudoku(Square3x3[][] square3x3) {
        for (int i = 0; i < SQUARE_3X3_ARRAY.length; i++) {
            for (int j = 0; j < SQUARE_3X3_ARRAY[0].length; j++) {
                SQUARE_3X3_ARRAY[i][j] = new Square3x3(square3x3[i][j]);
            }
        }
    }

    /**
     * a method to cheack if the sudoku board is valid
     * @return true if the sudoku is valid
     */
    public Boolean isValid() {
        boolean[] _tempRowValues = new boolean[10];
        boolean[] _tempColValues = new boolean[10];
        //for (int i=0;i<)
        for (int i = 0; i < SQUARE_3X3_ARRAY.length; i++) {
            for (int j = 0; j < SQUARE_3X3_ARRAY[0].length; j++) {
                if (!SQUARE_3X3_ARRAY[i][j].allThere())
                    return false;
            }
        }
        for (int i = 0; i < SQUARE_3X3_ARRAY.length; i++) {
            for (int reast = 1; reast < _tempRowValues.length; reast++)
                _tempRowValues[reast] = false;
            for (int _tempRow = 0; _tempRow < 3; _tempRow++) {
                SQUARE_3X3_ARRAY[i][0].whosThereRow(_tempRow, _tempRowValues);
                SQUARE_3X3_ARRAY[i][1].whosThereRow(_tempRow, _tempRowValues);
                SQUARE_3X3_ARRAY[i][2].whosThereRow(_tempRow, _tempRowValues);
                for (int check = 1; check < _tempRowValues.length; check++) {
                    if (!_tempRowValues[check])
                        return false;
                }
            }
        }
        for (int j = 0; j < SQUARE_3X3_ARRAY[0].length; j++) {
            //resetting the boolean array to false so we don't have to create 9 different arrays
            for (int reast = 1; reast < _tempColValues.length; reast++)
                _tempColValues[reast] = false;
            for (int _tempCol = 0; _tempCol < 3; _tempCol++) {
                SQUARE_3X3_ARRAY[0][j].whosThereCol(_tempCol, _tempColValues);
                SQUARE_3X3_ARRAY[1][j].whosThereCol(_tempCol, _tempColValues);
                SQUARE_3X3_ARRAY[2][j].whosThereCol(_tempCol, _tempColValues);
                for (int check = 1; check < _tempColValues.length; check++) {
                    if (!_tempColValues[check])
                        return false;
                }
            }
        }
        return true;
    }
}
