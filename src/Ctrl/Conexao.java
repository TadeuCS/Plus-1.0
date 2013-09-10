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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Conexao {

    public static Connection con;
    public static Statement st;
    static String ip = "";
    static String diretorio = "";
    static String senha = "";
    static String usuario = "";

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
        diretorio = ip+":3050/"+linha2;
        usuario = "SYSDBA";
        senha = "masterkey";
    }

    public void Conecta() {
        try {
            leArquivo();
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            con = DriverManager.getConnection("jdbc:firebirdsql://" + diretorio, usuario, senha);
            st = con.createStatement();
            Principal p =new Principal();
            p.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexão Não Estabelecida!");
            Principal p =new Principal();
            p.setVisible(false);
            TestaConexao conecta = new TestaConexao();
            conecta.setVisible(true);
        }
    }

    public void Desconecta() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ex);
        }
    }

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        Conexao.con = con;
    }

    public static Statement getSt() {
        return st;
    }

    public static void setSt(Statement st) {
        Conexao.st = st;
    }

    
}
