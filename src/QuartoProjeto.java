
// Importa o Random para gerar numeros aleatorios
import java.util.Random;


public class QuartoProjeto {

    
    // com o random voce pode criar numeros aleatorios, e especificar a ordem de numeros
    public static void main(String[] args) {
        Random aleatorio = new Random();
        // aqui voce escolhe o limite e de numeros gerados 
        float valor = aleatorio.nextFloat() ;
        System.out.println("Numero gerado: " + valor);
    }
}
