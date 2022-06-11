package repeater.auto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NanoAutomatedReader {

    public static void main (String[] args){

        String path = "C:\\Users\\jacqueline.silva\\Projetos\\estudos\\alunos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                System.out.println(line + " complemento do texto" + "\n" + "*. "+ line + " complemento do texto");
                line = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
