import java.util.Scanner;
public class Ex1{
    public static double CalculSomme(double[] t,int n) {
        int i;
        double s;
        s=0;
        for(i=0;i<n;i++){
            s=s+t[i];
        }
        return s;
    }
    public static void incri(double[] t,int n,double x) {
        int i;
        for (i=0;i<n;i++) {
            t[i]+=x;
        }
    }
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner la taille du tableau (n > 0) : ");
            n=sc.nextInt();
        } while (n<=0);
        return n;
    }
    public static void RemplirTAb(double[] t, int n) {
        int i;
        Scanner sc=new Scanner(System.in);
        for (i=0;i<n;i++){
            do {
                System.out.print("Entrez la note de l'etudiant: ");
                t[i]=sc.nextDouble();
            } while (t[i]<0 || t[i]>20);
        }
    }
    public static void AfficheTAb(double[] t,int n) {
        int i;
        for (i=0;i<n;i++){
            System.out.print("T["+i+"]="+t[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x;
        double s;
        n=lectureN();
        double[] t=new double[n];
        RemplirTAb(t,n);
        s=CalculSomme(t,n);
        System.out.print("Donner un nombre: ");
        x=sc.nextInt();
        incri(t,n,x);
        AfficheTAb(t,n);
    }
}