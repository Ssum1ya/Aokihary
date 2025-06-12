package Test;

public class Test {
    private String name;
    private int age;

    public Test(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "My name is " + name + ", my age is " + age;
    }
}
