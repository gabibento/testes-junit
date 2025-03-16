package Ex9;

public class Smartphone extends Computador{
    private int operadora;
    private boolean cameraFrontal;


    public Smartphone(String modelo, double ram, double armazenamento, int operadora, boolean cameraFrontal) {
        super(modelo, ram, armazenamento);
        this.operadora = operadora;
        this.cameraFrontal = cameraFrontal;
    }
    public boolean tirarSelfie(){
        return cameraFrontal;
    }

    @Override
    boolean rodarAplicacao(String aplicacao) {
        return aplicacao.endsWith(".apk");
    }
}
