// Figura 6.12: DrawSmileyTest.java
// Aplicativo de teste que exibe um rosto sorridente.

package draw;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import draw.geometric.*;

public class DrawGeometricTest {
    public static void main(String[] args) {

        Point A = new Point();
        Point B = new Point();
        Point C = new Point();

        A.setCoordenates(30, 30);
        B.setCoordenates(30, 60);
        C.setCoordenates(70, 30);

        List<Point> points = new ArrayList<Point>();
        points.add(A);
        points.add(B);
        points.add(C);
        

        DrawGeometric panel = new DrawGeometric(points);

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(600, 600);
        application.setVisible(true); 

    }
} 