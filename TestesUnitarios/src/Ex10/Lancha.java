package Ex10;

public class Lancha extends Embarcacao{
    private double velMax;

    public Lancha(String id, String modelo, int qtdPessoas, double capacidadeCombustivel, double queimaDeCombustivel, int qtdBotesSalvaVidas, double velMax) {
        super(id, modelo, qtdPessoas, capacidadeCombustivel, queimaDeCombustivel, qtdBotesSalvaVidas);
        this.velMax = velMax;
    }

    @Override
    public String verificaSeguranca() {
        return qtdBotesSalvaVidas > 0 ? "Botes OK" : "ALERTA: embarcação necessitando de mais botes!";
    }

    public double tempoViagem(double distancia) {
        return distancia / velMax;
    }
}
