import java.util.Scanner;
public class App4{
    public static String lecture() {
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
    public static boolean palindromeRec(String ch,int d,int f) {
        if (d>=f) {
            return true;
        }
        if (ch.charAt(d)!=ch.charAt(f)) {
            return false;
        }
        return palindromeRec(ch,d+1,f-1);
    }
    public static void main(String[] args){
        String ch;
        ch=lecture();
        if(palindromeRec(ch,0,ch.length()-1)){
            System.out.println("La chaine "+ch+" est un palindrome");
        } else {
            System.out.println("La chaine "+ch+" n'est pas un palindrome");
        }
    }
}
