package fundamentals.methods;

public class Message {

    public static void findMessage(int hora){

        if (hora >= 1 || hora <= 12){
            messageBomdia();
        }
        if (hora > 12 && hora <= 17){
            messageBoaTarde();
        }
        if (hora > 17 && hora <= 24){
            messageBoaNoite();
        }
        else {
            System.out.println("Hora invalida");
        }
    }

    public static void messageBomdia(){
        System.out.println("Bom dia");
    }

    public static void messageBoaTarde (){
        System.out.println("Boa tarde");
    }

    public static void messageBoaNoite(){
        System.out.println("Boa noite");
    }
}
