package Ex6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PessoaTeste {
    @Test
    public void gerarNomeTeste(){
        Pessoa pessoa = new Pessoa("Gabriella", "Bento", "Santos", "Blumenau");
        assertEquals("Benga sablu", pessoa.gerarNome());
    }
}
