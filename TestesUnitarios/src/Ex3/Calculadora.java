package Ex3;

public class Calculadora {
    double num1, num2;

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double somar(){
        return num1 + num2;
    }
    public double subtrair(){
        return num1 - num2;
    }
    public double multiplicar(){
        return num1 * num2;
    }
    public double dividir (){
        return num1 / num2;
    }
}
