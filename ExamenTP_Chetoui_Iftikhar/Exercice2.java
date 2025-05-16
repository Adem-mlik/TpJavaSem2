import java.util.Scanner;
public class Exercice2{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        char c,c1;
        double a;
        int i,j;
        String[][] VOL=new String[5][6];
        VOL[0][0]="NumVol";
        VOL[0][1]="VDep";
        VOL[0][2]="VDest";
        VOL[0][3]="CodeAv";
        VOL[0][4]="ClassAv";
        VOL[0][5]="PrixVol";
        VOL[1][0]="1";
        VOL[1][1]="Tozeur";
        VOL[1][2]="Djerba";
        VOL[1][3]="Ab01";
        VOL[1][4]="A1";
        VOL[1][5]="156";
        VOL[2][0]="2";
        VOL[2][1]="Tozeur";
        VOL[2][2]="Tunis";
        VOL[2][3]="Ab02";
        VOL[2][4]="A2";
        VOL[2][5]="250";
        VOL[3][0]="3";
        VOL[3][1]="Tunis";
        VOL[3][2]="Djerba";
        VOL[3][3]="Ab03";
        VOL[3][4]="A1";
        VOL[3][5]="140";
        VOL[4][0]="4";
        VOL[4][1]="Djerba";
        VOL[4][2]="Sfax";
        VOL[4][3]="Ab04";
        VOL[4][4]="A2";
        VOL[4][5]="120";
        System.out.println("Entrez la premiére lettre de la ville de destination : ");
        c=sc.next().charAt(0);
        for (i=1;i<5;i++){
            c1=VOL[i][2].charAt(0);
            if(c1==c){
                for (j=0;j<c;j++){
                    System.out.print(VOL[0][j]+": "+VOL[i][j]+" | ");
                
                }
            }
            System.out.println("");
        }
        System.out.println("Application dune remis de 20% sur tous les vols...");
        for (i=1;i<5;i++){
            a=Exercice1.Convertir(VOL[i][5]);
            a=a*0.8;
            VOL[i][5]=String.valueOf(a);
        }
        System.out.println("Tableau aprés remis: ");
        Exercice1.AfficheM(VOL,5,6);
    }
}