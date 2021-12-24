package kata3_v2;

/**
 * @author Mele13
 * 
 * Segunda versión de Kata3.
 * Crea y muestra un histograma de dominios de correo electrónico.
 */
public class Kata3_v2 {

    /**
     * @param args 
     */
    public static void main(String[] args) {
        Histogram_v2<String> histogram = new Histogram_v2<>();
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        histogram.increment("yahoo.es");
        histogram.increment("hotmail.com");
        histogram.increment("yahoo.es");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");        
        
        new HistogramDisplay_v2(histogram).execute();
    }    
}