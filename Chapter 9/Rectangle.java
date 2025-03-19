public class Rectangle {
    public double width, height;

    //constructor
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    double getArea(double w, double h) {
        return w * h;
    }
    double getPerimeter(double w, double h) {
        return (w * 2) + (h * 2);
    }
}
