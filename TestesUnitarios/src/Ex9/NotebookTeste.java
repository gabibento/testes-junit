package Ex9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotebookTeste {
    @Test
    void testRodarAplicacao() {
        Notebook notebook = new Notebook("Dell", 16, 512, 1.2);
        assertTrue(notebook.rodarAplicacao("app.exe"));
        assertFalse(notebook.rodarAplicacao("app.apk"));
    }

    @Test
    void testAumentarRam() {
        Notebook notebook = new Notebook("Dell", 16, 512, 1.2);
        notebook.aumentarRam(8);
        assertEquals(24, notebook.getRam());
    }
}
