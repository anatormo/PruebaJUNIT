import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import static org.junit.jupiter.api.Assertions.*;


class FConditional {


    @Nested
    @EnabledOnOs(OS.WINDOWS)
    private class windowsTest {

        @Test
        void windows1() {
            assertTrue(true);
        }

        @Test
        void windows2() {
            assertTrue(true);
        }

        @Test
        void windows3() {
            assertTrue(true);
        }
    }

        @Nested
        @EnabledOnOs(OS.LINUX)
        private class linuxTest {
            @Test
            void linux1() {
                assertTrue(true);
            }

            @Test
            void linux2() {
                assertTrue(true);
            }

            @Test
            //repite el test las veces que le digamos sin que se pare
            @RepeatedTest(5)
            void linux3() {
                assertTrue(true);
            }
        }


        @AfterAll
        static void afterAll() {
            //nos da las variable de entorno
            System.getenv().forEach((key, value) -> System.out.println(key + " = " + value));
            //nos dara las propiedades
            System.getProperties().forEach((nombre, valor) -> System.out.println(nombre + " = " + valor));
        }

        @Test

        //para deshabilitar un test
        @Disabled("Hasta reparar bug 254")
        @DisplayName("Prueba del método suma")
        void suma() {
            Calculadora cal = new Calculadora();
            double resultado = cal.suma(2, 3);
            assertAll("Agrupamiento de Assert",
                    () -> assertNotNull(resultado, "El test ha fallado aquí"),
                    () -> assertFalse(resultado > 0),
                    () -> assertEquals(5, resultado));
        }

        @Test
        //Habilitar el test solo para las versiones que indicamos
        @EnabledOnJre(JRE.JAVA_8)
        //se ejecuta en este rango de versiones
        @EnabledForJreRange(min = JRE.JAVA_8, max = JRE.JAVA_10)
        //Para decirle en que entorno queremos que se ejecute
        @EnabledOnOs({OS.LINUX, OS.MAC})
        @DisplayName("Prueba del método multiplicación")
        void multiplicacion() {
            Calculadora cal = new Calculadora();
            double resultado = cal.multiplicacion(2, 5);
            assertTrue(resultado > 0);
            assertNotNull(resultado);
        }

    }

