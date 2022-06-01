package overloading.methods;

public class MainOverloading {

    public static void main (String[] args){

//        //Tetragon
        System.out.println("Quadrilatero");
        Tetragon.area(3);
        Tetragon.area(5d, 5d);
        Tetragon.area(7, 3, 2);
        Tetragon.area(5f, 5f);
    }
}
