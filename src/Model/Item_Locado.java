/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
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
public class Item_Locado extends Produto{
    @OneToOne
    private Produto item_locado;
    private int qtde;
    private float valorUnitario;

    public Produto getItem_locado() {
        return item_locado;
    }

    public void setItem_locado(Produto item_locado) {
        this.item_locado = item_locado;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

}
