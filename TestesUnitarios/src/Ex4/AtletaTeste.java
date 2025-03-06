package Ex4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtletaTeste {

    @Test
    public void categorizarTeste(){
        Atleta atleta = new Atleta(18, 167, 65);
        assertEquals("Juvenil", atleta.categorizar());
    }
    @Test
    public void calcularIMCTeste(){
        Atleta atleta = new Atleta(18, 1.67, 65);
        assertEquals(23.30, atleta.calcularIMC(), 0.1);
    }
    @Test
    public void classificarIMCTeste(){
        Atleta atleta = new Atleta(18, 1.67, 65);
        assertEquals("Saudável", atleta.classificarIMC(atleta.calcularIMC()));
    }
}
