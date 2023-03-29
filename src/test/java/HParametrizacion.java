import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class HParametrizacion {


    @DisplayName("Prueba del método suma")
    //le damos valores de prueba en rangos primer valor (valorA), segundo valor(valorB) y resultado(Salida)
    @CsvSource ({"2,3,5","-2,3,1","5,4,9"})
    //para que coja los valores de un archivo que hemos creado con valores ciertos
    //delimitamos el punto y coma y le decimos que se salte la primera línea
    @CsvFileSource (resources = "Bateria.csv", delimiter = ';',numLinesToSkip = 1 )
    @ParameterizedTest
    void suma(int valorA, int valorB, int Salida) {
        Calculadora cal=new Calculadora();
        double resultado = cal.suma(valorA,valorB);
        assertAll("Agrupamiento de Assert",
            //es con valores ciertos por que este assert es el equals
                ()->assertEquals(Salida, resultado));
    }

    @Test
    void resta() {
    }

    @Test
    void multiplicacion() {
    }

    @Test
    void division() {
    }


}