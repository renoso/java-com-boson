import java.util.Scanner;

// trabalhando com constante, constante são valores que nunca se alteram
// usando a constante fora do [main]
// sempre usar constante em variaveis que nuncam vão ser alterado
public class sextoProjeto {
    private static final double largura = 10;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Entre com o comprimento: ");
        double compr = entrada.nextDouble();

        double area = calculaArea(largura, compr);
        System.out.printf("A area é: " + area + " m²");
    }

    private static double calculaArea(double largura, double comprimento) {
        return largura * comprimento;
    }
}
