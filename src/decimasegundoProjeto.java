import java.util.Scanner;

public class decimasegundoProjeto {

    /*
     * public static void main(String[] args) {
     * 
     * int contador = 1;
     * while (contador <= 50) {
     * System.out.println(contador);
     * contador++;
     * }
     * }
     * }
     */
     public static void main(String[] args) {
    
        Scanner entrada = new Scanner(System.in);
        String nome;
        System.out.println(("Digite seu nome ou S para sair: "));
        nome = entrada.nextLine();
        // metodo para comparar strings em java é usado "equals", para saber se é ==
        // com a negação em vez de nome.equals(s) == a qualquer coisa que nao s, vai continuar o programa  
        while (!nome.equals("s")) {
            System.out.printf("Bem-vindo %s\n ", nome);
            System.out.println("Digte seu nome ou S para sair ");
            nome = entrada.nextLine();
        }

        System.out.println("Fim da execução!");
}

}
