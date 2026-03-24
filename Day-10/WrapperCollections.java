import java.util.*;

public class wrappercollections {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        list.add(Integer.valueOf(10));
        list.add(Double.valueOf(5.5));
        list.add(Character.valueOf('A'));

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
