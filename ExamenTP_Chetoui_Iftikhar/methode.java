import java.util.Scanner;
public class methode{
    public static int lectureRec() {
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
    public static String lectureCh() {
        String ch;
        Scanner sc =new Scanner(System.in);
        System.out.print("Entrez une chaine: ");
        ch=sc.nextLine();
        if (ch.length()<=30) {
            return ch;
        }
        else{
            System.out.println("La chaine ne doit pas depasser 30 caracteres");
            return lecture();
        }
    }
    public static char lectureCara() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un caractere a rechercher: ");
        return sc.next().charAt(0);
    }
    public static void RemplirTAb(int[] t,int n) {
        int[] t =new int[n];
        Scanner sc=new Scanner(System.in);
        int i;
        for (i=0;i<n;i++) {
            System.out.print("T["+i+"]=");
            t[i]=sc.nextInt();
        }
    }
    public static void remplirMatrice(int[][] m,int l, int c) {
        int[][] m=new int[l][c];
        Scanner sc=new Scanner(System.in);
        int i,j;
        for (i=0;i<l;i++) {
            for (j=0;j<c;j++) {
                System.out.print("M["+i+","+j+"]");
                m[i][j]=sc.nextInt();
            }
        }
    }
    public static int sommeTabRec(int[] t, int i) {
        if (i==t.length) {
            return 0;
        }
        return t[i]+sommeTabRec(t,i+1);
    }
    public static void Remplacer(int[] t,int x,int y, int n) {
        int i;
        for(i=0;i<n;i++) {
            if (t[i]==x) {
                t[i]=y;
            }
        }
    }
    public static int sommeRec(int n) {
        if (n==1 || n==0) {
            return 1;
        } else{
            return n+sommeRec(n-1);
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
    public static boolean estPremierRec(int n,int d) {
        if(d==1){
            return true;
        }
        if (n%d==0) {
            return false;
        }
        return estPremierRec(n,d-1);
    }
    public static boolean palindromeRec(String ch,int d,int f) {
        if (d>=f) {
            return true;
        }
        if (ch.charAt(d)!=ch.charAt(f)) {
            return false;
        }
        return palindromeRec(ch,d+1,f-1);
    }
    public static int nbrOccRec(char c,String m,int i) {
        if(i==m.length()) {
            return 0;
        }
        if(m.charAt(i)==c) {
            return 1+nbrOccRec(c,m,i+1);
        }
        return nbrOccRec(c,m,i+1);
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
    public static void affiche(int n) {
        if(estPremierRec(n,n/2)) {
            System.out.println(n+" est une entier premier");
        }
        else{
            System.err.println(n+" n'est pas un nombre premier");
        }
    }
    public static void AfficheTAb(int[] t,int n) {
        int i;
        for (i=0;i<n;i++){
            System.out.print("T["+i+"]="+t[i]);
        }
        System.out.println();
    }
}
