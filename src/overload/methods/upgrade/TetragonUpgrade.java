package overload.methods.upgrade;

public class TetragonUpgrade {

    public static double area (double lado){
        return (lado * lado);
        //System.out.println("Area do quadrado: " + lado * lado);
    }

    public static double area (double lado1, double lado2){
        return (lado1 * lado2);
        //System.out.println("Area do retangulo: " + lado1 * lado2);
    }

    public static double area (double baseMaior, double baseMenor, double altura){
        return ((baseMaior+baseMenor)*altura)/2;
        //System.out.println("Area do trapezio: " + ((baseMaior+baseMenor)*altura)/2);
    }

    public static float area (float diagonal1, float diagonal2){
        return (diagonal1*diagonal2)/2;
        //System.out.println("Area do losango: " + (diagonal1*diagonal2)/2);
    }
}
