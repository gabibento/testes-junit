package Ex5;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Retangulo {
   private double altura, largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    public double calcularArea(){
        if(altura < 0 || largura < 0) throw new IllegalArgumentException();
        return largura * altura;
    }
    public double calcularPerimetro(){
        if(altura < 0 || largura < 0) throw new IllegalArgumentException();
        return (largura * 2) + (altura * 2);
    }
    public static Retangulo calcularMaiorArea(List<Retangulo> lista){
        return lista.stream().max(Comparator.comparingDouble(Retangulo::calcularArea)).orElseThrow(IllegalArgumentException::new);
    }
    public static Retangulo calcularMaiorPerimetro(List<Retangulo> lista){
        return lista.stream().max(Comparator.comparingDouble(Retangulo::calcularPerimetro)).orElseThrow(IllegalArgumentException::new);
    }
}
