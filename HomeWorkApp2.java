package lesson1;
import java.util.Scanner;
public class HomeWorkApp2 {
    public static void main(String[] args) {
        info();
        pered();
        cel();
        raz();
    }

    public static void info() {
        int a = 10;
        int b = 2;
        if (a + b < 10 || a + b > 20) System.out.println(false);
        else System.out.println(true);
    }

    public static void pered() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a >= 0) System.out.println("положительное число");
        else System.out.println("число отрицательное");

    }

    public static void cel() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a >= 0) System.out.println("true");
        else System.out.println("false");
    }

    public static void raz() {
        int count = 0;
        Scanner s = new Scanner(System.in);
        int times = s.nextInt();
        while (count < times) {
            System.out.println("привет");
            count++;
        }
    }


}