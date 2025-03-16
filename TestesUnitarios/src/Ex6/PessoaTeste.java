package Ex6;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaTeste {
    @Test
    public void gerarNomeTeste(){
        Pessoa pessoa = new Pessoa("Gabriella", "Bento", "Santos", "Blumenau");
        assertEquals("Benga sablu", pessoa.gerarNome());
    }
}
