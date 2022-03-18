import java.util.ArrayList;

public class Gato extends Animal{
    static ArrayList<Gato> listaGato = new ArrayList<>();
    private String miar;
    private String qtdLeite;
    private String tamanhoUnha;

    @Override
    public String toString() {
        return super.toString()+
                "\nInformações do gato: "+
                "\nMiar: " + miar +
                "\nQuantidade de leite: " + qtdLeite +
                "\nTamanho da Unha: " + tamanhoUnha;
    }

    public Gato(String nome, String raca, double altura, double peso, String miar, String qtdLeite, String tamanhoUnha) {
        super(nome, raca, altura, peso);
        this.miar = miar;
        this.qtdLeite = qtdLeite;
        this.tamanhoUnha = tamanhoUnha;
    }

    public String getMiar() {
        return miar;
    }

    public void setMiar(String miar) {
        this.miar = miar;
    }

    public String getQtdLeite() {
        return qtdLeite;
    }

    public void setQtdLeite(String qtdLeite) {
        this.qtdLeite = qtdLeite;
    }

    public String getTamanhoUnha() {
        return tamanhoUnha;
    }

    public void setTamanhoUnha(String tamanhoUnha) {
        this.tamanhoUnha = tamanhoUnha;
    }
}
