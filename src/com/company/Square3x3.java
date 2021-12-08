package com.company;

/**
 *
 */
public class Square3x3
{
    /**
     *
     */
    private final int [][] _cellArray = new int[3][3];

    /**
     *
     */
    public Square3x3 (){
        for (int i = 0; i< _cellArray.length; i++){
            for (int j = 0; j< _cellArray[0].length; j++){
                _cellArray[i][j]=1;
            }
        }
    }

    /**
     *
     * @param _other
     */
    public Square3x3 (int [][] _other){
        for (int i = 0; i< _cellArray.length; i++){
            for (int j = 0; j< _cellArray[0].length; j++){
                _cellArray[i][j]=-1;
            }
        }
        if (_other.length>=3&&_other[0].length>=3) {
            for (int i = 0; i < _cellArray.length; i++) {
                for (int j = 0; j < _cellArray[0].length; j++) {
                    _cellArray[i][j] = _other[i][j];
                }
            }
        }
        if (_other.length>=3&&_other[0].length<3) {
            for (int i = 0; i < _cellArray.length; i++) {
                for (int j = 0; j < _other[0].length; j++) {
                    _cellArray[i][j] = _other[i][j];
                }
            }
        }
        if (_other.length<3&&_other[0].length>=3) {
            for (int i = 0; i < _other.length; i++) {
                for (int j = 0; j < _cellArray[0].length; j++) {
                    _cellArray[i][j] = _other[i][j];
                }
            }
        }
        if (_other.length<3&&_other[0].length<3) {
            for (int i = 0; i < _other.length; i++) {
                for (int j = 0; j < _other[0].length; j++) {
                    _cellArray[i][j] = _other[i][j];
                }
            }
        }
    }

    /**
     *
     * @param other
     */
    public Square3x3 (Square3x3 other){
        for (int i = 0; i< _cellArray.length; i++){
            for (int j = 0; j< _cellArray[0].length; j++){
                this._cellArray[i][j]=other._cellArray[i][j];
            }
        }
    }

    /**
     *
     * @param row
     * @param col
     * @return
     */
    public int getCell(int row ,int col){
        return _cellArray[row][col];
    }

    /**
     *
     * @param row
     * @param col
     * @param value
     */
    public void setXY(int row,int col,int value){
        _cellArray[row][col]=value;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        String arr="";
        for (int i = 0; i< _cellArray.length; i++){
            arr+="\n";
            for (int j = 0; j< _cellArray[0].length; j++){
                arr+= _cellArray[i][j]+" ";
            }
        }
        return arr;
    }

    /**
     *
     * @return
     */
    public boolean allThere(){
        int counter =0;
        for (int temp=1;temp<10;temp++){
            for (int i = 0; i< _cellArray.length; i++){
                for (int j = 0; j< _cellArray[0].length; j++) {
                    // this way we don't double count
                    if (_cellArray[i][j] == counter+1) {
                        counter++;
                    }
                }
            }
        }
        return counter == 9;
    }

    /**
     *
     * @param row
     * @param values
     */
    public void whosThereRow(int row,Boolean[] values){

        for (int temp=1;temp<10;temp++){
            for (int i = 0; i< _cellArray[0].length; i++) {
                if (_cellArray[row][i] == temp) {
                    values[3*row+i]=true;
                }
            }
        }
    }
    public void whosThereCol(int col,Boolean[] values){

        for (int temp=1;temp<10;temp++){
            for (int i = 0; i< _cellArray.length; i++) {
                if (_cellArray[i][col] == temp) {
                    values[3*col+i]=true;
                }
            }
        }
    }
}
