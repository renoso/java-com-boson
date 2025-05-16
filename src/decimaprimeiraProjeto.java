import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class decimaprimeiraProjeto {

    // condicional if
    // usando comparadores relacionais
    //

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double livroLinux;
        double livroJava;

        System.out.printf("Entre com o preço do livro de linux: ");
        livroLinux = entrada.nextDouble();
        System.out.printf("Entre com o preço do livro de Java: ");
        livroJava = entrada.nextDouble();

        double total = livroLinux + livroJava;
        System.out.println("O preço total é " + total);

        if (livroLinux == 10) {
            System.out.println("Livro de linux quase de graça!\n");
        }
        if (total <= 120.00) {
            System.out.println("O preço está bom!");
        } else {
            System.out.println("Livros muito caros!");
        }
        if (livroLinux < livroJava) {
            System.out.println("Livro de LInux mais barato");

        } else if (livroLinux > livroJava) {
            System.out.println("Livro de Java mais barato");
        } else {
            System.out.println("Livros com o mesmo preço");
        }
    }
}
