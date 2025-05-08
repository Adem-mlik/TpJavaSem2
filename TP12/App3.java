import java.util.Scanner;
public class App3{
    public static int lecture() {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Entrez un entier strictement positif: ");
        n=sc.nextInt();
        if(n>0){
            return n;
        }
        else{
            System.out.println("Veuillez entrer un entier strictement positif.");
            return lecture();
        }
    }
    public static boolean estPremierRec(int n,int d) {
        if(d==1){
            return true;
        }
        if (n%d==0) {
            return false;
        }
        return estPremierRec(n,d-1);
    }
    public static void affiche(int n) {
        if(estPremierRec(n,n/2)) {
            System.out.println(n+" est une entier premier");
        }
        else{
            System.err.println(n+" n'est pas un nombre premier");
        }
    }

    public static void main(String[] args){
        int n;
        n=lecture();
        affiche(n);
    }
}
