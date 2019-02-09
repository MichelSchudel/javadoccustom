package nl.craftsmen.javadoc;

public class MyTestClass {

    private int aNumber;

    public MyTestClass(int aNumber) {
        this.aNumber = aNumber;
    }

    public void print() {
        System.out.println(this.aNumber);
    }

    public static MyTestClass of(int aNumber) {
        return new MyTestClass(aNumber);
    }
}
