import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DDisplayName {

    @Test
    //para poner el nombre donde sale el resultado del test
    @DisplayName("Prueba del método suma")
    void suma() {
        Calculadora cal=new Calculadora();
        double resultado = cal.suma(2,3);
        //en este caso de test le decimos el valor no sea nulo
        assertNotNull(resultado, ()-> "Ha fallado el test aquí");
        //en este caso de test le decimos que el resultado será mayor que cero
        assertTrue(resultado>0);
        //en este caso de test le decimos el valor que esperamos y el resultado
        assertEquals(5, resultado);
    }
    }
