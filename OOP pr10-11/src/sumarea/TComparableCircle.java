package sumarea;

public class TComparableCircle {
    public static void main(String[] args) {
        ComparableCircle comparableCircle1 = new ComparableCircle(5.0);
        ComparableCircle comparableCircle2 = new ComparableCircle(7.0);

        GeometricObject largestComparableCircle = GeometricObject.max(comparableCircle1, comparableCircle2);
        System.out.println("Наибольший из двух кругов tasks_1_to_3.ComparableCircle: " + largestComparableCircle);

        ComparableCircle circle = new ComparableCircle(6.0);
        Rectangle rectangle = new Rectangle(4.0, 5.0);

        GeometricObject largestShape = GeometricObject.max(circle, rectangle);
        System.out.println("Наибольший объект между кругом и прямоугольником: " + largestShape);
    }
}