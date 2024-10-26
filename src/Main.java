import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int resp = -1;
       int respDW = -2;

       while(resp != 0){
           System.out.println("Digite um numero: ");
           resp = scanner.nextInt();
       }

        System.out.println("O programa em WHILE parou!");
        System.out.println("---------------------------------------------------------");

        do {
            System.out.println("Digite um numero: ");
            respDW = scanner.nextInt();
        }while(respDW != 0);

        System.out.println("O programa em DOWHILE parou!");
        System.out.println("---------------------------------------------------------");
    }
}
