package Ex1;

public class Ex1 {
    public String informarEstacao(int num){

        return switch (num){
            case 1 -> "É verão. O tempo está quente.";
            case 2 -> "É outono";
            case 3 -> "É inverno. Está frio.";
            case 4 -> "É primavera";
            default -> throw new IllegalArgumentException();

        };
    }
}
