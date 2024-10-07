package MOV;

public class TestM {
    public static void main(String[] args) {
        Movable bruh = new MCircle(3, new MPoint(55,3,16,228));
        System.out.println(bruh);
        bruh.moveLeft();
        bruh.moveUp();
        System.out.println(bruh);
    }
}
