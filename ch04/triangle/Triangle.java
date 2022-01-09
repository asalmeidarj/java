/**
 * Classe Triângulo permite criar objetos triângulos e
 * métodos que fazem algumas operações elementares como:
 * calcular medidas dos lados, perímetro, baricentro, etc.
 * 
 * Obs.: Para tais métodos foi preciso utilizar classe auxiliares
 * para os cálculos de matrizes e até mesmo de análise combinatória. 
 * Para o cálculo da área do triângulo foi usado geometria analítica
 * o qual utiliza alguns teoremas de algebrar linear
 * envolvendo matrizes.
 * 
 * Autor: Alessandro Almeida
 */

 
package ch04.triangle;

import java.util.ArrayList;
import java.util.List;

import utils.*;

public class Triangle extends Point {
    private Point pointA;
    private Point pointB;
    private Point pointC;


    public Triangle(Point A, Point B, Point C){
        this.pointA = A;
        this.pointB = B;
        this.pointC = C;
    }

    public void setPointA(int coordenateX, int coordenateY){
        this.pointA.setCoordenateX(coordenateX);
        this.pointA.setCoordenateY(coordenateY);
    }
    public void setPointB(int coordenateX, int coordenateY){
        this.pointB.setCoordenateX(coordenateX);
        this.pointB.setCoordenateY(coordenateY);
    }
    public void setPointC(int coordenateX, int coordenateY){
        this.pointC.setCoordenateX(coordenateX);
        this.pointC.setCoordenateY(coordenateY);
    }


    public Point getPointA(){
        return this.pointA;
    }
    public Point getPointB(){
        return this.pointB;
    }
    public Point getPointC(){
        return this.pointC;
    }

    public Point midPoint(Point one, Point two){
        Point M = new Point();
        M.setCoordenateX((one.getCoordenateX() + two.getCoordenateX()) / 2);
        M.setCoordenateY((one.getCoordenateY() + two.getCoordenateY()) / 2);
        return M;
    }

    public Point baryCenter(){
        //coordenadas dos vértices do triângulo
        double xA = this.pointA.getCoordenateX();
        double yA = this.pointA.getCoordenateY();
        double xB = this.pointB.getCoordenateX();
        double yB = this.pointB.getCoordenateY();
        double xC = this.pointC.getCoordenateX();
        double yC = this.pointC.getCoordenateY();

        // Criando o ponto baricentro e definindo as coordenadas
        Point G = new Point();
        G.setCoordenateX((xA + xB + xC) / 3);
        G.setCoordenateY((yA + yB + yC) / 3);

        return G;
    }

    public double area(){
        return Math.abs(this.matrixArea().determinant() / 2);
    }

    private Matrix matrixArea(){
        List<Point> points = new ArrayList<Point>();
        points.add(this.pointA);
        points.add(this.pointB);
        points.add(this.pointC);

        Matrix matrix = new Matrix(3, 3);

        for (int i = 0; i < 3; i++) {
            Point point = points.get(i);
            matrix.setElement(point.getCoordenateX(), i, 0);
            matrix.setElement(point.getCoordenateY(), i, 1);
            matrix.setElement(1, i, 2);
        }

        return matrix;
    }

    public double perimeter(){
        return this.AB_lenght() + this.AC_lenght() + this.BC_lenght();
    }

    public double AB_lenght(){
        return this.distance(this.pointA, this.pointB);
    }
    public double AC_lenght(){
        return this.distance(this.pointA, this.pointC);
    }
    public double BC_lenght(){
        return this.distance(this.pointB, this.pointC);
    }

    private double distance(Point one, Point two){
        // coordenadas dos pontos
        double xa = one.getCoordenateX();
        double ya = one.getCoordenateY();
        double xb = two.getCoordenateX();
        double yb = two.getCoordenateY();

        // aplicação da fórmula da distância entre dois pontos
        // quadrado das diferenças das coordenadas X's e Y's.
        double difSquareX = Math.pow(xa - xb, 2);
        double difSquareY = Math.pow(ya - yb, 2);
        // raiz quadrada da soma dos quadrados
        double distance = Math.sqrt(difSquareX + difSquareY);
        
        return distance;
    }


}
