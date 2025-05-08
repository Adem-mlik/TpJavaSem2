import java.util.Scanner;
public class App1{
    public static int lecture() {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez un entier n: ");
        n=sc.nextInt();
        if (n>0) {
            return n;
        } else {
            System.out.println("Veuillez entrer un entier positif");
            return lecture();
        }
    }
    public static int sommeRec(int n) {
        if (n==1 || n==0) {
            return 1;
        } else{
            return n+sommeRec(n-1);
        }
    }

    public static void main(String[] args) {
        int n,s;
        n=lecture();
        s=sommeRec(n);
        System.out.println("La somme de 1 a "+n+" est : "+s);
    }
}
