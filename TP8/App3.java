import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        String ch;
        boolean pal;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre une chaine: ");
        ch=sc.nextLine();
        pal=true;
        for(i=0;i<ch.length()/2;i++){
            if (ch.charAt(i)!=ch.charAt(ch.length()-1-i)){
                pal=false;
            }
        }
        if (pal) {
            System.out.println("La chaine est un palindrome");
        } else {
            System.out.println("La chaine n'est pas un palindrome");
        }
        sc.close();
    }
}
