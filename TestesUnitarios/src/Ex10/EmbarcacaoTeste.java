package Ex10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmbarcacaoTeste {
    @Test
    void testPlanejarViagem() {
        Embarcacao barco = new Embarcacao("1", "Modelo X", 10, 100.0, 2.0, 2);
        assertTrue(barco.planejarViagem(40));
        assertFalse(barco.planejarViagem(60));
    }

    @Test
    void testTransatlanticoSeguranca() {
        Transatlantico navio = new Transatlantico("2", "Titanic", 100, 500.0, 5.0, 5, 1912, 20);
        assertEquals("Botes OK", navio.verificaSeguranca());
        navio.adicionaBotes(5);
        assertEquals("Botes OK", navio.verificaSeguranca());
    }

    @Test
    void testLanchaSeguranca() {
        Lancha lancha = new Lancha("3", "Lancha", 5, 50.0, 1.0, 0, 60.0);
        assertEquals("ALERTA: embarcação necessitando de mais botes!", lancha.verificaSeguranca());
    }

    @Test
    void testTempoViagemLancha() {
        Lancha lancha = new Lancha("4", "Lancha", 5, 50.0, 1.0, 1, 50.0);
        assertEquals(2.0, lancha.tempoViagem(100));
    }
}
