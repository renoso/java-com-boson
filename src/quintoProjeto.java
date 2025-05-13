import java.util.Scanner;

// usando class sccnner para receber entradas do teclado
public class quintoProjeto {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in);
        String str;
        System.out.printf("Digite seu usuario. ");
        str = texto.nextLine();

        System.out.printf("Digite sua senha.");
        int numero = texto.nextInt();
        System.out.println("Usuario errado");

        System.out.printf("Seja bem vindo: " + str);

        texto.close();
    }
}
