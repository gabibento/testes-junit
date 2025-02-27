package Ex1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class Ex1Teste {

    @Test
    public void testeInformarEstacao(){
        Ex1 estacao = new Ex1();
        assertEquals("É verão. O tempo está quente.", estacao.informarEstacao(1));
        assertEquals("É outono", estacao.informarEstacao(2));
        assertEquals("É inverno. Está frio.", estacao.informarEstacao(3));
        assertEquals("É primavera", estacao.informarEstacao(4));
    }
    @Test
    public void testeInformarEstacaoException(){
        Ex1 estacao = new Ex1();
        assertThrows(IllegalArgumentException.class, () -> estacao.informarEstacao(5));
        assertThrows(IllegalArgumentException.class, () -> estacao.informarEstacao(0));
    }
}
