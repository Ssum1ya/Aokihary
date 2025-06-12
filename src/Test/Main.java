package Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test("Bob", 15);
        System.out.println(test.toString());
        Object testObj = new Test("Peter", 20);
        System.out.println(testObj.toString());
    }
}
