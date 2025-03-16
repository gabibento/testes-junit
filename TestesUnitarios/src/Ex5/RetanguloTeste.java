package Ex5;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

 public class RetanguloTeste {
    @Test
     void calcularAreaTeste(){
        Retangulo retangulo = new Retangulo(2, 4);
        assertEquals(8, retangulo.calcularArea(), 0.1);
    }
    @Test
     void calcularAreaExceptionTeste(){
        Retangulo retangulo = new Retangulo(-2, 4);
        assertThrows(IllegalArgumentException.class, retangulo::calcularArea);
    }
    @Test
     void calcularPerimetroTeste(){
        Retangulo retangulo = new Retangulo(2, 4);
        assertEquals(8, retangulo.calcularArea(), 0.1);
    }
    @Test
     void calcularPerimetroExceptionTeste(){
        Retangulo retangulo = new Retangulo(2, -4);
        assertThrows(IllegalArgumentException.class, retangulo::calcularPerimetro);
    }
    @Test
     void calcularMaiorAreaTeste(){
        List<Retangulo> lista = new ArrayList<>();
        Retangulo retangulo1 = new Retangulo(2, 4);
        Retangulo retangulo2 = new Retangulo(3, 5);
        Retangulo retangulo3 = new Retangulo(6, 9);
        lista.add(retangulo1);
        lista.add(retangulo2);
        lista.add(retangulo3);

        assertEquals(retangulo3, Retangulo.calcularMaiorArea(lista));

    }
    @Test
     void calcularMaiorAreaException(){
        List<Retangulo> lista = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> Retangulo.calcularMaiorArea(lista));
    }

    @Test
     void calcularMaiorPerimetroTeste(){
        List<Retangulo> lista = new ArrayList<>();
        Retangulo retangulo1 = new Retangulo(2, 4);
        Retangulo retangulo2 = new Retangulo(3, 5);
        Retangulo retangulo3 = new Retangulo(6, 9);
        lista.add(retangulo1);
        lista.add(retangulo2);
        lista.add(retangulo3);

        assertEquals(retangulo3, Retangulo.calcularMaiorPerimetro(lista));

    }
    @Test
     void calcularMaiorPerimetroException(){
        List<Retangulo> lista = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> Retangulo.calcularMaiorArea(lista));
    }
}
