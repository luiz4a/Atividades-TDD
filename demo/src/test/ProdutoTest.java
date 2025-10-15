package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProdutoTest {

    @Test
    void testProdutovalido() {
        Produto p = new Produto("Notebook", 3500.00);
        assertEquals("Notebook", p.getNome());
        assertEquals(3500.00, p.getPreco());
    }

    @Test
    void testNomeInvalido() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> new Produto("", 1000));
        assertEquals("Nome invalido", e.getMessage());
    }

    @Test
    void testPrecoInvalido() {
        Exception e = assertThrows(IllegalArgumentException.class,
                () -> new Produto("Mouse", 0));
        assertEquals("Preco invalido", e.getMessage());
    }
}