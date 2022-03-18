public class Animal {
    private String nome;
    private String raca;
    private double altura;
    private double peso;

    public Animal(String nome, String raca, double altura, double peso) {
        this.nome = nome;
        this.raca = raca;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return
                "\nNome: " + nome +
                "\nRaça: " + raca +
                "\nAltura: " + altura +
                "\nPeso: " + peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
