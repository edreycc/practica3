
/**
 * Write a description of class Ejercicio6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ejercicio6
{
  public String intercambio(int A,int B,int C){
     int aux=0;
     String resultado ="";
     aux=A;
     A=B;
     B=aux;
     aux=A;
     A=C;
     C=aux;
     resultado = A+" "+B+" "+C; 
     return resultado;
    }
}
