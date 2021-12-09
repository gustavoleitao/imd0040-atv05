package br.ufrn.imd;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.*;

class PixTest {

    @Test
    void existsPix() throws ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Pix");
        assertNotNull(clazzFuncionario);
    }

    @Test
    void debitar() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Pix");
        MetodoPagamento cartaoInstance = (MetodoPagamento) clazzFuncionario.getDeclaredConstructor().newInstance();
        assertTrue(cartaoInstance.debitar());
    }

    @Test
    void estornar() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Pix");
        MetodoPagamento cartaoInstance = (MetodoPagamento) clazzFuncionario.getDeclaredConstructor().newInstance();
        cartaoInstance.estornar();
    }

}