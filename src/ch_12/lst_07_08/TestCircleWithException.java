package ch_12.lst_07_08;

public class TestCircleWithException {
    public static void main(String[] args) {
        try {
            CircleWithException c1 = new CircleWithException(5);
            CircleWithException c2 = new CircleWithException(-5);
            CircleWithException c3 = new CircleWithException(0);
        } catch (IllegalArgumentException iae) {
            System.out.println(iae);
        }

        System.out.println("Number of objects created: " + CircleWithException.getNumberOfObjects());
    }
}
