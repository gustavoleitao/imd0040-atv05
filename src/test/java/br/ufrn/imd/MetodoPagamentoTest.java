package br.ufrn.imd;

import org.junit.jupiter.api.Test;

import java.lang.reflect.*;

import static org.junit.jupiter.api.Assertions.*;

class MetodoPagamentoTest {

    @Test
    void existsMetodoPagamento() throws ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.MetodoPagamento");
        assertNotNull(clazzFuncionario);
    }

    @Test
    void metodoPagamentoIsInterface() throws ClassNotFoundException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.MetodoPagamento");
        assertTrue(Modifier.isInterface(clazzFuncionario.getModifiers()));
        assertNotNull(clazzFuncionario);
    }

    @Test
    void existsMethodDebitar() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.MetodoPagamento");
        Method methodCalcular = clazzFuncionario.getDeclaredMethod("debitar");
        assertTrue(Modifier.isAbstract(methodCalcular.getModifiers()));
        assertNotNull(methodCalcular);
        assertEquals(0, methodCalcular.getParameterCount());
        assertEquals("boolean", methodCalcular.getGenericReturnType().getTypeName());
    }

    @Test
    void existsMethodEstornar() throws ClassNotFoundException, NoSuchMethodException {
        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.MetodoPagamento");
        Method methodEstornar = clazzFuncionario.getDeclaredMethod("estornar");
        assertNotNull(methodEstornar);
        assertTrue(Modifier.isAbstract(methodEstornar.getModifiers()));
        assertEquals(0, methodEstornar.getParameterCount());
        assertEquals("void", methodEstornar.getGenericReturnType().getTypeName());
    }

//    @Test
//    void existsAttrInFuncionario() throws ClassNotFoundException, NoSuchFieldException {
//        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
//        Field fieldChMensal = clazzFuncionario.getDeclaredField("chMensal");
//        Field fieldHH = clazzFuncionario.getDeclaredField("hh");
//
//        assertNotNull(fieldChMensal);
//        assertEquals("int", fieldChMensal.getGenericType().getTypeName());
//
//        assertNotNull(fieldHH);
//        assertEquals("double", fieldHH.getGenericType().getTypeName());
//    }


//    @Test
//    void existsMethodInFuncionario() throws ClassNotFoundException, NoSuchMethodException {
//        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
//        Method methodCalcular = clazzFuncionario.getDeclaredMethod("calcularSalario");
//        assertNotNull(methodCalcular);
//        assertEquals(0, methodCalcular.getParameterCount());
//        assertEquals("double", methodCalcular.getGenericReturnType().getTypeName());
//    }
//
//    @Test
//    void existsConstructorInFuncionario() throws ClassNotFoundException, NoSuchMethodException {
//        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
//        Constructor<?> constructor = clazzFuncionario.getDeclaredConstructor(int.class, double.class);
//        assertNotNull(constructor);
//    }
//
//    @Test
//    void assertCalculation() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Class<?> clazzFuncionario = Class.forName("br.ufrn.imd.Funcionario");
//        Constructor<?> constructor = clazzFuncionario.getDeclaredConstructor(int.class, double.class);
//        Object instance = constructor.newInstance(10, 254);
//
//        Method methodCalcular = clazzFuncionario.getDeclaredMethod("calcularSalario");
//        double response = (double) methodCalcular.invoke(instance);
//        assertEquals(2540.0, response);
//    }

}