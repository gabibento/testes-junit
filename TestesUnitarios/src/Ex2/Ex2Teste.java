package Ex2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ex2Teste {
    @Test
     void testePar(){
        Ex2 ex = new Ex2();
        assertTrue(ex.verificarPar(2));
        assertFalse(ex.verificarPar(3));
        assertTrue(ex.verificarPar(4));
        assertFalse(ex.verificarPar(1223));
        assertTrue(ex.verificarPar(1452));
    }
}
