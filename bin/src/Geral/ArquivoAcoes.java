/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoaed_2.master.Geral;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * 
 */
public class ArquivoAcoes {
    public static String ler(String pathOrigem) throws IOException{
        String textoLido = "";
        // TODO Ler arquivo pelo Path informado
        try {        
            FileReader arq = new FileReader(pathOrigem);
            BufferedReader lerArq = new BufferedReader(arq);
            String linhaLida = lerArq.readLine();
            while (linhaLida != null) 
            {
              textoLido += linhaLida;
              linhaLida = lerArq.readLine();                  
            }
            arq.close();
        } catch (Exception e) {
            System.err.printf("Arquivo inexistente.\n",
              e.getMessage());
        }  
        return textoLido;
    }
    
    public static void salvar(String pathDestino, String texto) throws IOException{
        try 
        {
            File arquivo = new File(pathDestino);
            FileWriter writer = new FileWriter(arquivo);  
            BufferedWriter buffwriter = new BufferedWriter(writer);  

            buffwriter.write(texto);  
            buffwriter.flush();  
            buffwriter.close();    
        } catch (Exception e) {
           System.err.printf("Erro ao escrever arquivo.\n",
              e.getMessage()); 
        }
    }
}
