package Test;

abstract public class Animal implements MoveAble{
    public String name;
    public int age;
    public int x;
    public int y;

    abstract void makeNoise();
    abstract void eat();
    void sleep() {
        System.out.println("Animal is sleeping");
    };

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
