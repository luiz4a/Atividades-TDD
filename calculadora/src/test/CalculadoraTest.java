import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculadoraTest {

    @Test
    void deveSomarDoisNumerosCorretamente() {
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(5, 3);
        assertEquals(8, resultado);
    }

    @Test
    void deveSubtrairDoisNumerosCorretamente() {
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(1, 4);
        assertEquals(-3, resultado);
    }

    @Test
    void deveMultiplicarDoisNumerosCorretamente() {
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(3, 7);
        assertEquals(21, resultado);
    }

    @Test
    void deveDividirDoisNumerosCorretamente() {
        Calculadora calc = new Calculadora();
        int resultado = calc.dividir(10, 2);
        assertEquals(5, resultado);
    }

    @Test
    void deveLancarExcecaoAoDividirPorZero() {
        Calculadora calc = new Calculadora();
        Exception e = assertThrows(IllegalArgumentException.class,
            () -> calc.dividir(10, 0));
        assertEquals("Nao e possivel dividir por zero", e.getMessage());
    }
}