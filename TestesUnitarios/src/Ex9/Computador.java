package Ex9;

public abstract class Computador {
    protected String modelo;
    protected double ram;
    protected double armazenamento;

    public Computador(String modelo, double ram, double armazenamento) {
        this.modelo = modelo;
        this.ram = ram;
        this.armazenamento = armazenamento;
    }
    public String ligarOuDesligar(boolean estaDesligado){
        return estaDesligado ? "Ligando" : "Desligando";
    }

    abstract boolean rodarAplicacao(String aplicacao);

}
