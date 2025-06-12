package Test;

public abstract class Human implements MoveAble{
    public String name;
    public int age;
    public int x;
    public int y;

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
