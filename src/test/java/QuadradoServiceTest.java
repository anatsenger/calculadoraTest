import model.Quadrado;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import service.CalculadoraService;
import service.QuadradoService;

import static org.mockito.Mockito.*;

public class QuadradoServiceTest {

    static CalculadoraService calculadora;
    static QuadradoService quadradoService;
    Quadrado quadrado;
    Quadrado quadrado1;

    @BeforeAll
    public static void init(){
        calculadora = mock(CalculadoraService.class);
        quadradoService = new QuadradoService();
    }

    @BeforeEach
    public void setup(){
        quadrado = new Quadrado(5.0);
        quadrado1 = new Quadrado(3.0);
    }
    @Test
    public void calculandoAreaQuadradoCorretamente(){
        //given
        //when
        when(calculadora.multiplicar(quadrado.getLado(), quadrado.getLado())).thenReturn(25.0);
        double areaQuadrado = quadradoService.calcularAreaQuadrado(quadrado);
        //then
        assertEquals(areaQuadrado, 25.0);
    }
    @Test
    public void retornaQuadradoMenorCorretamente(){
    Quadrado quadradoMenor = quadradoService.quadradoDeMenorArea(quadrado, quadrado1);
    assertEquals(quadradoMenor, quadrado1);

    }

}
