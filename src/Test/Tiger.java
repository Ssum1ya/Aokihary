package Test;

public class Tiger extends Animal {

    public Tiger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    void makeNoise() {
        System.out.println("RRRRRR");
    }

    @Override
    void eat() {
        System.out.println("Я питаюсь мясом");
    }

    @Override
    void sleep() {
        System.out.println("Tiger is sleeping");
    }
}
