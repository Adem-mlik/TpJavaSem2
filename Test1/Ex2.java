import java.util.Scanner;
public class Ex2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        double r;
        char op;
        System.out.print("Entrez le premier nombre: ");
        a=sc.nextInt();
        System.out.print("Entrez le second nombre: ");
        b=sc.nextInt();
        System.out.print("Choisissez l'opération (+, -, *, /) : ");
        op=sc.next().charAt(0);
        r=0;
        switch(op){
            case '+':
                r=Methode.addition(a,b);
                break;
            case '-':
                r=Methode.soustraction(a,b);
                break;
            case '*':
                r=Methode.multiplication(a,b);
                break;
            case '/':
                r=Methode.division(a,b);
                break;
            default:
                System.out.println("Operation invalide");
        }
        System.out.println("Le resultat est: "+r);
    }
}