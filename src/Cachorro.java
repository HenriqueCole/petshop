import java.util.ArrayList;

public class Cachorro extends Animal{
    static ArrayList<Cachorro> listaCachorro = new ArrayList<>();
    private String latir;
    private String brincarBolinha;
    private String farejar;

    @Override
    public String toString() {
        return super.toString()+
                "\nCachorro: " +
                "\nLatir: " + latir +
                "\nBrincar Com Bolinha: " + brincarBolinha +
                "\nFarejar: " + farejar;
    }

    public Cachorro(String nome, String raca, double altura, double peso, String latir, String brincarBolinha, String farejar) {
        super(nome, raca, altura, peso);
        this.latir = latir;
        this.brincarBolinha = brincarBolinha;
        this.farejar = farejar;
    }

    public String getLatir() {
        return latir;
    }

    public void setLatir(String latir) {
        this.latir = latir;
    }

    public String getBrincarBolinha() {
        return brincarBolinha;
    }

    public void setBrincarBolinha(String brincarBolinha) {
        this.brincarBolinha = brincarBolinha;
    }

    public String getFarejar() {
        return farejar;
    }

    public void setFarejar(String farejar) {
        this.farejar = farejar;
    }
}
