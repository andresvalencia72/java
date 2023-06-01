package dboolean;

public class PrimitivosBoolean {
    public static void main(String[] args) {
        
        /* /**
        The {@code Boolean} object corresponding to the primitive
        value {@code false}.
        public static final Boolean FALSE = new Boolean(false); 
     */

        boolean datoLogico =true; // Boolean.FALSE retorna una instancia
        System.out.println(datoLogico);

        double d  = 98765.43e-3; // 98.76543
        float f = 1.2345e2F; // 123.45
        System.out.println(d);
        System.out.println(f);

        datoLogico = d > f;
        System.out.println("d > f "+datoLogico);


    }    
}
