/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaliação.pkg2.doo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Cadastrar extends javax.swing.JFrame implements Serializable {

    int cont = 0, cont2 = 0;
    public Cadastrar() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nome_form = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        desc_form = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cod_form = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        quant_form = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tam_form = new javax.swing.JTextField();
        cadastrar_btn = new javax.swing.JButton();
        camiseta_rb = new javax.swing.JRadioButton();
        cueca_rb = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar");

        jLabel2.setText("Nome");

        jLabel3.setText("Descrição");

        jLabel4.setText("Código");

        jLabel5.setText("Quantidade");

        jLabel6.setText("Tamanho");

        cadastrar_btn.setText("Cadastrar");
        cadastrar_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrar_btnMouseClicked(evt);
            }
        });

        camiseta_rb.setSelected(true);
        camiseta_rb.setText("Camiseta");

        cueca_rb.setText("Cueca");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(camiseta_rb)
                                    .addComponent(cueca_rb))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                                .addComponent(cadastrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nome_form)
                                    .addComponent(desc_form)
                                    .addComponent(cod_form)
                                    .addComponent(quant_form)
                                    .addComponent(tam_form, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nome_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(desc_form, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cod_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(quant_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tam_form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cadastrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(camiseta_rb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cueca_rb)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrar_btnMouseClicked
        
        /*
            Esse bloco é responsável por pegar as informações digitadas no 'form' 
        da aplicação, e criar o objeto respectivo como foi colocado. E ao fazer 
        essa criação, o objeto ja é serializado.
        */
        
        String nome, desc, tam, cod_string, quant_string, nomearquivo;
        int cod, quant;
        //ArrayList<Camiseta> listaCamisetas = new ArrayList<Camiseta>();
        //ArrayList<Cueca> listaCuecas = new ArrayList<Cueca>();
        //ArrayList<Produto> lista = new ArrayList<Produto>();

        nome = nome_form.getText();
        desc = desc_form.getText();
        tam = tam_form.getText();
        cod_string = cod_form.getText();
        quant_string = quant_form.getText();
        String contString = "";
        /*Integer.parseInt(tam_form.getText());*/
        
        
        /*
            Verificação para que sejam preenchidos cada um dos campos do 'form' 
        da aplicação.
        */
        if (nome.equals("") || desc.equals("") || cod_string.equals("")
                || quant_string.equals("") || tam.equals("")) {
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!",
                    "Erro", JOptionPane.ERROR_MESSAGE);

        } else {
            cod = Integer.parseInt(cod_form.getText());
            quant = Integer.parseInt(quant_form.getText());

            ButtonGroup group = new ButtonGroup();

            group.add(camiseta_rb);
            group.add(cueca_rb);
            
            /*
                Se a opção de camiseta é selecionada, a aplicação cria um objeto 
            correspondente, e o serializa.
            */
            
            if (camiseta_rb.isSelected() == true) {
                Camiseta camiseta = new Camiseta(nome, desc, cod, quant, tam);
                //nomearquivo = "camisetas.ser";
                
                /*
                    'Montagem' do nome para que cada arquivo tenha um nome diferente 
                assim separando respectivamente cada objeto que foi serializado.
                */
                nomearquivo = "camiseta";
                contString = Integer.toString(cont);
                contString = contString + ".ser";
                nomearquivo = nomearquivo + contString;
                System.out.println(nomearquivo);
                
                
                /*
                    Ao invés de criar um arquivo para cada objeto, tentei utilizar um 
                'ArrayList' dos objetos, porém, não consegui fazer com que funcionasse.
                */
                //listaCamisetas.add(camiseta);
                //lista.add(camiseta);
                
                /*
                    Contador responsável por diferenciar o nome de cada arquivo para 
                cada objeto.
                */
                cont++;
                
                /*
                    Serialização do objeto
                */

                try {
                    FileOutputStream arquivo = new FileOutputStream(nomearquivo);
                    ObjectOutputStream out = new ObjectOutputStream(arquivo);

                    //out.writeObject(listaCamisetas);
                    out.writeObject(camiseta);
                    out.close();
                    arquivo.close();

                    //System.out.println("Teste de serialização");
                } catch (IOException e) {
                    System.out.println("Erro na serialização");
                    e.printStackTrace();
                }

                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!",
                        "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                
                
                /*
                    Serialização do contador que marca o número de objetos 'Camiseta' 
                que foram serializados.
                */
                String contador = "contador.ser";
                try {
                    FileOutputStream arquivo = new FileOutputStream(contador);
                    ObjectOutputStream out = new ObjectOutputStream(arquivo);

                    out.writeUTF(contString);
                    out.close();
                    arquivo.close();

                    //System.out.println("Teste de serialização");
                } catch (IOException e) {
                    System.out.println("Erro na serialização");
                    e.printStackTrace();
                }

                limparCampos();
            }
            
            /*
                Este bloco de código tem a mesma função com o acima, porém, este envia 
            e marca o número de objetos 'Cueca'.
            */
            if (cueca_rb.isSelected() == true) {
                Cueca cueca = new Cueca(nome, desc, cod, quant, tam);
                //nomearquivo = "cuecas.ser";
                nomearquivo = "cueca";
                String contString2 = Integer.toString(cont2);
                contString2 = contString2 + ".ser";
                nomearquivo = nomearquivo + contString2;
                System.out.println(nomearquivo);

                //listaCuecas.add(cueca);
                //lista.add(cueca);
                cont2++;

                try {
                    FileOutputStream arquivo = new FileOutputStream(nomearquivo);
                    ObjectOutputStream out = new ObjectOutputStream(arquivo);

                    //out.writeObject(listaCuecas);
                    out.writeObject(cueca);
                    out.close();
                    arquivo.close();
                    
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!",
                            "PogChamp", JOptionPane.INFORMATION_MESSAGE);

                    limparCampos();

                    System.out.println("Serialized bruh");
                } catch (IOException e) {
                    System.out.println("Erro na serialização");
                    e.printStackTrace();

                }

                String contador2 = "contador2.ser";
                try {
                    FileOutputStream arquivo = new FileOutputStream(contador2);
                    ObjectOutputStream out = new ObjectOutputStream(arquivo);

                    //out.writeObject(listaCuecas);
                    out.writeUTF(contString2);
                    out.close();
                    arquivo.close();

                    System.out.println("Serialized bruh");
                } catch (IOException e) {
                    System.out.println("Erro na serialização");
                    e.printStackTrace();
                }

            }

        }
    }//GEN-LAST:event_cadastrar_btnMouseClicked
    
    
    /*
        Função para limpar os campos do 'form' após ser confirmado o envio das 
    informações para a aplicação
    */
    private void limparCampos() {
        nome_form.setText("");
        desc_form.setText("");
        cod_form.setText("");
        quant_form.setText("");
        tam_form.setText("");
    }

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_btn;
    private javax.swing.JRadioButton camiseta_rb;
    private javax.swing.JTextField cod_form;
    private javax.swing.JRadioButton cueca_rb;
    private javax.swing.JTextField desc_form;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nome_form;
    private javax.swing.JTextField quant_form;
    private javax.swing.JTextField tam_form;
    // End of variables declaration//GEN-END:variables
}
