package bvariables;

import javax.sound.sampled.AudioFileFormat.Type;

public class variables {

    // static long varFloat; por defecto se inicializa en 0
    public static void main(String[] args) {
        /* Son los datos, información de nuestro programa 
            se conforma de dos partes, tipo de dato de la variable y su nombre
            TipoDato nombreVariable

            desde java 10 hay un tipo de dinamico var

         */

         /* Categorias de tipos 
            -primitivos: Contiene un sólo valor e incluyen los tipos como los enteros, flotantes, los caracteres, booleanos etc. 
            Ejemplos: 
                int numero;
                int numero=10;
                Integer numero = 10; //clase integer (wrapper)
            -referencia: 
                String nombre = "Andrés" // cadena de caracteres

            Reglas para definir nombres de variables 
                - Los nombres de las variables empiezan con una letra miúscula
                - Deben ser un juego de caracteres comprendidos en al codificación Unicode
                - No puede ser el mismo que una palabra reservada del lenguaje o el nombre de un valor booleano
                - No debe tener el mismo nombre que otra variable cuya declartación aparezca en el mismo ámbito
                -Si una variable está compuesta de más de una palabra, como 'nombreDato' las palabras despues de la primera empeiza con una letra mayuscula.
                - Pueden comenzar por una letra, un subrayado o un simbolo de dólar, siendo los siguientes caracteres letras o dígitos.
          */


        //   Ejemplos de variables 

        /* String saludar = "Hola mundo desde Java"; //por debajo se crea una instancia de string es decir new String()
        System.out.println(saludar);
        System.out.println("saludar.toUpperCase " + saludar.toUpperCase());
        
        // Números 
        int numero = 10;
        // Integer clase wrapper de int
        Integer numeroWrapper =10;
        
        System.out.println(numero);
        System.out.println(numeroWrapper);

        // booleanos
        boolean valor = true;

        if(valor){
            System.out.println("El valor es verdadero");
            // int numero; el nombre de la variable ya ha sido declarado en el ambito global
        }else{
            System.out.println("El valor es falso");
            // int otroNumero=0;
        }
        // System.out.println(otroNumero); la varible se encuentra fuera del ambito donde ha sido declarada

        
        // version 10 del jdk aparece var

        var nombre = "este es un tipo de dato inferido según la literal";
        System.out.println(nombre); */


        /* Reglas para definir una varible */


       /*  int numero = 15; 
        String nombre;
        if(numero>10){
            nombre="Andres";
        }else{
            nombre="Felipe";
        }
        System.out.println(nombre); */

        // No usar palabras reservadas del lenguaje por ejemplo int class = 5;
        // No puede comnzar con un número int 1edad= 15;
        // Se permite el _ y el $ no es habitual el uso pero se puede
        // Convención de nombres de variables con lowwerCamelCase constantes en mayuscula y nombres de clases en UpperCamelCase
        // Evitar el uso de acentos, ñ o caracteres especiales


        /* Tipos Primitivos 
            solo representan y tienen un solo valor. Tenemos:
                -Enteros
                -Flotantes
                -Caracteres
                -Booleanos
            tipado estrico se escriben en minúscula.
            boolean a = true;
            boolean b = false; // Ocupan un solo bite

            Caracteres usa el código UNICODE y ocupa cada carácter 16 bits 
            char a = 'a';
            char b = '1';
            char c = '\u0021'

            Números enteros
            byte -128 a 127 usa un bit para representar el signo
            short -32768 a 32767
            int 

            Números reales
            float entre -1.4E-45 a 3.4028235E38.
            double -4.9E-324 a 1.797693134862...
        **************************** RESUMEN *******************

            boolean 1 bit -> false valor por defecto
            CARACTER 16 bits ->u0000
            entero byte 8 bits -> 0
            entero short 16 bits ->0
            entero int 32 bits -> 0
            entero long 64 bits -> 0
            float       64 bits -> 0.0f
            double      64 bits -> 0.0d
          */



          /* Primitivos númericos enteros */

          byte numberByte = 1; // se almacena en 8 bits 
    
          System.out.println("numberByte: "+numberByte);
          System.out.println("tipo byte corresponde en byte a " + Byte.BYTES);
          System.out.println("tipo byte corresponde en byte a " + Byte.SIZE);
          System.out.println("valor máximo de un byte" + Byte.MAX_VALUE);
          System.out.println("valor minimo de un byte" + Byte.MIN_VALUE);

          short numberShort = 32767;
          System.out.println("numberShort: " + numberShort);
          System.out.println("tipo short corresponde a byte a: " + Short.BYTES);
          System.out.println("tipo short corresponde a bites a: " + Short.SIZE);
          System.out.println("valor máximo de un short: " + Short.MAX_VALUE);
          System.out.println("valor minimo de un short: " + Short.MIN_VALUE);

          int numberInt = 2147483647;
          System.out.println("numberInt: "+numberInt);
          System.out.println("tipo int corresponde a byte a: " + Integer.BYTES);
          System.out.println("tipo int corresponde a bites a: " + Integer.SIZE);
          System.out.println("valor máximo de un int: " + Integer.MAX_VALUE);
          System.out.println("valor minimo de un int: " + Integer.MIN_VALUE);


          Long numberLong = 9223372036854775807L;
          System.out.println("numberLong: "+numberLong);
          System.out.println("tipo Long corresponde a byte a: " + Long.BYTES);
          System.out.println("tipo Long corresponde a bites a: " + Long.SIZE);
          System.out.println("valor máximo de un Long: " + Long.MAX_VALUE);
          System.out.println("valor minimo de un Long: " + Long.MIN_VALUE);

          var numberVar = 9223372036854775807L;
          System.out.println(numberVar);




          /* Primtivos Float */


          float numberFloat = 2.12e3f; //2120f; // notación cientifica //1.5e-10f;
          System.out.println(numberFloat);

          System.out.println("numberFloat: "+numberFloat);
          System.out.println("tipo Float corresponde a byte a: " + Float.BYTES);
          System.out.println("tipo Float corresponde a bites a: " + Float.SIZE);
          System.out.println("valor máximo de un Float: " + Float.MAX_VALUE);
          System.out.println("valor minimo de un Float: " + Float.MIN_VALUE);

          double numberDouble = 2.12e3; //2120f; // notación cientifica //1.5e-10f;
          System.out.println(numberFloat);

          System.out.println("numberDouble: "+numberDouble);
          System.out.println("tipo Double corresponde a byte a:" + Double.BYTES);
          System.out.println("tipo Double corresponde a bites a: " + Double.SIZE);
          System.out.println("valor máximo de un Double: " + Double.MAX_VALUE);
          System.out.println("valor minimo de un Double: " + Double.MIN_VALUE);

        //   float varFlotante;
        //   System.out.println("varFlotante = " + varFlotante); debe inicializarse 



    }
}
