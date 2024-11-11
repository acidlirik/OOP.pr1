package sumarea;

public class TGeometricObject {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.0);

        GeometricObject largestCircle = GeometricObject.max(circle1, circle2);
        System.out.println("Наибольший круг: " + largestCircle);

        Rectangle rectangle1 = new Rectangle(4.0, 5.0);
        Rectangle rectangle2 = new Rectangle(3.0, 8.0);

        GeometricObject largestRectangle = GeometricObject.max(rectangle1, rectangle2);
        System.out.println("Наибольший прямоугольник: " + largestRectangle);
    }
}