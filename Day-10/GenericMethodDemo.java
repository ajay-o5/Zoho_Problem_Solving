public class genericmethoddemo {
    public static <T> void printValue(T value) {
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        printValue(10);
        printValue("Java");
        printValue(5.5);
    }
}
