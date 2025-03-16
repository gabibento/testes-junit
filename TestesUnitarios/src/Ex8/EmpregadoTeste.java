package Ex8;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class EmpregadoTeste {
    private Empregado empregado;

    @BeforeEach
    public void setUp(){
        empregado = new Empregado("Gabriella", 1000, LocalDate.of(2024, 3, 14), 45);
    }
    @Test
    public void rejustarSalarioTeste(){
        assertEquals(1070, empregado.reajustarPorTempo(), 0.1);
    }
    @Test
    public void calcularHoraExtraTeste(){
        assertEquals(1187.5, empregado.calcularSalarioComHoraExtra());
    }
}
