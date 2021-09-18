
package test;


public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //clase emvolvente de tipos primitivos
        /*
        int - integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Charater
        short - Short
        */
        Integer entero = 10; //autoboxin
        System.out.println("Entero =  "+entero);
        System.out.println("Entero =  "+entero.doubleValue());
        
        int entero2 = entero; //unboxing
        System.out.println("entero2 = " + entero2);
    }
}
