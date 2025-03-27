public class Rectangle {
    public double width, height;

    public Rectangle(double w, double h) {
        width = w;
        height = h;

    }
    double getArea(double w, double h) {
        double rectangle1w = 4;
        double rectangle1h = 40;
        double rectangle1a = rectangle1w * rectangle1h;
        return rectangle1a;
    }
    double getPerimeter(double w, double h) {
        double rectangle1w = 4;
        double rectangle1h = 40;
        double rectangle1p = (rectangle1w * 2) + (rectangle1h * 2);
        return rectangle1p;
    }
    double getArea2(double w, double h) {
        double rectangle2w = 3.5;
        double rectangle2h = 39.5;
        double rectangle2a = rectangle2w * rectangle2h;
        return rectangle2a;
    }
    double getPerimeter2(double w, double h) {
        double rectangle2w = 3.5;
        double rectangle2h = 39.5;
        double rectangle2p = (rectangle2w * 2) + (rectangle2h * 2);
        return rectangle2p;
    }
}
