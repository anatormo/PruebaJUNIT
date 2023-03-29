import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BAssertThrow {


    @Test
    void division() {
        Calculadora cal = new Calculadora();
        double resultado = cal.division(4, 2);
        //lanzamos excepciones que sabemos que fallaran para controlar el programa, com es la division entre 0
        //cuando pida un ejecutable poner un lamba()->//
        assertThrows(IllegalArgumentException.class, () -> cal.division(4, 0));
    }

    @Test
    void resta() {
        Calculadora cal = new Calculadora();
        double resultado = cal.resta(5, 1);
        assertThrows(IllegalArgumentException.class, () -> cal.resta(5, 1));
    }
}