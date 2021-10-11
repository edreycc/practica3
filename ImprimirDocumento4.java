
/**
 * Write a description of class ImprimirDocumento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImprimirDocumento4
{
   public int impreciones (int documento){
       int division = documento/2;
       int residuo  = documento%2;
       int res      = division + residuo;
       return  res;
    }
}
