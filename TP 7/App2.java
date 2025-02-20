import java.util.Scanner;
public class App2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl,nc,i,j,s,p;
        float m;
        do{
            System.out.println("Donner les linges");
            nl=sc.nextInt();
        }while( nl<0 || nl>30);
        do{
            System.out.println("Donner les Colons");
            nc=sc.nextInt();
        }while( nc<0 || nc>30);
        int[][] M = new int[nl][nc];
        System.out.println("Remplissez la matrice avec des entiers : ");
        s=0;
        p=1;
        for(i=0;i<nl;i++){
            for(j=0;j<nc;j++){
                System.err.println("M["+i+","+j+"]=");
                M[i][j]=sc.nextInt();
                s+=M[i][j];
                p+=*M[i][j];
            }
        }
        m=s/(nl*nc);
        System.out.println("La somme est :"+s);
        System.out.println("Le produit est :"+p);
        System.out.println("La moyenne est :"+m);
        sc.close();
    }
}