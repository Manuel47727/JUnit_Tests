import org.example.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RetanguloTest {

    Retangulo retangulo = new Retangulo();

    @Test
    public void testAreaCaso1() {
        int base = 3;
        int altura = 5;
        int resultadoEsperado = 15;
        assertEquals(resultadoEsperado, retangulo.area(base, altura));
    }

    @Test
    public void testAreaCaso2() {
        int base = 5;
        int altura = 8;
        int resultadoEsperado = 40;
        assertEquals(resultadoEsperado, retangulo.area(base, altura));
    }

    @Test
    public void testAreaCaso3() {
        int base = 2;
        int altura = 4;
        int resultadoEsperado = 8;
        assertEquals(resultadoEsperado, retangulo.area(base, altura));
    }

    @Test
    public void testPerimetroCaso1() {
        int base = 3;
        int altura = 5;
        int resultadoEsperado = 16;
        assertEquals(resultadoEsperado, retangulo.perimetro(base, altura));
    }

    @Test
    public void testPerimetroCaso2() {
        int base = 5;
        int altura = 8;
        int resultadoEsperado = 26;
        assertEquals(resultadoEsperado, retangulo.perimetro(base, altura));
    }

    @Test
    public void testPerimetroCaso3() {
        int base = 2;
        int altura = 4;
        int resultadoEsperado = 12;
        assertEquals(resultadoEsperado, retangulo.perimetro(base, altura));
    }

    @Test
    public void testTrianguloPossivelComTresLadosValidos() {
        assertTrue(retangulo.isTriangle(3, 4, 5)); // Triângulo possível
    }

    @Test
    public void testTrianguloPossivelComLadosInvalido() {
        assertFalse(retangulo.isTriangle(1, 2, 3)); // Triângulo não possível
    }

    @Test
    public void testTrianguloPossivelComLadosIgual() {
        assertTrue(retangulo.isTriangle(2, 2, 3)); // Triângulo possível
    }

    @Test
    public void testTrianguloPossivelComLadosNegativos() {
        assertFalse(retangulo.isTriangle(-1, 2, 3)); // Triângulo não possível
    }
}
