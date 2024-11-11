package sumarea;

public class TColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Circle(2.0),
                new Rectangle(3.0, 4.0),
                new Square(5.0),
                new ComparableRectangle(6.0, 7.0),
                new Square(8.0)
        };

        for (GeometricObject obj : objects) {
            System.out.println(obj);
            System.out.println("Площадь: " + obj.getArea());

            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println();
        }
    }
}