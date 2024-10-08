package MOV;

public class MCircle implements Movable {
    private int radius;
    private MPoint center;
    public MCircle(int radius, MPoint center) {
        this.radius = radius;
        this.center = center;
    }
    public void moveUp(){
        this.center.moveUp();
    }
    public void moveDown(){
        this.center.moveDown();
    }
    public void moveLeft(){
        this.center.moveLeft();
    }
    public void moveRight(){
        this.center.moveRight();
    }

    @Override
    public String toString() {
        return "UIBO0322.MCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
