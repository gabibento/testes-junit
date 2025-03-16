package Ex7;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OnibusEscolarTeste {
    private OnibusEscolar onibusEscolar;

    @BeforeEach
    public void setUp() {
        onibusEscolar = new OnibusEscolar();
    }

    @Test
    public void setAlunosTeste(){
        onibusEscolar.setQuantidadeVagas(15);
        onibusEscolar.setQuantidadeProfessores(5);
        onibusEscolar.setQuantidadeAlunos(10);

        assertEquals(10, onibusEscolar.getQuantidadeAlunos());
    }
    @Test
    public void setAlunosZeroTeste(){
        onibusEscolar.setQuantidadeVagas(10);
        onibusEscolar.setQuantidadeProfessores(0);
        onibusEscolar.setQuantidadeAlunos(5);

        assertEquals(0, onibusEscolar.getQuantidadeAlunos());
    }
    @Test
    public void setAlunosAcimaLimiteTeste(){
        onibusEscolar.setQuantidadeVagas(15);
        onibusEscolar.setQuantidadeProfessores(10);
        onibusEscolar.setQuantidadeAlunos(10);

        assertEquals(5, onibusEscolar.getQuantidadeAlunos());
    }
    @Test
    public void removerAlunosTeste(){
        onibusEscolar.setQuantidadeAlunos(10);
        onibusEscolar.removerAlunos(5);

        assertEquals(5, onibusEscolar.getQuantidadeAlunos());
    }
    @Test
    public void removerAlunosAcimaLimiteTeste(){
        onibusEscolar.setQuantidadeAlunos(10);
        onibusEscolar.removerAlunos(20);

        assertEquals(0, onibusEscolar.getQuantidadeAlunos());
    }
}
