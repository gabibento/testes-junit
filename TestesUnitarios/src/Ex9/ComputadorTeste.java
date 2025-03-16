package Ex9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComputadorTeste {
    @Test
    void testLigarOuDesligar() {
        Notebook notebook = new Notebook("Dell", 16, 512, 1.2);
        assertEquals("Ligando", notebook.ligarOuDesligar(true));
        assertEquals("Desligando", notebook.ligarOuDesligar(false));
    }
}
