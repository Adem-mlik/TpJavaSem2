import java.util.Scanner;
public class App1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String te,ch,ch1;
        int i;
        do{
            System.out.println("Donner le text: ");
            te=sc.nextLine();
        }while(te.length()>50);
        do{
            System.out.println("Donner le mot a remplacer: ");
            ch=sc.nextLine();
        }while(ch.length()>10);
        do{
            System.out.println("Donner le mot a remplacement: ");
            ch1=sc.nextLine();
        }while(ch1.length()>10);
        StringBuffer te1 = new StringBuffer(te);
        i = te1.indexOf(ch);
        while (i != -1) {
            te1.replace(i, i + ch.length(), ch1);
            i = te1.indexOf(ch);
        }
        System.out.println(te1);
        sc.close();
    }
}