class Caminhao extends Veiculo {
    // construtor
    public Caminhao(String marca, String modelo) {
        super(marca, modelo);
    }
    // faz o caminhao buzinar
    public void buzine() {
        System.out.println("Fooooom!");
    }
}