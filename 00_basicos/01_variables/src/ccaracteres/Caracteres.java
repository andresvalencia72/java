package ccaracteres;


public class Caracteres {
    public static void main(String[] args) {
        
        char caracter = '\u0040';
        char decimalChar = 64;

        System.out.println("decimalChar " + decimalChar);
        System.out.println("caracter " + caracter);
        System.out.println("decimalChar == caracte: " + (decimalChar==caracter));

        System.out.println("char corresponde en byte: " + Character.BYTES);
        System.out.println("char corresponde en bites: " + Character.SIZE);
        System.out.println("Character.MAX_VALUE: " + Character.MAX_VALUE);
        System.out.println("Character.MIN_VALUE: " + Character.MIN_VALUE);

        /* Primitivos caracter especiales */
        char espacio = ' ';
        espacio = '\u0020';
        char tabulador = '\t';
        char retroceso = '\b';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println(espacio);
        System.out.println("no me quiero ir señor stark..." + retroceso);
        System.out.println(tabulador);
        System.out.println(nuevaLinea);
        System.out.println(retornoCarro);
        // System.getProperty("line.separator") según el sistema operativo
        //System.lineSeparator 


    }
}
