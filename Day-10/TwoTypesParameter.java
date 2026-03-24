import java.util.*;
class TwoGeneric<T, U> {
    T obj1;
    U obj2;

    TwoGeneric(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    void display() {
        System.out.println("T: " + obj1);
        System.out.println("U: " + obj2);
    }
}

public class twotypeparameter {
    public static void main(String[] args) {
        TwoGeneric<Integer, String> obj = new TwoGeneric<>(10, "Java");
        obj.display();
    }
}
