import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Veiculo> v = new ArrayList<Veiculo>();
        for (int i = 0; i < 2; i++) {
            System.out.printf("Qual o tipo do %do veículo? (1 = carro, 2 = caminhão): ", i + 1);
            int resp = teclado.nextInt();
            teclado.nextLine();
            System.out.print("Qual a marca: ");
            String marca = teclado.nextLine();
            System.out.print("Qual o modelo: ");
            String modelo = teclado.nextLine();
            if (resp == 1) {
                v.add(new Carro(marca, modelo));
            } else {
                v.add(new Caminhao(marca, modelo));
            }
        }
        for (Veiculo x: v) {
            System.out.println(x);
            x.buzine();
        }
    }
}