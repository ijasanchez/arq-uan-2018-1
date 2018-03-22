package uan.edu.co.comparacion;

// Fig. 2.15: COmparacion.java
// Compara enteros utilizando instrucciones if, operadores relacionales  
// y de igualdad.
import java.util.Scanner; // el programa utiliza la clase Scanner

public class Comparacion 
{
   // el m�todo main empieza la ejecuci�n de la aplicaci�n en Java
   public static void main( String[] args )
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      int numero1; // primer n�mero a comparar
      int numero2; // segundo n�mero a comparar

      System.out.print( "Escriba el primer entero: " ); // indicador 
      numero1 = entrada.nextInt(); // lee el primer n�mero del usuario

      System.out.print( "Escriba el segundo entero: " ); // indicador 
      numero2 = entrada.nextInt(); // lee el segundo n�mero del usuario 
      
      if ( numero1 == numero2 ) 
         System.out.printf( "%d == %d\n", numero1, numero2 );

      if ( numero1 != numero2 )
         System.out.printf( "%d != %d\n", numero1, numero2 );

      if ( numero1 < numero2 )
         System.out.printf( "%d < %d\n", numero1, numero2 );

      if ( numero1 > numero2 )
         System.out.printf( "%d > %d\n", numero1, numero2 );

      if ( numero1 <= numero2 )
         System.out.printf( "%d <= %d\n", numero1, numero2 );

      if ( numero1 >= numero2 )
         System.out.printf( "%d >= %d\n", numero1, numero2 );
   } // fin del m�todo main
} // fin de la clase Comparacion


/**************************************************************************
 * (C) Copyright 1992-2012 por Deitel & Associates, Inc. y                *
 * Pearson Education, Inc. Todos los derechos reservados.                 *
 *                                                                        *
 * RENUNCIA: Los autores y el editor de este libro han realizado su mejor *
 * esfuerzo para preparar este libro. Esto incluye el desarrollo, la      *
 * investigaci�n y prueba de las teor�as y programas para determinar su   *
 * efectividad. Los autores y el editor no hacen ninguna garant�a de      *
 * ning�n tipo, expresa o impl�cita, en relaci�n con estos programas o    *
 * con la documentaci�n contenida en estos libros. Los autores y el       *
 * editor no ser�n responsables en ning�n caso por los da�os consecuentes *
 * en conexi�n con, o que surjan de, el suministro, desempe�o o uso de    *
 * estos programas.                                                       *
 *************************************************************************/