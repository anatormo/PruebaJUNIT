import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AAssert {
    //test de la clase calculadora suma de dos números positivos
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


    @Test
    @DisplayName("Prueba del método resta")
    void resta() {
        Calculadora cal =new Calculadora();
        double resultado = cal.resta(5, 1);
        assertEquals(4, resultado);
        assertNotNull(resultado, "El test ha fallado aquí");
        assertTrue(resultado>0);
    }

    @Test
    @DisplayName("Prueba del método multiplicación")
    void multiplicacion() {
        Calculadora cal=new Calculadora();
        double resultado= cal.multiplicacion(2,5);
        assertTrue(resultado>0);
        assertNotNull(resultado);
        assertEquals(11, resultado);
    }

    @Test
    @DisplayName("Prueba del método división")
    void division() {
        Calculadora cal= new Calculadora();
        double resultado = cal.division(4,2);
        assertEquals(6, resultado);
        assertNotNull(resultado);
        assertTrue(resultado>0);

    }

   }