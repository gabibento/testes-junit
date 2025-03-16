package Ex4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 public class AtletaTeste {

    @Test
     void categorizarTeste(){
        Atleta atleta = new Atleta(18, 167, 65);
        assertEquals("Juvenil", atleta.categorizar());
    }
    @Test
     void calcularIMCTeste(){
        Atleta atleta = new Atleta(18, 1.67, 65);
        assertEquals(23.30, atleta.calcularIMC(), 0.1);
    }
    @Test
     void classificarIMCTeste(){
        Atleta atleta = new Atleta(18, 1.67, 65);
        assertEquals("Saudável", atleta.classificarIMC(atleta.calcularIMC()));
    }
}
