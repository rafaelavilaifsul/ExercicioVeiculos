class Carro extends Veiculo {
    // construtor
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }
    
    // faz o carro buzinar
    public void buzine() {
        System.out.println("Beep beep!");
    }
}