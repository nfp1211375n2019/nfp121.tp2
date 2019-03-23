package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (joe estephan) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
       int fahrenheit = 0;
		float celsius = 0;
		celsius = fahrenheitEnCelsius(fahrenheit);
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
      float celsius=0.0f;
         celsius = ((float)f-32)*5/9;
         return celsius;
     }

}
