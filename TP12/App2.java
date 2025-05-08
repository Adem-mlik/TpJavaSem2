import java.util.Scanner;
public class App2{
    public static int lecture() {
        int n;
        Scanner sc=new Scanner(System.in);
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
    public static int factorielRec(int n) {
        if (n==1){
            return 1;
        } 
        else{
            return n*factorielRec(n-1);
        }
    }
    public static void main(String[] args) {
        int n,i;
        n=lecture();
        i=factorielRec(n);
        System.out.println("Le factoriel de "+n+" est: "+i);
    }
}
