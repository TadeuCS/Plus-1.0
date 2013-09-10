/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.Cadastros;

import Ctrl.Conexao;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Tadeu
 */
public class Cad_Cliente extends javax.swing.JFrame {

    Conexao c= new Conexao();
    static Connection con;
    static Statement st;
    public Cad_Cliente() {
        initComponents();
        con=c.getCon();
        st=c.getSt();
    }
    public void Enter(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            findbyCEP(txt_cep_cob.getText());
        }
    }
        public void findbyCEP(String cep){
        try{
         st= con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM CEP WHERE CEP like '%" + cep + "%'");
        while (rs.next()) {
            cbx_uf_cob.setSelectedItem(rs.getString("UF"));
            txt_cidade_cob.setText(rs.getString("CIDADE"));
            txt_bairro_cob.setText(rs.getString("BAIRRO"));
            txt_logradouro_cob.setText(rs.getString("LOGRADOURO"));
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "erro: "+e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_fundo = new javax.swing.JPanel();
        pnl_dadosPessoais = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_contato = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JFormattedTextField();
        txt_cpf = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_nomeFantasia = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        txt_incricaoEstadual = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_rg = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        pnl_enderecoCobranca = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_cidade_cob = new javax.swing.JTextField();
        cbx_uf_cob = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_bairro_cob = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_logradouro_cob = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_numero_cob = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_complemento_cob = new javax.swing.JTextField();
        txt_cep_cob = new javax.swing.JTextField();
        pnl_enderecoEntrega = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        txt_end_cep = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        txt_end_cid = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txt_end_bairro = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txt_end_logradouro = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        txt_end_numero = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txt_end_complemento = new javax.swing.JTextField();
        pnl_rodape = new javax.swing.JPanel();
        btn_inclusao = new javax.swing.JButton();
        btn_alteracao = new javax.swing.JButton();
        btn_consulta = new javax.swing.JButton();
        btn_exclusao = new javax.swing.JButton();
        txt_operacao = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        btn_cad_cliente1 = new javax.swing.JLabel();
        btn_cad_cliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        pnl_dadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados Pessoais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jLabel4.setText("Telefone:");

        jLabel5.setText("Email:");

        jLabel6.setText("Tipo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Física", "Jurídica" }));

        jLabel7.setText("CPF:");

        jLabel8.setText("Contato:");

        try {
            txt_telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txt_cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_cpf.setToolTipText("");

        jLabel9.setText("Nome Fantasia:");

        jCheckBox1.setText("Bloqueado");

        jLabel10.setText("Inscrição Estadual:");

        try {
            txt_rg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel13.setText("RG:");

        javax.swing.GroupLayout pnl_dadosPessoaisLayout = new javax.swing.GroupLayout(pnl_dadosPessoais);
        pnl_dadosPessoais.setLayout(pnl_dadosPessoaisLayout);
        pnl_dadosPessoaisLayout.setHorizontalGroup(
            pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_incricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_rg, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nome))
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_nomeFantasia))
                    .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_contato, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_email)))
                .addContainerGap())
        );
        pnl_dadosPessoaisLayout.setVerticalGroup(
            pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_dadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_nome)
                    .addComponent(txt_codigo)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_contato, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(txt_email)
                    .addComponent(jLabel5)
                    .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(txt_telefone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_dadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_incricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnl_enderecoCobranca.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço Cobrança", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel3.setText("CEP:");

        jLabel11.setText("Cidade:");

        cbx_uf_cob.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MG" }));

        jLabel12.setText("UF:");

        jLabel14.setText("Bairro:");

        jLabel15.setText("Logradouro:");

        jLabel16.setText("Número:");

        jLabel17.setText("Complemento:");

        txt_cep_cob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_cep_cobKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnl_enderecoCobrancaLayout = new javax.swing.GroupLayout(pnl_enderecoCobranca);
        pnl_enderecoCobranca.setLayout(pnl_enderecoCobrancaLayout);
        pnl_enderecoCobrancaLayout.setHorizontalGroup(
            pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_enderecoCobrancaLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_enderecoCobrancaLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_cep_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbx_uf_cob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_enderecoCobrancaLayout.createSequentialGroup()
                        .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_enderecoCobrancaLayout.createSequentialGroup()
                                .addComponent(txt_bairro_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_enderecoCobrancaLayout.createSequentialGroup()
                                .addComponent(txt_numero_cob, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel17)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_complemento_cob, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(txt_logradouro_cob)
                    .addComponent(txt_cidade_cob))
                .addContainerGap())
        );
        pnl_enderecoCobrancaLayout.setVerticalGroup(
            pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_enderecoCobrancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cidade_cob)
                    .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel3)
                        .addComponent(cbx_uf_cob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(txt_cep_cob)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_logradouro_cob)
                    .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_bairro_cob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_complemento_cob)
                    .addGroup(pnl_enderecoCobrancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel17)
                        .addComponent(txt_numero_cob)))
                .addContainerGap())
        );

        pnl_enderecoEntrega.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Endereço Entrega", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel25.setText("CEP:");

        try {
            txt_end_cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_end_cep.setText("");
        txt_end_cep.setToolTipText("");

        jLabel26.setText("Cidade:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MG" }));

        jLabel27.setText("UF:");

        jLabel28.setText("Bairro:");

        jLabel29.setText("Logradouro:");

        jLabel30.setText("Número:");

        jLabel31.setText("Complemento:");

        javax.swing.GroupLayout pnl_enderecoEntregaLayout = new javax.swing.GroupLayout(pnl_enderecoEntrega);
        pnl_enderecoEntrega.setLayout(pnl_enderecoEntregaLayout);
        pnl_enderecoEntregaLayout.setHorizontalGroup(
            pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_enderecoEntregaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_enderecoEntregaLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_end_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_enderecoEntregaLayout.createSequentialGroup()
                        .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_enderecoEntregaLayout.createSequentialGroup()
                                .addComponent(txt_end_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_enderecoEntregaLayout.createSequentialGroup()
                                .addComponent(txt_end_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel31)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_end_complemento, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                    .addComponent(txt_end_logradouro)
                    .addComponent(txt_end_cid))
                .addContainerGap())
        );
        pnl_enderecoEntregaLayout.setVerticalGroup(
            pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_enderecoEntregaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_end_cid)
                    .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(txt_end_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel25)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_end_logradouro)
                    .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_end_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel28)
                        .addComponent(jLabel29)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_end_complemento)
                    .addGroup(pnl_enderecoEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(jLabel31)
                        .addComponent(txt_end_numero)))
                .addContainerGap())
        );

        pnl_rodape.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_inclusao.setText("Inclusão");

        btn_alteracao.setText("Alteração");

        btn_consulta.setText("Consulta");

        btn_exclusao.setText("Exclusão");

        txt_operacao.setEditable(false);

        jLabel32.setText("Operação:");

        btn_cad_cliente1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_cad_cliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnl_rodapeLayout = new javax.swing.GroupLayout(pnl_rodape);
        pnl_rodape.setLayout(pnl_rodapeLayout);
        pnl_rodapeLayout.setHorizontalGroup(
            pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_rodapeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_inclusao)
                .addGap(18, 18, 18)
                .addComponent(btn_alteracao)
                .addGap(18, 18, 18)
                .addComponent(btn_exclusao)
                .addGap(18, 18, 18)
                .addComponent(btn_consulta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_cad_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cad_cliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_operacao, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnl_rodapeLayout.setVerticalGroup(
            pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_rodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cad_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cad_cliente1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_exclusao)
                        .addComponent(btn_consulta)
                        .addComponent(txt_operacao)
                        .addComponent(jLabel32))
                    .addGroup(pnl_rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_inclusao)
                        .addComponent(btn_alteracao)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnl_fundoLayout = new javax.swing.GroupLayout(pnl_fundo);
        pnl_fundo.setLayout(pnl_fundoLayout);
        pnl_fundoLayout.setHorizontalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_dadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_enderecoCobranca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_enderecoEntrega, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_rodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_fundoLayout.setVerticalGroup(
            pnl_fundoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_fundoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_dadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_enderecoCobranca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_enderecoEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_rodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_fundo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        c.Desconecta();
    }//GEN-LAST:event_formWindowClosed

    private void txt_cep_cobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cep_cobKeyPressed
        Enter(evt);
    }//GEN-LAST:event_txt_cep_cobKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Cliente().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alteracao;
    private javax.swing.JLabel btn_cad_cliente;
    private javax.swing.JLabel btn_cad_cliente1;
    private javax.swing.JButton btn_consulta;
    private javax.swing.JButton btn_exclusao;
    private javax.swing.JButton btn_inclusao;
    private javax.swing.JComboBox cbx_uf_cob;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnl_dadosPessoais;
    private javax.swing.JPanel pnl_enderecoCobranca;
    private javax.swing.JPanel pnl_enderecoEntrega;
    private javax.swing.JPanel pnl_fundo;
    private javax.swing.JPanel pnl_rodape;
    private javax.swing.JTextField txt_bairro_cob;
    private javax.swing.JTextField txt_cep_cob;
    private javax.swing.JTextField txt_cidade_cob;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_complemento_cob;
    private javax.swing.JTextField txt_contato;
    private javax.swing.JFormattedTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_end_bairro;
    private javax.swing.JFormattedTextField txt_end_cep;
    private javax.swing.JTextField txt_end_cid;
    private javax.swing.JTextField txt_end_complemento;
    private javax.swing.JTextField txt_end_logradouro;
    private javax.swing.JTextField txt_end_numero;
    private javax.swing.JFormattedTextField txt_incricaoEstadual;
    private javax.swing.JTextField txt_logradouro_cob;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_nomeFantasia;
    private javax.swing.JTextField txt_numero_cob;
    private javax.swing.JTextField txt_operacao;
    private javax.swing.JFormattedTextField txt_rg;
    private javax.swing.JFormattedTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}