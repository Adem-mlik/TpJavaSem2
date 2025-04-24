import java.util.Scanner;
public class App2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,nb;
        double moy;
        n=methode.lectureN();
        double[] t=new double[n];
        methode.RemplirTAb2(t,n);
        moy=methode.Calcul_Moy(t,n);
        System.out.println("La moyenne de la classe est: "+moy);
        nb=methode.NombreNote(t,moy,n);
        System.out.println("Nombre de notes superieures a la moyenne est: "+nb);
    }
}