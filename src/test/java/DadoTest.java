import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void getValue () {
        Dado d = new Dado();
        int resultado = d.getValue(6,3);
        assertEquals(3,resultado);
        }
    }

