import java.util.Scanner;
public class Methode{
    public static int Lecture() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Entrez un entier strictement positif: ");
            n=sc.nextInt();
        }while (n<=0);
        return n;
    }
    public static int Compter(int n) {
        return String.valueOf(n).length();
    }
    public static double addition(int a, int b) {
        return a+b;
    }

    public static double soustraction(int a, int b) {
        return a-b;
    }

    public static double multiplication(int a, int b) {
        return a*b;
    }

    public static double division(int a, int b) {
        if (b==0){
            System.out.println("Division imposible");
        }
        return a/b;
    }
    public static boolean inf(String v) {
        return v.endsWith("er") || v.endsWith("ir") || v.endsWith("re") || v.endsWith("oir");
    }
    public static int groupe(String v) {
        if (v.equals("aller")) {
            return 3;
        } else if (v.endsWith("er")) {
            return 1;
        } else if (v.endsWith("ir")) {
            return 2;
        } else {
            return 3;
        }
    }
}