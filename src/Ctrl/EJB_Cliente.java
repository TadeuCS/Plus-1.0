/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Model.Cliente;
import javax.swing.JOptionPane;


/**
 *
 * @author Tadeu
 */
public class EJB_Cliente {
    
    public static void salvar(Cliente cliente){
        try {
        Conexao.em.getTransaction().begin();
        Conexao.em.persist(cliente);
        Conexao.em.getTransaction().commit();
        JOptionPane.showMessageDialog(null, "Cliente Inserido Com Sucesso");
            System.out.println(cliente);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
    }
}
