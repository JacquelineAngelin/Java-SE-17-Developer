package fundamentals.methods;

public class Main {

    public static void main (String[] args){

        //Calculor
        System.out.println("Caculator");
        Calculator.soma(3, 6);
        Calculator.subtracao(9, 1.8);
        Calculator.multiplicacao(7, 8);
        Calculator.divisao(5, 2.5);

        //Message
        System.out.println("Message");
        Message.findMessage(9);
        Message.findMessage(14);
        Message.findMessage(1);
    }
}
