import java.util.Scanner;
public class Ex3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String v;
        int g;
        do {
            System.out.print("Entrez un verbe a l'infinitif: ");
            v=sc.nextLine();
        }while(!Methode.inf(v));
        g=Methode.groupe(v);
        System.out.println("Le verbe ("+v+") appartient au "+g+" eme groupe");
    }
}