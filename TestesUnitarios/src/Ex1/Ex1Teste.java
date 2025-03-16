package Ex1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Ex1Teste {

    @Test
     void testeInformarEstacao(){
        Ex1 estacao = new Ex1();
        assertEquals("É verão. O tempo está quente.", estacao.informarEstacao(1));
        assertEquals("É outono", estacao.informarEstacao(2));
        assertEquals("É inverno. Está frio.", estacao.informarEstacao(3));
        assertEquals("É primavera", estacao.informarEstacao(4));
    }
    @Test
     void testeInformarEstacaoException(){
        Ex1 estacao = new Ex1();
        assertThrows(IllegalArgumentException.class, () -> estacao.informarEstacao(5));
        assertThrows(IllegalArgumentException.class, () -> estacao.informarEstacao(0));
    }
}
