import java.util.Scanner;
public class App3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl,nc,i,j,s,m,mi;
        do{
            System.out.println("Donner les linges");
            nl=sc.nextInt();
        }while( nl<0 || nl>=20);
        do{
            System.out.println("Donner les Colons");
            nc=sc.nextInt();
        }while( nc<0 || nc>=30);
        int[][] M = new int[nl][nc];
        int[] T = new int[nc];
        System.out.println("Remplissez la matrice avec des entiers : ");
        for(i=0;i<nl;i++){
            s=0;
            for(j=0;j<nc;j++){
                System.err.println("M["+i+","+j+"]=");
                M[i][j]=sc.nextInt();
                s=s+M[i][j];
            }
            T[i]=s;
        }
        mi=T[0];
        m=T[0];
        for(i=1;i<nl;i++){
            if(T[i]<mi){
                mi=T[i];
            }
            if(T[i]>m){
                m=T[i];
            }
        }
        System.out.println("Le maximum des sommes est :"+m);
        System.out.println("Le minimum des sommes est :"+mi);
        sc.close();
    }
}