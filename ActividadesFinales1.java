/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadesfinales1;

/**
 *
 * @author Toni
 */
public class ActividadesFinales1 {

    /**
     * @param args the command line arguments
     */
    
    //Declaramos el array con las distintas provincias
    public enum Comunidades {ALMERIA, CADIZ, CORDOBA, GRANADA, HUELVA, JAEN, MALAGA, SEVILLA};
    public static void main(String[] args) {
        
        //----------------------
        //  Creación de variables
        //----------------------
        
        Comunidades comunidad;//Creamos una variable sin llegar a inicializarla llamada comunidad
        
        //----------------------
        //  SALIDA DE DATOS
        //----------------------

        System.out.println("PROVINCIAS DE ANDALUICIA \n -------------------------------");//Creamos un enunciado para mejor visibilidad de los datos en el momento de salida
        
        
        comunidad = Comunidades.ALMERIA;//Primera inicialización de la variable creada en la linea 26 con el primer elemento de nuestro array
        System.out.println("Provincia 1: " + comunidad);
        
        comunidad = Comunidades.CADIZ;//sobreescribimos nuestra variable con el siguiente valor de neustro array
        System.out.println("Provincia 2: " + comunidad);
        
        comunidad = Comunidades.CORDOBA;//sobreescribimos nuestra variable con el siguiente valor de neustro array
        System.out.println("Provincia 3: " + comunidad);
        
        comunidad = Comunidades.GRANADA; //sobreescribimos nuestra variable con el siguiente valor de neustro array
        System.out.println("Provincia 4: " + comunidad);
        
        comunidad = Comunidades.HUELVA; //sobreescribimos nuestra variable con el siguiente valor de neustro array
        System.out.println("Provincia 5: " + comunidad);
        
        comunidad = Comunidades.JAEN; //sobreescribimos nuestra variable con el siguiente valor de neustro array
        System.out.println("Provincia 6: " + comunidad);
        
        comunidad = Comunidades.MALAGA; //sobreescribimos nuestra variable con el siguiente valor de neustro array
        System.out.println("Provincia 7: " + comunidad);
        
        comunidad = Comunidades.SEVILLA; //sobreescribimos nuestra variable con el siguiente valor de neustro array
        System.out.println("Provincia 8: " + comunidad);
    }
    
}
