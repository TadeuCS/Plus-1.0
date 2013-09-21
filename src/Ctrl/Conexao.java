/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import View.Home.TestaConexao;
import View.Home.Principal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JFrame;
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
        diretorio = "jdbc:firebirdsql://"+ip+":3050/"+linha2;
        System.out.println(diretorio);
    }
    
    public void Conecta(){
        try{
            leArquivo();
         emf= Persistence.createEntityManagerFactory("Plus_PU", getConf());
         em=emf.createEntityManager();
        Query query=em.createNativeQuery("SELECT C.DESCRICAO FROM PRODUTO C where c.CODPROD=1");
        System.out.println(query.getResultList()+"\n");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public static Map getConf() {
        Map prop = new HashMap();
        try{
        prop.put("javax.persistence.jdbc.url", diretorio);
            System.out.println("deu certo");
        }catch(Exception e){
            System.out.println("deu errado"+e.getMessage());
        }
        return prop;
    }

    public void Desconecta() {
        try {
            em.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ex);
        }
    }

    
}
