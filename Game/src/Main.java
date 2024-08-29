import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hamer_Scissorsr player = new Hamer_Scissorsr();
        String n;
        do{
            System.out.println("GAME START");
            System.out.println("1. BAO, 2. KEO, 3. BAO");
            player.input();
            player.output();
            System.out.println("Enter yes if you want to play again: ");
            n = sc.next();
        }while(n.equalsIgnoreCase("yes"));
        player.closeScanner();
    }
}
