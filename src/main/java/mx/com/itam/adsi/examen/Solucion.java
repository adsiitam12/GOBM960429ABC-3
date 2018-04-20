package mx.com.itam.adsi.examen;
/**Clase Solucion para el examen.
 *
 */
import org.apache.log4j.Logger;

public class Solucion{
    private final static Logger LOG = Logger.getLogger(Solucion.class);   
    /*Sirve porque si existe la subcadena que genera la solucion, cuando duplicamos la cadena original esta debe estar en el centro de la nueva cadena, y al dublicar volemos a escribir la cadena. Quitamos los extremos porque queremos excluir la cadena completa.
    * Por ejemplo, si tenemos  'abab' y la duplcamos, quitando los extremos tenemos 'a bababa b' Y vemos que la cadena original tiene que estar contenida
    * Esto se debe a que si tenemos que x es la subcadena y la original es xxx, la duplicada sera xxxxxx que necesariamente contiene a la original varias veces, pero de sino genera nunca la contiene.
    *La soln. es mas eficiente, pues es tiempo constante y no depende del tamano de la cadena.
    */
   public static boolean gus(String str){
       String s = str+str;
       return s.substring(1,s.length()-1).contains(str);
   }

   public static void main(String...argv) {
        
   }
}
