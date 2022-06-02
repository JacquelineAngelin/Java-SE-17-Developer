package overload.methods.upgrade;

public class MainOverloadingUpgrade {

    public static void main (String[] args){

//        //Tetragon
        System.out.println("Quadrilatero Upgrade");

        double areaQuadrado = TetragonUpgrade.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = TetragonUpgrade.area(5d, 5d);
        System.out.println("Area do retangulo: " + areaRetangulo);

        double areaTrapezio = TetragonUpgrade.area(7, 3, 2);
        System.out.println("Area do trapezio: " + areaTrapezio);

        float areaLosango = TetragonUpgrade.area(5f, 5f);
        System.out.println("Area do losango: " + areaLosango);
    }
}
