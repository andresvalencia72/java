package esistemasnumericos;

public class SistemasNumericos {
    public static void main(String[] args) {

        int decimalNumber = 500;
        System.out.println(decimalNumber);

        System.out.println("Número binario de " + decimalNumber +  " = " + Integer.toBinaryString(decimalNumber));

        int binaryNumber = 0b111110100;
        System.out.println("binaryNumber = " + binaryNumber);

        System.out.println("numero octal de " + Integer.toOctalString(decimalNumber));

        int octalNumber = 0764;
        System.out.println("octalNumber " + octalNumber );

        System.out.println("Numero hexadecimal de " + decimalNumber + " = " + Integer.toHexString(decimalNumber));

        int hexNumber = 0x1f4; 
        System.out.println(hexNumber);

    }
    
}
