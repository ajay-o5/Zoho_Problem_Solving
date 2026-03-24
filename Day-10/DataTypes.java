public class datatypes {
    public static <T> void genericDisplay(T element) {
        System.out.println("Data Type: " + element.getClass().getName() + " | Value: " + element);
    }

    public static void main(String[] args) {
        genericDisplay(2906); 
        genericDisplay("Hello Zoho!"); 
        genericDisplay(9.05); 
    }
}
