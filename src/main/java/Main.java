/**
 * Created by barriosj on 2/1/17.
 */
import org.objectweb.asm.*;

public class Main {

    public static void maina(String[] args){
        printOne();
        printTwo();
        printTwo();
    }

    public static void printOne() {
        System.out.println("Hello World");
    }

    public static void printTwo() {
        printOne();
        printOne();
    }
}
