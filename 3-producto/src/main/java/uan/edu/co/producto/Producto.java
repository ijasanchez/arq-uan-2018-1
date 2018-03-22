package uan.edu.co.producto;

// Ejemplo 2.6: Producto.java
// Calcular el producto de tres enteros.
import java.util.Scanner; // el programa usa Scanner

public class Producto 
{
   public static void main( String args[] )
   {
      // crea objeto Scanner para obtener la entrada de la ventana de comandos
      Scanner entrada = new Scanner( System.in );

      int x; // primer n�mero introducido por el usuario
      int y; // segundo n�mero introducido por el usuario
      int z; // tercer n�mero introducido por el usuario
      int resultado; // producto de los n�meros

      System.out.print( "Escriba el primer entero: " ); // indicador de entrada
      x = entrada.nextInt(); // lee el primer entero

      System.out.print( "Escriba el segundo entero: " ); // indicador de entrada
      y = entrada.nextInt(); // lee el segundo entero
      
      System.out.print( "Escriba el tercer entero: " ); // indicador de entrada
      z = entrada.nextInt(); // lee el tercer entero

      resultado = x * y * z; // calcula el producto de los n�meros

      System.out.printf( "El producto es %d\n", resultado );
   } // fin del m�todo main
} // fin de la clase Producto


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