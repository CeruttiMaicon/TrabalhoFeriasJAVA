package TrabalhoFerias;

import java.io.FileWriter;
import java.io.IOException;

// Este arquivo foi criado para seguir de exemplo

public class GenerateCsv
{
   public static void main(String [] args)
   {
       generateCsvFile("/home/dev3/Documentos"); 
   }

   private static void generateCsvFile(String sFileName)
   {
    try
    {
        FileWriter writer = new FileWriter(sFileName);

        writer.append("DisplayName");
        writer.append(',');
        writer.append("Age");
        writer.append('\n');

        writer.append("MKYONG");
        writer.append(',');
        writer.append("26");
        writer.append('\n');

        writer.append("YOUR NAME");
        writer.append(',');
        writer.append("29");
        writer.append('\n');

        //generate whatever data you want

        writer.flush();
        writer.close();
    }
    catch(IOException e)
    {
         e.printStackTrace();
    } 
    }
}