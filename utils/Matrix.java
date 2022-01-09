/**
 * Classe de Matrizes contendo algumas operações elementares
 * com matrizes.
 */
package utils;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
    private int numberColumn = 0;
    private int numberLine = 0;
    private int numberElement = 0; 
    private int order = 0;
    private String type;
    private double[][] elements;
    private double ValueDeterminant;
    

    public Matrix(int numberLine, int numberColumn) {
        if(numberLine > 0 && numberColumn > 0) {
            this.numberLine = numberLine;
            this.numberColumn = numberColumn;
            this.numberElement = numberLine * numberColumn;
            this.type = "" + numberLine + "x" + numberColumn;
            
            this.elements = new double[numberLine][numberColumn];
        }
        
        if(numberLine == numberColumn) {
            this.order = numberLine;
        }
    }

    public int getNumberColumn() {
        return this.numberColumn;
    }    
    public int getNumberLine() {
        return this.numberLine;
    }
    public int getNumberElement() {
        return this.numberElement;
    }
    public String getType() {
        return this.type;
    }
    public int getOrder() {
        return this.order;
    }
    public List<List<Double>> getElements(){
        List<List<Double>> list = new ArrayList<>();
        for(int i = 0; i < this.elements.length; i++){
            List<Double> line = new ArrayList<>();
            for(int j = 0; j < this.elements[i].length; j++){
                line.add(this.elements[i][j]);
            }
            list.add(line);
        }
        return list;
    }

    public void setElement(double value, int positionLine, int positionColumn){
        this.elements[positionLine][positionColumn] = value;
    }

    public double determinant(){
        this.calcDeterminant();
        return this.ValueDeterminant;
    }

    public void calcDeterminant(){
        if(this.order < 1){
            return;
        }

        double det = 0;

        CombinatorialAnalysis calc = new CombinatorialAnalysis();
        List<List<Integer>> marks = calc.permutationsN(order);

        for (List<Integer> positions : marks) {
            int numbInversion = calc.inversions(positions);
            double factor = Math.pow(-1, numbInversion);
            double product = 1 * factor;

            int i = 0;
            for (Integer pos : positions) {
                product *= this.elements[i][pos-1];
                i++;
            }

            det += product;
        }

        this.ValueDeterminant = det;
    }

    public boolean isSquare() {
        if(this.order > 0){
            return true;
        }
        return false;
    }


}
