package Ex3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 public class CalculadoraTeste {
    @Test
     void testeSoma(){
        Calculadora calculadora = new Calculadora(2, 5.7);
        assertEquals(7.7, calculadora.somar(),0.01);
    }
    @Test
     void testeSubtracao(){
        Calculadora calculadora = new Calculadora(2, 10);
        assertEquals(-8, calculadora.subtrair(),0.01);
    }
    @Test
     void testeMultiplicacao(){
        Calculadora calculadora = new Calculadora(5, 10);
        assertEquals(50, calculadora.multiplicar(),0.01);
    }
    @Test
     void testeDivisao(){
        Calculadora calculadora = new Calculadora(6, 2);
        assertEquals(3, calculadora.dividir(),0.01);
    }
}
