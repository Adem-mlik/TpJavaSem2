import java.util.Scanner;
public class methode{
    public static int lectureN() {
        int n;
        Scanner sc=new Scanner(System.in);
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n=sc.nextInt();
        }while(n<=0);
        return n;
    }
    public static void RemplirTAb(int[] t,int n) {
        Scanner sc=new Scanner(System.in);
        int i;
        for (i=0;i<n;i++) {
            System.out.print("T["+i+"]=");
            t[i]=sc.nextInt();
        }
    }
    public static void Remplacer(int[] t,int x,int y, int n) {
        int i;
        for(i=0;i<n;i++) {
            if (t[i]==x) {
                t[i]=y;
            }
        }
    }
    public static void AfficheTAb(int[] t,int n) {
        int i;
        for (i=0;i<n;i++){
            System.out.print("T["+i+"]="+t[i]);
        }
        System.out.println();
    }
    public static void RemplirTAb2(double[] t, int n) {
        int i;
        Scanner sc=new Scanner(System.in);
        for (i=0;i<n;i++){
            do {
                System.out.print("Entrez la note de l'etudiant: ");
                t[i]=sc.nextDouble();
            } while (t[i]<0 || t[i]>20);
        }
    }
    public static double Calcul_Moy(double[] t, int n) {
        double s;
        int i;
        s=0;
        for (i=0;i<n;i++){
            s+=t[i];
        }
        return s/n;
    }
    public static int NombreNote(double[] t, double moy,int n) {
        int i,nb;
        nb=0;
        for (i=0;i<n;i++){
            if (t[i]>moy) {
                nb++;
            }
        }
        return nb;
    }
}