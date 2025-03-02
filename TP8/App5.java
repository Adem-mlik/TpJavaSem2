import java.util.Scanner;
public class App5 {
    public static void main(String[] args) {
        String ch,ch1;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre une chaine : ");
        ch=sc.nextLine();
        ch1="";
        for(i=0;i<ch.length();i++){
            ch1+=ch.charAt(i)+"*";
        }
        System.out.println("La chaine est: "+ch1);
        sc.close();
    }
}
