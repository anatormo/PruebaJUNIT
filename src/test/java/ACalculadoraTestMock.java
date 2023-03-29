import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.*;

//manera para no tener que declarar los mocks cada vez
//@ExtendWith(MockitoExtension.class)

class ACalculadoraTestMock {
    //declaramos los moccks
/*  @Mock
    private Dado D1;
    @Mock
    private Dado D2;
    //inyeccion de mocks
    @InjectMocks
    private Calculadora cal;

    @Test
    void sumaDadoTest() {
        //creamos los objetos y generamos el escenario de test
        Calculadora cal = new Calculadora();
        //creamos los objetos dado ficticios con mock
        Dado D1 = mock(Dado.class);
        Dado D2 = mock(Dado.class);

        //controlamos la respuesta de los metodos
        //para que funciones con cualquier valor ponemos any en lugar del numero
        when(D1.getValue(anyInt(), eq(3))).thenReturn(5);
        when(D2.getValue(anyInt(), eq(3))).thenReturn(4);

        //comprobación
        Integer resultado = cal.SumaDado(D1, D2, 6, 3);
        assertEquals(9, resultado);
    }*/
    //no funciona con la inyeccion de los mocks por eso lo hemos quitado
    @Test
    void sumaDadoTest1() {
        //creamos los objetos y generamos el escenario de test
        Calculadora cal = new Calculadora();
        //creamos los objetos dado ficticios
        Dado D1 = mock(Dado.class);
        Dado D2 = mock(Dado.class);

        //controlamos la respuesta de los metodos
        //para que funciones con cualquier valor ponemos any en lugar del numero
        when(D1.getValue(8, 3)).thenThrow(IllegalArgumentException.class);
        when(D2.getValue(8, 3)).thenThrow(IllegalArgumentException.class);

        //comprobación
       // Integer resultado = cal.SumaDado(D1, D2, 6, 3);
        assertThrows(IllegalArgumentException.class, () -> cal.SumaDado(D1, D2, 8, 3));
    }

    //como llamar a un espia
    @Test
    void sumaDadoTest2() {
        //creamos los objetos y generamos el escenario de test
        Calculadora cal = new Calculadora();
        //creamos los objetos dado ficticios con espias spy
        Dado D1 = spy(Dado.class);
        Dado D2 = spy(Dado.class);

        //controlamos la respuesta de los metodos
        //para que funciones con cualquier valor ponemos any en lugar del numero
        doReturn(5).when(D1).getValue(6,3);
       // when(D1.getValue(6, 3)).thenReturn(5);
        when(D2.getValue(6, 3)).thenReturn(5);


        //comprobación
        Integer resultado = cal.SumaDado(D1, D2, 6, 3);
        assertEquals(10, resultado);
    }
}