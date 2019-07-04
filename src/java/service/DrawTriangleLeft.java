package service;

import java.util.Arrays;

public class DrawTriangleLeft implements DrawTriangle {

    private String[][] triangleMatrix;

    @Override
    public String[][] crateTriangle(Integer rows) {
        triangleMatrix = new String[rows][rows*2];
        fillMatrix(rows);
        return triangleMatrix;
    }

    private void fillMatrix(Integer rows) {
        for(int i = 0 ; i <rows; i++) {
            for(int j = 0 ; j<rows*2;j++) {
                if(j<rows-i || j>=rows+i){
                    triangleMatrix[i][j] = "_";
                }else {
                    triangleMatrix[i][j] = "*";
                }
            }
        }
    }
}
