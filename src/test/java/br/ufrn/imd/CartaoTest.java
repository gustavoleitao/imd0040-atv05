package br.ufrn.imd;

import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class CartaoTest {

    @Test
    void existsCartao() throws ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Cartao");
        assertNotNull(clazzFuncionario);
    }

    @Test
    void debitar() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Cartao");
        MetodoPagamento cartaoInstance = (MetodoPagamento) clazzFuncionario.getDeclaredConstructor().newInstance();
        assertFalse(cartaoInstance.debitar());
    }

    @Test
    void estornar() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Cartao");
        MetodoPagamento cartaoInstance = (MetodoPagamento) clazzFuncionario.getDeclaredConstructor().newInstance();
        cartaoInstance.estornar();
    }

}