import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class EAfter_Before {

    //ponemos la calculadora fuera para que salga en todas las funciones
    Calculadora cal;



    //ejecuta todo antes de cada test//
    @BeforeAll
    static void beforeAll() {
        System.out.println("Se ejecuta beforeAll");
    }

    //aquí ponemos lo que queremos que se ejecute antes de cada test
    @BeforeEach
    void setUp() {
        System.out.println("Se ejecuta setUp");
        cal =new Calculadora();
    }

     //se ejecuta después de cada test
    @AfterEach
    void tearDown() {
        System.out.println("Se ejecuta Teardown");
    }

    @Test
    //para poner el nombre donde sale el resultado del test
    @DisplayName("Prueba del método suma")
    void suma() {
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