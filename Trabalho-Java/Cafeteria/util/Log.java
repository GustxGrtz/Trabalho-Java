package Cafeteria.util;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Log {
    private static final File ARQUIVOLOG = new File("src/log/log.txt");

    public static void gravar(String texto){
        List<String> textos = new ArrayList<>();
        try {
            ARQUIVOLOG.getParentFile().mkdirs();

            if(ARQUIVOLOG.exists()) textos = ler();
            FileWriter file = new FileWriter(ARQUIVOLOG);
            PrintWriter print = new PrintWriter(file);

            for(String string : textos){
                print.println(string);
            }
        } catch (Exception e) {
            System.out.println();
        }
    }

    public static List<String> ler() throws Exception{
        List<String> textos = new ArrayList<>();
        try {
            Scanner scan = new Scanner(ARQUIVOLOG);
            while (scan.hasNextLine()) {
                textos.add(scan.nextLine());
            }
            scan.close();
            return textos;
        } catch (Exception e) {
            throw new Exception("nao foi possivel ler o arquivo" + e.getMessage());
        }
    }
}
