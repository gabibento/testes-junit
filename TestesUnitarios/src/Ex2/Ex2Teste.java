package Ex2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ex2Teste {
    @Test
    public void testePar(){
        Ex2 ex = new Ex2();
        assertTrue(ex.verificarPar(2));
        assertFalse(ex.verificarPar(3));
        assertTrue(ex.verificarPar(4));
        assertFalse(ex.verificarPar(1223));
        assertTrue(ex.verificarPar(1452));
    }
}
