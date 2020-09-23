/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgramaMercearia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gabri
 */
public class FakeBD {
    
    private static Vector<Produto> produtos;
    
    private static void carga() {
        
        if (produtos == null) {
            produtos = new Vector<>();
        } else {
            produtos.clear();
        }
        
        File arqCsv = new File("C:\\Users\\gabri\\Documents\\produtos.csv");
        try {
            
            FileReader marcaLeitura = new FileReader(arqCsv);
            BufferedReader bufferLeitura = new BufferedReader(marcaLeitura);            
            String linha = "";
            bufferLeitura.readLine();
            linha = bufferLeitura.readLine();
            while (linha != null) {
                
                String infos[] = linha.split(";");
                int cod = Integer.parseInt(infos[0]), quant = Integer.parseInt(infos[3]);
                String nome = infos[1];
                double preco = Double.parseDouble(infos[2]);
                
                produtos.add(new Produto(cod, quant, nome, preco));
                linha = bufferLeitura.readLine();
            }
            bufferLeitura.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Arquivo verificado não existe");
        } catch (IOException e) {
            System.err.println("Arquivo corrompido");
        }
        
    }
    
    public static Produto consultaProdutoCod(int cod) {
        if (produtos == null) {
            carga();
        }
        
        for (Produto prodI : produtos) {
            if (prodI.getCod() == cod) {
                return prodI;
            }
        }
        return null;
    }
    
    public static void atualizaArquivo() {
        File arquivo = new File("C:\\Users\\gabri\\Documents\\produtos.csv");
        try {
            FileWriter escrita = new FileWriter(arquivo);
            BufferedWriter bufEscrita = new BufferedWriter(escrita);
            
            for (Produto i : produtos) {
                bufEscrita.write(i + "\n");
            }
            bufEscrita.flush();
            bufEscrita.close();
            
        } catch (IOException ex) {
            System.err.println("dispositivo com falha");
        }
        
    }
}
