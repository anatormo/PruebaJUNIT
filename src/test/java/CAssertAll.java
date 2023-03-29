import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CAssertAll {


        @Test
        void suma() {
            Calculadora cal=new Calculadora();
            double resultado = cal.suma(2,3);
            assertAll("Agrupamiento de Assert",
                    ()->assertNotNull(resultado, "El test ha fallado aquí"),
                    ()->assertFalse(resultado>0),
                    ()->assertEquals(5, resultado));
    }
}