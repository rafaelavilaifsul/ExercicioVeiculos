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
            teclado.nextLine();
            System.out.print("Qual a marca: ");
            String marca = teclado.nextLine();
            System.out.print("Qual o modelo: ");
            String modelo = teclado.nextLine();
            if (resp == 1) {
                v[i] = new Carro(marca, modelo);
            } else {
                v[i] = new Caminhao(marca, modelo);
            }
        }
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
            v[i].buzine();
        }
    }
}