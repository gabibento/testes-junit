package Ex5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class RetanguloTeste {
    @Test
    public void calcularAreaTeste(){
        Retangulo retangulo = new Retangulo(2, 4);
        assertEquals(8, retangulo.calcularArea(), 0.1);
    }
    @Test
    public void calcularAreaExceptionTeste(){
        Retangulo retangulo = new Retangulo(-2, 4);
        assertThrows(IllegalArgumentException.class, retangulo::calcularArea);
    }
    @Test
    public void calcularPerimetroTeste(){
        Retangulo retangulo = new Retangulo(2, 4);
        assertEquals(8, retangulo.calcularArea(), 0.1);
    }
    @Test
    public void calcularPerimetroExceptionTeste(){
        Retangulo retangulo = new Retangulo(2, -4);
        assertThrows(IllegalArgumentException.class, retangulo::calcularPerimetro);
    }
    @Test
    public void calcularMaiorAreaTeste(){
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
    public void calcularMaiorAreaException(){
        List<Retangulo> lista = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> Retangulo.calcularMaiorArea(lista));
    }

    @Test
    public void calcularMaiorPerimetroTeste(){
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
    public void calcularMaiorPerimetroException(){
        List<Retangulo> lista = new ArrayList<>();
        assertThrows(IllegalArgumentException.class, () -> Retangulo.calcularMaiorArea(lista));
    }
}
