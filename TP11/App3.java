import java.util.Scanner;
public class App3{
    public static int lectureN() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Donner la taille du tableau (n > 0) : ");
            n=sc.nextInt();
        } while (n<=0);
        return n;
    }
    public static void RemplirTAb(int[] t,int n) {
        Scanner sc=new Scanner(System.in);
        int i;
        for (i=0;i<n;i++) {
            do{
                System.out.print("T["+i+"]=");
                t[i]=sc.nextInt();
            }while(t[i]<0);
            
        }
    }
    public static void TabPair(int[] t, int[] tp,int n) {
        int i;
        int j;
        j=0;
        for (i=0;i<n;i++) {
            if(t[i]%2==0){
                tp[j]=t[i];
                j++;
            }
        }
    }
    public static void TabImpair(int[] t, int[] ti,int n) {
        int i;
        int j;
        j=0;
        for (i=0;i<n;i++) {
            if(t[i]%2!=0){
                ti[j]=t[i];
                j++;
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=lectureN();
        int[] t=new int[n];
        int[] tp=new int[n];
        int[] ti=new int[n];
        RemplirTAb(t,n);
        TabPair(t,tp,n);
        TabImpair(t,ti,n);
        AfficheTAb(t,n);
        AfficheTAb(tp,n);
        AfficheTAb(ti,n);
    }
}