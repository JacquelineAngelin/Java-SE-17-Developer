//package repeater.auto;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.util.ArrayList;
//
//public class Aluno {
//
//    ArrayList aluno = new ArrayList();
//
//    File caminhoDoTexto = new File("C:\\Users\\jacqueline.silva\\Projetos\\estudos");
//
//    FileReader lerCaminhoDoTexto;
//
//    {
//        try {
//            lerCaminhoDoTexto = new FileReader(caminhoDoTexto, StandardCharsets.UTF_8);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    BufferedReader lerArquivo = new BufferedReader(lerCaminhoDoTexto);
//
//    while(lerArquivo.read())
//
//    {
//        String texto = null;
//        try {
//            texto = lerArquivo.readLine();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String[] textoSplit = texto.split(";");
//
//        for (int posicao = 0; posicao < 4; posicao++) {
//            dadosAluno.aluno.add(textoSplit[posicao]);
//            System.out.print(textoSplit[1]);
//        }
//    }
//    lerArquivo.close();
//}
