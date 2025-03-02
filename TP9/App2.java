import java.util.Scanner;
public class App2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        int i;
        char c,c1;
        do{
            System.out.println("Donner le text: ");
            ch=sc.nextLine();
        }while(ch.length()>30);
        StringBuffer ch1 = new StringBuffer(ch);
        for (i = 0; i < ch1.length(); i++) {
            c = ch1.charAt(i);
            c1 =(char) (c + 3); 
            ch1.setCharAt(i, c1);
        }
        System.out.println(ch1);
        sc.close();
    }
}