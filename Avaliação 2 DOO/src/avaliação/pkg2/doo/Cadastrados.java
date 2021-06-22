
package avaliação.pkg2.doo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/*
Esse JFrame é responsável por mostrar a lista de produtos cadastrados, e 
possibilitar a impressão das informações de cada objeto
*/
public class Cadastrados extends javax.swing.JFrame {

    /*ArrayList<Camiseta> camisetasLista = new ArrayList<>();
    ArrayList<Cueca> cuecasLista = new ArrayList<>();*/
    ArrayList<Produto> produtosLista = new ArrayList<>();

    
    public Cadastrados() {
        initComponents();
        this.setDefaultCloseOperation(this.HIDE_ON_CLOSE);
        
        int cont1 = 0, cont2 = 0;
        

        try
        {
            /*
                Essa parte é para ler o contador de quantos objetos de 'camisetas'
            e 'cuecas' foram feitos e serializados, a partir disso, poder ler a 
            quantidade certa de itens, sem que saia do 'index'.
            */
            FileInputStream arquivo1 = new FileInputStream("contador.ser");
            ObjectInputStream in1 = new ObjectInputStream(arquivo1);
 
            String contString1 = in1.readUTF();
            cont1 = Integer.parseInt(contString1);
 
            in1.close();
            arquivo1.close();
            
            FileInputStream arquivo2 = new FileInputStream("contador2.ser");
            ObjectInputStream in2 = new ObjectInputStream(arquivo2);
 
            String contString2 = in2.readUTF();
            cont2 = Integer.parseInt(contString2);
 
            in2.close();
            arquivo2.close();
        } catch (IOException ioe) 
        {
            ioe.printStackTrace();
            return;
        }
        
        /*
            Essa parte é responsável por deserializar os objetos, guardar cada um 
        em um arraylist, e também de colocar cada item no jComboBox para ser mos-
        trado na tela da aplicação.
        */
        for (int i = 0; i < cont1; i++) {
            
            try
            {   
                /*
                "Montagem" do nome do arquivo para leitura, juntando com o contador 
                para que seja feita a leitura de cada arquivo 'ser'.
                */
                String nomearquivo = "camiseta";
                String contString = Integer.toString(i);
                contString = contString + ".ser";
                nomearquivo = nomearquivo + contString;
                //System.out.println("XESQUEJOHNSON");
                
                
                FileInputStream arquivo1 = new FileInputStream(nomearquivo);
                ObjectInputStream in1 = new ObjectInputStream(arquivo1);

                Camiseta camiseta = new Camiseta("", "", 0, 0, "");
                camiseta = (Camiseta) in1.readObject();
                
                in1.close();
                arquivo1.close();
                
                produtosLista.add(camiseta);
                /*
                Recebe o atributo 'nome' de cada objeto e envia para o jComboBox
                */
                String aux = "";
                aux = camiseta.getNome();
                jCB.addItem(aux);        
                cont1++;
                
            }
            catch (IOException ioe) 
            {
                ioe.printStackTrace();
                return;
            }
            catch (ClassNotFoundException c)
            {
            System.out.println("Classe não encontrada");
            c.printStackTrace();
            return;
            }
        }
        
        /*
        O funcionamento desse bloco de código é identico ao primeiro,  só que para 
        o objeto 'Cueca' mudando apenas algumas variáveis para que não haja confusão
        entre os dois blocos
        */
        for (int i = 0; i < cont2; i++) {
            
            try
            {
                String nomearquivo2 = "cueca";
                String contString = Integer.toString(i);
                contString = contString + ".ser";
                nomearquivo2 = nomearquivo2 + contString;
                
                
                FileInputStream arquivo2 = new FileInputStream(nomearquivo2);
                ObjectInputStream in2 = new ObjectInputStream(arquivo2);

                Cueca cueca = new Cueca("", "", 0, 0, "");
                cueca = (Cueca) in2.readObject();
                
                in2.close();
                arquivo2.close();
                
                produtosLista.add(cueca);
                
                String aux = "";
                aux = cueca.getNome();
                jCB.addItem(aux);            
                cont2++;
            }
            catch (IOException ioe) 
            {
                ioe.printStackTrace();
                return;
            }
            catch (ClassNotFoundException c)
            {
            System.out.println("Classe não encontrada");
            c.printStackTrace();
            return;
            }
        }
        
        
        /*7
            Tentativa de desserialização com 'ArrayList', que infelizmente, não veio 
        a funcionar corretamente.
        */
        
        
        /*try
        {
        FileInputStream arquivo1 = new FileInputStream("camisetas.ser");
        ObjectInputStream in1 = new ObjectInputStream(arquivo1);
        camisetasLista = (ArrayList) in1.readObject();
        in1.close();
        arquivo1.close();
        FileInputStream arquivo2 = new FileInputStream("cuecas.ser");
        ObjectInputStream in2 = new ObjectInputStream(arquivo2);
        cuecasLista = (ArrayList) in2.readObject();
        in2.close();
        arquivo2.close();
        }
        catch (IOException ioe)
        {
        ioe.printStackTrace();
        return;
        }
        catch (ClassNotFoundException c)
        {
        System.out.println("Class not found");
        c.printStackTrace();
        return;
        }
        for (int i = 0; i < camisetasLista.size(); i++){
        String aux = "";
        aux = camisetasLista.get(i).getNome();
        jCB.addItem(aux);
        produtosLista.add(camisetasLista.get(i));
        }
        for (int i = 0; i < cuecasLista.size(); i++){
        String aux2 = "";
        aux2 = cuecasLista.get(i).getNome();
        jCB.addItem(aux2);
        produtosLista.add(cuecasLista.get(i));
        }
        /*for (int i = 0; i < produtosLista.size(); i++){
        String aux3 = "";
        aux3 = produtosLista.get(i).getNome();
        jCB.addItem(aux3);
        }*/
        /*try {
        FileInputStream arquivo = new FileInputStream("lista.ser");
        ObjectInputStream in = new ObjectInputStream(arquivo);
        produtosLista = (ArrayList<Produto>) in.readObject();
        in.close();
        arquivo.close();
        for (int i = 0; i < produtosLista.size(); i++) {
        String aux3 = "";
        aux3 = produtosLista.get(i).getNome();
        jCB.addItem(aux3);
        }
        } catch (IOException ioe) {
        ioe.printStackTrace();
        return;
        } catch (ClassNotFoundException c) {
        System.out.println("Class not found");
        c.printStackTrace();
        return;
        }*/  
        
        /*----------------------------------------------------------------
        Também uma tentativa falha de desserialização com 'ArrayList'
        */
        
        /*try
        {
            FileInputStream arquivo1 = new FileInputStream("camisetas.ser");
            ObjectInputStream in1 = new ObjectInputStream(arquivo1);
 
            camisetasLista = (ArrayList) in1.readObject();
 
            in1.close();
            arquivo1.close();
            
            FileInputStream arquivo2 = new FileInputStream("cuecas.ser");
            ObjectInputStream in2 = new ObjectInputStream(arquivo2);
 
            cuecasLista = (ArrayList) in2.readObject();
 
            in2.close();
            arquivo2.close();
        } 
        catch (IOException ioe) 
        {
            ioe.printStackTrace();
            return;
        } 
        catch (ClassNotFoundException c) 
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
        
        for (int i = 0; i < camisetasLista.size(); i++){
            String aux = "";
            aux = camisetasLista.get(i).getNome();
            jCB.addItem(aux);
            produtosLista.add(camisetasLista.get(i));
        }

        for (int i = 0; i < cuecasLista.size(); i++){
            String aux2 = "";
            aux2 = cuecasLista.get(i).getNome();
            jCB.addItem(aux2);
            produtosLista.add(cuecasLista.get(i));
        }
        
        /*for (int i = 0; i < produtosLista.size(); i++){
            String aux3 = "";
            aux3 = produtosLista.get(i).getNome();
            jCB.addItem(aux3);
        }*/
        
        /*try {
            FileInputStream arquivo = new FileInputStream("lista.ser");
            ObjectInputStream in = new ObjectInputStream(arquivo);

            produtosLista = (ArrayList<Produto>) in.readObject();

            in.close();
            arquivo.close();

            for (int i = 0; i < produtosLista.size(); i++) {
                String aux3 = "";
                aux3 = produtosLista.get(i).getNome();
                jCB.addItem(aux3);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }*/

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCB = new javax.swing.JComboBox<>();
        imprimir_btn = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic Light", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Itens cadastrados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jCB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        imprimir_btn.setText("Imprimir");
        imprimir_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imprimir_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imprimir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(140, 140, 140))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(imprimir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imprimir_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imprimir_btnMouseClicked
        /*
            Nesse evento, a aplicação irá selecionar o objeto selecionado, e utilizar 
        suas funções 'imprimir()' e 'pacote()' que mostram informações sobre o objeto.
        */
        
        produtosLista.get(jCB.getSelectedIndex()).imprimir();
        produtosLista.get(jCB.getSelectedIndex()).pacote();
    }//GEN-LAST:event_imprimir_btnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(Cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton imprimir_btn;
    private javax.swing.JComboBox<String> jCB;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
