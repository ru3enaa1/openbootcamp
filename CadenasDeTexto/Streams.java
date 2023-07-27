package CadenasDeTexto;

import java.io.*;

public class Streams {

    public void streamInPrnt (){

        File file = new File("sample.txt");
        if (!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println("Excepcion: " +e.getMessage());
            }
        }

        try{
        InputStream fichero = new FileInputStream(file);
        byte[] fileIn = fichero.readAllBytes();

        PrintStream fileOut = new PrintStream("copia.file2");
        fileOut.write(fileIn);

        System.out.println("Copiado Exitosamente");

        }catch (Exception e){
            System.out.println("Excepcion: "+e);
        }
    }
}
