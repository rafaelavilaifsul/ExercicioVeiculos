import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Veiculo[] v = new Veiculo[2];
        for (int i = 0; i < v.length; i++) {
            System.out.printf("Qual o tipo do %do veículo? (1 = carro, 2 = caminhão): ", i + 1);
            int resp = teclado.nextInt();
            if (resp == 1) {
                v[i] = new Carro();
            } else {
                v[i] = new Caminhao();
            }
        }
        for (int i = 0; i < v.length; i++) {
            v[i].buzine();
        }
    }
}