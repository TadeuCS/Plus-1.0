/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Tadeu
 */
@Entity
public class Cliente implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_CLIENTE")
    private Long id;
    private String contato;
    private String telefone;
    private String email;
    private String status;
    private String tipo_Pessoa;
    @OneToOne
    private Pessoa_F pessoa_F;
    @OneToOne
    private Pessoa_J pessoa_J;
    @OneToOne
    private End_Cobranca end_Cobranca;
    @OneToOne
    private End_Entrega end_Entrega;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo_Pessoa() {
        return tipo_Pessoa;
    }

    public void setTipo_Pessoa(String tipo_Pessoa) {
        this.tipo_Pessoa = tipo_Pessoa;
    }

    public Pessoa_F getPessoa_F() {
        return pessoa_F;
    }

    public void setPessoa_F(Pessoa_F pessoa_F) {
        this.pessoa_F = pessoa_F;
    }

    public Pessoa_J getPessoa_J() {
        return pessoa_J;
    }

    public void setPessoa_J(Pessoa_J pessoa_J) {
        this.pessoa_J = pessoa_J;
    }

    public End_Cobranca getEnd_Cobranca() {
        return end_Cobranca;
    }

    public void setEnd_Cobranca(End_Cobranca end_Cobranca) {
        this.end_Cobranca = end_Cobranca;
    }

    public End_Entrega getEnd_Entrega() {
        return end_Entrega;
    }

    public void setEnd_Entrega(End_Entrega end_Entrega) {
        this.end_Entrega = end_Entrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cliente[ id=" + id + " ]";
    }
    
}
