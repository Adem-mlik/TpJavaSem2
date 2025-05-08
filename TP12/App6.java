import java.util.Scanner;
public class App6{
    public static int lecture() {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la taille du tableau: ");
        n=sc.nextInt();
        if (n>0){
            return n;
        }
        else{
            System.out.println("La taille du tableau doit etre >0");
            return lecture();
        }
    }
    public static void RemplirTAb(int[] t,int n) {
        Scanner sc=new Scanner(System.in);
        int i;
        for (i=0;i<n;i++) {
            System.out.print("T["+i+"]=");
            t[i]=sc.nextInt();
        }
    }
    public static int sommeTabRec(int[] t, int i) {
        if (i==t.length) {
            return 0;
        }
        return t[i]+sommeTabRec(t,i+1);
    }
    public static void main(String[] args) {
        int n,s;
        n=lecture();
        int[] t =new int[n];
        RemplirTAb(t,n);
        s=sommeTabRec(t,0);
        System.out.println("La somme des elements est:"+s);
    }
}
