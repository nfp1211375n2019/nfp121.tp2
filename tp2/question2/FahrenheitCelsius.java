package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (joe estephan) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
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
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
      float celsius=0.0f;
         celsius = ((float)f-32)*5/9;
         return celsius;
     }

}
