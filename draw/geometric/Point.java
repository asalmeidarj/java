package draw.geometric;

public class  Point {
    private double coordenateX;
    private double coordenateY;

    public void setCoordenates(double coordenateX, double coordenateY){
        setCoordenateX(coordenateX);
        setCoordenateY(coordenateY);
    }

    public void setCoordenateX(double coordenateX) {
        this.coordenateX = coordenateX;
    }
    public void setCoordenateY(double coordenateY) {
        this.coordenateY = coordenateY;
    }

    public double getCoordenateX(){
        return this.coordenateX;
    }
    public double getCoordenateY(){
        return this.coordenateY;
    }
}
