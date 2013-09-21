/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import View.Home.Principal;
import View.Home.TestaConexao;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Conexao {

    static String ip = "";
    static String diretorio = "";
    static EntityManagerFactory emf;
    static EntityManager em;
    static TestaConexao testaConexao = new TestaConexao();

    public void Conecta() {


        try {
            leArquivo();
            emf = Persistence.createEntityManagerFactory("Plus_PU", getConf());
            em = emf.createEntityManager();
        } catch (Exception e) {
            System.out.println();
        }
    }

    public void leArquivo() throws Exception {
        File file = new File("C:/Plus 1.0/src/Ctrl/config.txt");
        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestaConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(fr);

        String linha = br.readLine();
        ip = linha;
        String linha2 = br.readLine();
        diretorio = "jdbc:firebirdsql://" + ip + ":3050/" + linha2;
        System.out.println(diretorio);
    }

    public static Map getConf() {
        Map prop = new HashMap();
        try {
            prop.put("javax.persistence.jdbc.url", diretorio);
            System.out.println("conectou no diretorio: " + diretorio);
        } catch (Exception e) {
            System.out.println("deu errado" + e.getMessage());
        }
        return prop;
    }

    public void Desconecta() {
        try {
            em.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: " + ex);
        }
    }
}
