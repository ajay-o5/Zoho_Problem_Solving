package oopsassignment;
import java.util.*;
interface Camera {
    void click();
}

interface MusicPlayer {
    void play();
}

class Smartphone implements Camera, MusicPlayer {
    public void click() {
        System.out.println("Photo Clicked");
    }

    public void play() {
        System.out.println("Music Playing");
    }
}

public class MultipleInterfaceTest {
    public static void main(String[] args) {
        Smartphone s = new Smartphone();
        s.click();
        s.play();
    }
}
