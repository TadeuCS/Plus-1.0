/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ctrl;

import Model.Usuario;
import javax.persistence.Query;

/**
 *
 * @author Tadeu
 */
public class EJB_Usuario {

    public static boolean Resultado = false;

    public static boolean BuscaPorUsuarioSenha(String Usuario, String Senha) {
        Usuario user = new Usuario();

        try {
            Query query = Conexao.em.createQuery("SELECT u FROM Usuario u");
            if (query.getMaxResults() > 0) {
                System.out.println("Usuario:" + query.getResultList());
                Resultado = true;
            } else {
                Resultado = false;
            }

        } catch (Exception e) {
            System.out.println("erro: " + e.getMessage());
        }
        return Resultado;
    }
}
