import java.util.Scanner;
public class App5{
    public static String lecture(){
        String ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez une chaine: ");
        ch=sc.nextLine();
        if(ch.length()<=50){
            return ch;
        }
        else{
            System.out.println("La chaine ne doit pas depasser 50 caracteres");
            return lecture();
        }
    }
    public static char Caractere() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez un caractere a rechercher: ");
        return sc.next().charAt(0);
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
    public static void main(String[] args) {
        String ch;
        char c;
        int n;
        ch=lecture();
        c=Caractere();
        n=nbrOccRec(c,ch,0);
        System.out.println("Le caractere '"+c+"' apparait "+n+" fois dans la chaine");
    }
}
