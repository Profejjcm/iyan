package es.calcularpi;


import java.math.BigDecimal;
import java.math.MathContext;

public class CalcularPI {

     public static void main(String[] args) {
         //Primero hacemos clic derecho sobre el codigo(10) y vamos a la opcion refactor.
        //En refactor vamos a la opcion introduce y luego a constant.
        //Seleccionamos el nombre de la constante(NUM_DIG),su tipo de encapsulacion(public) y seleccionamos la opcion de reemplazar sus ocurrencias.
        MathContext mc = new MathContext(NUM_DIG);         
        compute(mc);
    }

    public static void compute(MathContext mc) {
        //Primero hacemos clic derecho sobre el codigo y vamos a la opcion refactor.
        //En refactor vamos a la opcion introduce y luego a method.
        //Seleccionamos el nombre del metodo(compute) y su tipo de encapsulacion(public).
        BigDecimal pi = new BigDecimal(0);
        BigDecimal limit = new BigDecimal(1).movePointLeft(NUM_DIG);
        boolean stop = false;
        for (int k = 0; !stop; k++) {
            BigDecimal piK = piFunction(k, mc);               
            pi = pi.add(piK);
            if (piK.compareTo(limit) < 0) {
                stop = true;
            }
        }
        System.out.println(pi.round(mc));
        //meter en el método compute
    }
    public static final int NUM_DIG = 10;

    public static BigDecimal piFunction(int k, MathContext mc) {
        //Primero hacemos clic derecho sobre el codigo y vamos a la opcion refactor.
        //En refactor vamos a la opcion introduce y luego a method.
        //Seleccionamos el nombre del metodo(piFunction) y su tipo de encapsulacion(public).
        int k8 = 8 * k;
        BigDecimal val1 = new BigDecimal(4);
        val1 = val1.divide(new BigDecimal(k8 + 1), mc);
        BigDecimal val2 = new BigDecimal(-2);
        val2 = val2.divide(new BigDecimal(k8 + 4), mc);
        BigDecimal val3 = new BigDecimal(-1);
        val3 = val3.divide(new BigDecimal(k8 + 5), mc);
        BigDecimal val4 = new BigDecimal(-1);
        val4 = val4.divide(new BigDecimal(k8 + 6), mc);
        BigDecimal val = val1;
        val = val.add(val2);
        val = val.add(val3);
        val = val.add(val4);
        BigDecimal multiplier = new BigDecimal(16);
        multiplier = multiplier.pow(k);
        BigDecimal one = new BigDecimal(1);
        multiplier = one.divide(multiplier, mc);
        val = val.multiply(multiplier);
        BigDecimal piK = val;
        return piK;
    }
     
}
