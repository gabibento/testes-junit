package Ex9;

public abstract class Computador {
    private String modelo;
    private double ram;
    private double armazenamento;

    public Computador(String modelo, double ram, double armazenamento) {
        this.modelo = modelo;
        this.ram = ram;
        this.armazenamento = armazenamento;
    }
    public String ligarOuDesligar(boolean estaDesligado){
        return estaDesligado ? "Ligando" : "Desligando";
    }

    abstract boolean rodarAplicacao(String aplicacao);

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
}
