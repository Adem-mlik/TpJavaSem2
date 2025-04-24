import java.util.Scanner;
public class App1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,x,y;
        n=methode.lectureN();
        int[] t=new int[n];
        methode.RemplirTAb(t,n);
        System.out.print("Entrez la valeur a remplacer: ");
        x=sc.nextInt();
        System.out.print("Entrez la nouvelle valeur: ");
        y=sc.nextInt();
        methode.Remplacer(t,x,y,n);
        methode.AfficheTAb(t,n);
    }
}