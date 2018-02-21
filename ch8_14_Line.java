package ch8;
/*
Write a class called ch8_14_Line that represents a line segment between two Points.
Your ch8_14_Line objects should have the following methods:
public ch8_14_Line(Point p1, Point p2)
Constructs a new ch8_14_Line that contains the given two Points.
public Point getP1() - Returns this ch8_14_Line’s first endpoint.
public Point getP2() - Returns this ch8_14_Line’s second endpoint.
public String toString() - Returns a String representation of this ch8_14_Line, such as "[(22, 3), (4, 7)]".
 */
import java.awt.*;
public class ch8_14_Line {

    Point p1;
    Point p2;

    public ch8_14_Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "[" + p1 + ", " + p2 + "]";
    }

}
