public class integermethods {
    public static void main(String[] args) {
        String str = "100";

        int num1 = Integer.parseInt(str);
        Integer num2 = Integer.valueOf(str);
        String str2 = Integer.toString(num1);

        System.out.println("parseInt(): " + num1);
        System.out.println("valueOf(): " + num2);
        System.out.println("toString(): " + str2);
    }
}
