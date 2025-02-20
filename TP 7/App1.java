import java.util.Scanner;
public class App1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nl,nc,i,j,x;
        boolean trouve;
        do{
            System.out.println("Donner les linges");
            nl=sc.nextInt();
        }while( nl<0 || nl>50);
        do{
            System.out.println("Donner les Colons");
            nc=sc.nextInt();
        }while( nc<0 || nc>50);
        int[][] M = new int[nl][nc];
        System.out.println("Remplissez la matrice avec des entiers pairs : ");
        for(i=0;i<nl;i++){
            for(j=0;j<nc;j++){
                do{
                    System.err.println("M["+i+","+j+"]=");
                    M[i][j]=sc.nextInt();
                }while(M[i][j]%2!=0);
            }
        }
        do{
            System.out.println("Donner X");
            x=sc.nextInt();
        }while(x%2!=0);    
        trouve=false;
        for(i=0;i<nl;i++){
            for(j=0;j<nc;j++){
                if(M[i][j]==x){
                    System.out.println("X trouve a la position ("+i+","+j+")");
                    trouve=true;
                }
            }
        }
        if(!trouve){
            System.out.println("X n'est pas dans le matrice");
        }
        sc.close();
    }
}