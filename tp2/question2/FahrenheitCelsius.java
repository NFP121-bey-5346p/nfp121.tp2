package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
         int fahrenheit = 0;
        float celsius = 0;
        for(int i =0; i<args.length;i++){
       try{
           fahrenheit = Integer .parseInt(args[i]);
        celsius = fahrenheitEnCelsius(fahrenheit);
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
       
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  
       }
    }
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       // ...
       float c = (float)5/9*(f-32);
        return ((int)(c*10)/10.0F);    // � compl�ter    en rempla�ant la valeur retourn�e par la fonction de conversion
       // ...
     }

}
