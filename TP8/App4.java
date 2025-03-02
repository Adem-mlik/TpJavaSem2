import java.util.Scanner;
public class App4 {
    public static void main(String[] args) {
        String ch,ch1;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("Entre une chaine: ");
        ch=sc.nextLine();
        ch1="";
        for(i=0;i<ch.length();i++){
            ch1=ch.charAt(i)+ch1;
        }
        System.out.println("La chaine inversee est "+ch1);
        sc.close();
    }
}
