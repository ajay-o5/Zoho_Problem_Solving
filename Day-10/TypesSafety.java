import java.util.ArrayList;
public class typesafety {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Java");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
