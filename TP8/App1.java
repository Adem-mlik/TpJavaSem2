import java.util.Scanner;

public class App1{
    public static void main(String[] args) {
        String ch;
        char car;
        int c,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre une chaine: ");
        ch=sc.nextLine();
        System.out.print("Entre un caractere: ");
        car=sc.next().charAt(0);
        c=0;
        for (i=0;i<ch.length();i++){
            if (ch.charAt(i)==car){
                c++;
            }
        }
        System.out.println("Le caractere : "+car+" apparait "+c+" fois dans la chaine");
        sc.close();
    }
}
