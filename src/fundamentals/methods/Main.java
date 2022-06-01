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
        Message.findMessage(17);
        Message.findMessage(21);

        //Financial
        System.out.println("Financial-Financiamento");
        Financial.calculatorValue(1000, Financial.getDuasParcelas());
        Financial.calculatorValue(1000, Financial.getTresParcelas());
        Financial.calculatorValue(1000, 5);
    }
}
