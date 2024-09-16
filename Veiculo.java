abstract class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return String.format("%s %s", this.marca, this.modelo);
    }
    
    public abstract void buzine();
}