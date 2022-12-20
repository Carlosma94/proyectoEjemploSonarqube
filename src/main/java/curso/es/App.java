package curso.es;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //System.out.println( App.sumar(1,5)  );
    }
    
    public static double sumar(double numero1 , double numero2) {
        return numero1 + numero2;
    }
    
    public static double Doblar(double NUMERO) {
        return NUMERO*2;
    }
    
    public static double Triplar(double numero) {
        return numero*3;
    }
    
    public static double Mitad(double numero) {
        return numero/4;
    }
}
