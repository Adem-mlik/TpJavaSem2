public class Exercice1{
    public static double Convertir(String ch){
        double s;
        s=Double.parseDouble(ch);
        return s;
    }
    public static void AfficheM(String [][] t,int l,int c) {
        int i,j;
        for (i=1;i<l;i++){
            for (j=0;j<c;j++){
                System.out.print(t[0][j]+": "+t[i][j]+" | ");
                
            }
            System.out.println("");
        }
    }
}