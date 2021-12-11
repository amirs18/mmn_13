package com.company;

/**
 * Class Square3x3, represents a 3*3 array of integers
 */
public class Square3x3 {
    //creating local veritable
    private final int[][] _cellArray = new int[3][3];

    /**
     *first constructor builds and rests the whole array to -1
     */
    public Square3x3() {
        for (int i = 0; i < _cellArray.length; i++) {
            for (int j = 0; j < _cellArray[0].length; j++) {
                _cellArray[i][j] = -1;
            }
        }
    }

    /**
     * second constructor creates a Square3x3 veritable from a given array of integers
     * @param _other given array of integers
     */
    public Square3x3(int[][] _other) {
        for (int i = 0; i < _cellArray.length; i++) {
            for (int j = 0; j < _cellArray[0].length; j++) {
                _cellArray[i][j] = -1;
            }
        }
        if (_other.length >= 3 && _other[0].length >= 3) {
            for (int i = 0; i < _cellArray.length; i++) {
                for (int j = 0; j < _cellArray[0].length; j++) {
                    _cellArray[i][j] = _other[i][j];
                }
            }
        }
        if (_other.length >= 3 && _other[0].length < 3) {
            for (int i = 0; i < _cellArray.length; i++) {
                for (int j = 0; j < _other[0].length; j++) {
                    _cellArray[i][j] = _other[i][j];
                }
            }
        }
        if (_other.length < 3 && _other[0].length >= 3) {
            for (int i = 0; i < _other.length; i++) {
                for (int j = 0; j < _cellArray[0].length; j++) {
                    _cellArray[i][j] = _other[i][j];
                }
            }
        }
        if (_other.length < 3 && _other[0].length < 3) {
            for (int i = 0; i < _other.length; i++) {
                for (int j = 0; j < _other[0].length; j++) {
                    _cellArray[i][j] = _other[i][j];
                }
            }
        }
    }

    /**
     * third constructor, copy constructor gets a Square3x3 variables and creates another one with the same values
     * @param other a given Square3x3 parameter
     */
    public Square3x3(Square3x3 other) {
        for (int i = 0; i < _cellArray.length; i++) {
            for (int j = 0; j < _cellArray[0].length; j++) {
                this._cellArray[i][j] =  other._cellArray[i][j];
            }
        }
    }

    /**
     * returns the value of a given cel in the Square3x3
     * @param row the desired row
     * @param col the desired column
     * @return the integer inside the cell
     */
    public int getCell(int row, int col) {
        if (row > 2 || row < 0 || col > 2 || col < 0)
            return -1;
        return _cellArray[row][col];
    }

    /**
     * set a specific cell to a desired value
     * @param row the given row
     * @param col the given column
     * @param value the desired value to set to
     */
    public void setXY(int row, int col, int value) {
        if (!(row > 2 || row < 0 || col > 2 || col < 0))
            _cellArray[row][col] = value;
    }

    /**
     * returns a string representation of Square3x3
     * @return a string expression of Square3x3
     */
    @Override
    public String toString() {
        String arr = "";
        for (int i = 0; i < _cellArray.length; i++) {
            for (int j = 0; j < _cellArray[0].length; j++) {
                if (j!= _cellArray[0].length-1)
                    arr += _cellArray[i][j] + "\t";
                else
                    arr+=_cellArray[i][j]+"\n";
            }
        }
        return arr;
    }

    /**
     * checks if all the numbers between 1-9 are present in the Square3x3
     * @return true if all the numbers between 1-9 are present in the Square3x3
     */
    public boolean allThere() {
        int counter = 0;
        for (int temp = 1; temp < 10; temp++) {
            for (int i = 0; i < _cellArray.length; i++) {
                for (int j = 0; j < _cellArray[0].length; j++) {
                    // this way we don't double count
                    if (_cellArray[i][j] == counter + 1) {
                        counter++;
                    }
                }
            }
        }
        return counter == 9;
    }

    /**
     * gets a boolean array and a row and changes the array according to the corresponding numbers in the row
     * @param row a given row inside the Square3x3
     * @param values a boolean array size 10
     */
    public void whosThereRow(int row, boolean[] values) {
        if (!(row > 2 || row < 0)) {
            for (int temp = 1; temp < 10; temp++) {
                for (int i = 0; i < _cellArray[0].length; i++) {
                    if (_cellArray[row][i] == temp) {
                        values[temp] = true;
                    }
                }
            }
        }
    }

    /**
     gets a boolean array and a column and changes the array according to the corresponding numbers in the row
     * @param col a given column inside the Square3x3
     * @param values a boolean array size 10
     */
    public void whosThereCol(int col, boolean[] values) {
        if (!(col > 2 || col < 0)) {
            for (int temp = 1; temp < 10; temp++) {
                for (int i = 0; i < _cellArray.length; i++) {
                    if (_cellArray[i][col] == temp) {
                        values[temp] = true;
                    }
                }
            }
        }
    }
}
