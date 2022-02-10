package draw;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import draw.geometric.*;

public class DrawGeometric extends JPanel {

    List<Point> points = new ArrayList<>();
    Color myColor = new Color(255, 0, 0);
       
    public DrawGeometric(List<Point> points){
        this.points = points;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(myColor);
        drawPolygon(this.points, g);
    }

    public void drawPolygon(List<Point> points, Graphics g){
        int[] xPoints = new int[points.size()];
        int[] yPoints = new int[points.size()];
        for(int i = 0; i < points.size(); i++){           
            xPoints[i] = (int) points.get(i).getCoordenateX();
            yPoints[i] = (int) points.get(i).getCoordenateY();
        }

        g.fillPolygon(xPoints, yPoints, points.size());
    }
}
