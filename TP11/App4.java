import java.util.Scanner;
public class App4{
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner la taille du tableau (n > 0) : ");
            n=sc.nextInt();
        } while (n<=0);
        return n;
    }
    public static void RemplirTAb(int[][] m,int n1,int n2) {
        Scanner sc=new Scanner(System.in);
        int i;
        int j;
        for (i=0;i<n1;i++) {
            for (j=0;j<n2;j++){
                System.out.print("T["+i+","+j+"]=");
                m[i][j]=sc.nextInt();
            }
        }
    }
    public static int CalculSomme(int[][] m,int n2,int i) {
        int s,j;
        s=0;
        for(j=0;j<n2;j++){
            s=s+m[i][j];
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1,n2,s,i;
        n1=lectureN();
        n2=lectureN();
        int[][] m=new int[n1][n2];
        RemplirTAb(m,n1,n2);
        System.out.print("Donner un line: ");
        i=sc.nextInt();
        s=CalculSomme(m,n2,i);
        System.out.println("La some de la line "+i+" est "+s);
    }
}