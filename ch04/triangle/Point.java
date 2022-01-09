package ch04.triangle;

public class  Point {
    private double coordenateX;
    private double coordenateY;

    protected void setCoordenates(double coordenateX, double coordenateY){
        setCoordenateX(coordenateX);
        setCoordenateY(coordenateY);
    }

    protected void setCoordenateX(double coordenateX) {
        this.coordenateX = coordenateX;
    }
    protected void setCoordenateY(double coordenateY) {
        this.coordenateY = coordenateY;
    }

    public double getCoordenateX(){
        return this.coordenateX;
    }
    public double getCoordenateY(){
        return this.coordenateY;
    }
}
