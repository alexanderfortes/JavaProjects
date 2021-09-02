package pkg0791_t6;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.text.Position;
import java.sql.Connection;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.ResultSet;
public class pos extends javax.swing.JFrame {
        // criar uma variavel global definida como float
    float Total=0;
    DefaultListModel lista1=new DefaultListModel();
    DefaultListModel lista2=new DefaultListModel();
    DefaultListModel lista3=new DefaultListModel();
     DefaultListModel lista4=new DefaultListModel();
    
    DecimalFormat ft=new DecimalFormat("#,##0.00€");
    DecimalFormat ft1=new DecimalFormat("#0.00€");
    
    
    public pos() {
        initComponents();
         setLocationRelativeTo(null);
    }
    //criar um classe para imprimir
    class Imprimir implements Printable{
            public int print (Graphics g, PageFormat f, int pageIndex){
                
                if (pageIndex==0){
                    Font f1=new Font ("Verdana", Font.BOLD,12);
                    Font f2=new Font ("Verdana", Font.PLAIN,10);
                    Font f3=new Font ("Verdana", Font.PLAIN,8);
                    
                    g.setFont(f1);
                    g.setColor(Color.BLUE);
                    g.drawString("P.O.S - Pastelaria Universo, Lda.", 80, 90);
                                        
                    g.setFont(f2);
                    g.setColor(Color.BLACK);
                    g.drawString("Descrição", 80, 125);
                    g.drawString("Qtd.", 200, 125);
                    g.drawString("Preço", 250, 125);
                    g.drawString("Total", 300, 125);
                    g.drawLine(80,130,330,130);
                    
                    //percorer os elementos da lista
                    int y=150;
                    for(int i=0;i<lista1.getSize();i++){
                        g.drawString(lista1.getElementAt(i).toString(), 80, y);
                        g.drawString(lista2.getElementAt(i).toString(), 200, y);
                        g.drawString(lista3.getElementAt(i).toString(), 250, y);
                        g.drawString(lista4.getElementAt(i).toString(), 300, y);
                        y+=10;
                    }
                    g.drawLine(80,y,330,y);
                    g.drawString(txt_total.getText(), 300, y+10);
                    g.drawLine(80,y+20,330,y+20);
                    g.setFont(f3);
                    g.drawString("Obrigado. Volte sempre!", 80, y+30);
                    return PAGE_EXISTS;
                }
                else
                    return NO_SUCH_PAGE;
            }}

       @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pcafetaria = new javax.swing.JPanel();
        bt_cafe = new javax.swing.JButton();
        bt_descafeinado = new javax.swing.JButton();
        bt_galao = new javax.swing.JButton();
        bt_capuccino = new javax.swing.JButton();
        bt_garoto = new javax.swing.JButton();
        bt_carioca = new javax.swing.JButton();
        pcafetaria1 = new javax.swing.JPanel();
        bt_bolo = new javax.swing.JButton();
        bt_salgado = new javax.swing.JButton();
        bt_mista = new javax.swing.JButton();
        bt_torrada = new javax.swing.JButton();
        pcafetaria2 = new javax.swing.JPanel();
        bt_agua = new javax.swing.JButton();
        bt_cola = new javax.swing.JButton();
        bt_sumo = new javax.swing.JButton();
        bt_vinho = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        bt_pagamento = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();
        bt_novo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_descricao = new javax.swing.JList<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_qtd = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lista_preco = new javax.swing.JList<>();
        jPanel6 = new javax.swing.JPanel();
        txt_total = new javax.swing.JTextField();
        numerario = new javax.swing.JTextField();
        troco = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lista_total = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bt_rqtd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pcafetaria.setBorder(javax.swing.BorderFactory.createTitledBorder("Cafetaria"));

        bt_cafe.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\cafe.gif")); // NOI18N
        bt_cafe.setText("Café");
        bt_cafe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_cafe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_cafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cafeActionPerformed(evt);
            }
        });

        bt_descafeinado.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\descafeinado.gif")); // NOI18N
        bt_descafeinado.setText("Descafeinado");
        bt_descafeinado.setToolTipText("");
        bt_descafeinado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_descafeinado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_descafeinado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_descafeinadoActionPerformed(evt);
            }
        });

        bt_galao.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\galao.gif")); // NOI18N
        bt_galao.setText("Galão");
        bt_galao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_galao.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_galao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_galaoActionPerformed(evt);
            }
        });

        bt_capuccino.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\capucino.gif")); // NOI18N
        bt_capuccino.setText("Capuccino");
        bt_capuccino.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_capuccino.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_capuccino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_capuccinoActionPerformed(evt);
            }
        });

        bt_garoto.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\garoto.gif")); // NOI18N
        bt_garoto.setText("Garoto");
        bt_garoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_garoto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_garoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_garotoActionPerformed(evt);
            }
        });

        bt_carioca.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\carioca.gif")); // NOI18N
        bt_carioca.setText("Carioca");
        bt_carioca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_carioca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_carioca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cariocaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pcafetariaLayout = new javax.swing.GroupLayout(pcafetaria);
        pcafetaria.setLayout(pcafetariaLayout);
        pcafetariaLayout.setHorizontalGroup(
            pcafetariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcafetariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pcafetariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_garoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cafe, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pcafetariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_descafeinado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_carioca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pcafetariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_galao, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(bt_capuccino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pcafetariaLayout.setVerticalGroup(
            pcafetariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcafetariaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pcafetariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_descafeinado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_cafe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_galao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pcafetariaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_capuccino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_carioca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_garoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pcafetaria1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pastelaria"));

        bt_bolo.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\bolo.gif")); // NOI18N
        bt_bolo.setText("Bolo");
        bt_bolo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_bolo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_bolo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_boloActionPerformed(evt);
            }
        });

        bt_salgado.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\salgado.gif")); // NOI18N
        bt_salgado.setText("Salgado");
        bt_salgado.setToolTipText("");
        bt_salgado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_salgado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_salgado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salgadoActionPerformed(evt);
            }
        });

        bt_mista.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\mista.gif")); // NOI18N
        bt_mista.setText("Mista");
        bt_mista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_mista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_mista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_mistaActionPerformed(evt);
            }
        });

        bt_torrada.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\mista.gif")); // NOI18N
        bt_torrada.setText("Torrada");
        bt_torrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_torrada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_torrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_torradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pcafetaria1Layout = new javax.swing.GroupLayout(pcafetaria1);
        pcafetaria1.setLayout(pcafetaria1Layout);
        pcafetaria1Layout.setHorizontalGroup(
            pcafetaria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcafetaria1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pcafetaria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_torrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_bolo, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_salgado, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_mista, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pcafetaria1Layout.setVerticalGroup(
            pcafetaria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcafetaria1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pcafetaria1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_salgado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_bolo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_mista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_torrada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pcafetaria2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bebidas"));

        bt_agua.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\agua.gif")); // NOI18N
        bt_agua.setText("Água");
        bt_agua.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_agua.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_agua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_aguaActionPerformed(evt);
            }
        });

        bt_cola.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\cola.gif")); // NOI18N
        bt_cola.setText("Cola");
        bt_cola.setToolTipText("");
        bt_cola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_cola.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_cola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_colaActionPerformed(evt);
            }
        });

        bt_sumo.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\sumo.gif")); // NOI18N
        bt_sumo.setText("Sumo");
        bt_sumo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_sumo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_sumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sumoActionPerformed(evt);
            }
        });

        bt_vinho.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\TÉCNICO DE INFORMÁTICA - SISTEMAS\\0791_PROGRAMAÇÃO EM JAVA - AVANÇADA\\tarefa6\\vinho.gif")); // NOI18N
        bt_vinho.setText("Vinho");
        bt_vinho.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_vinho.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bt_vinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_vinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pcafetaria2Layout = new javax.swing.GroupLayout(pcafetaria2);
        pcafetaria2.setLayout(pcafetaria2Layout);
        pcafetaria2Layout.setHorizontalGroup(
            pcafetaria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcafetaria2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pcafetaria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_vinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_agua, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_cola, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_sumo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pcafetaria2Layout.setVerticalGroup(
            pcafetaria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcafetaria2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pcafetaria2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bt_cola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_agua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_sumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_vinho)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));

        bt_pagamento.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_pagamento.setText("Pagamento");
        bt_pagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_pagamentoActionPerformed(evt);
            }
        });

        bt_remover.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_remover.setText("Remover");
        bt_remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_removerActionPerformed(evt);
            }
        });

        bt_novo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_novo.setText("Novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        lista_descricao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lista_descricaoMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(lista_descricao);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        lista_qtd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lista_qtdMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(lista_qtd);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );

        lista_preco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lista_precoMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(lista_preco);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jLabel1.setText("Total ->");

        jLabel2.setText("Numerário ->");

        jLabel3.setText("Troco ->");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(492, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(troco, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(numerario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numerario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(troco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Descrição");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Qtd.");

        lista_total.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lista_totalMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(lista_total);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Total");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Preço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(130, 130, 130)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bt_rqtd.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        bt_rqtd.setText("-");
        bt_rqtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rqtdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bt_novo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_remover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_pagamento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_rqtd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bt_pagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_remover, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_novo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_rqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pcafetaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcafetaria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcafetaria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pcafetaria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcafetaria1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pcafetaria2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Adiciona_Produto(String NomeProduto, float Preco){
        //nova estrututura do try e do cath
        try {
            int posicao=lista_descricao.getNextMatch(NomeProduto, 0, Position.Bias.Forward);
            lista_qtd.setSelectedIndex(posicao);
            int qtd=lista_qtd.getSelectedValue()+1;
            lista2.setElementAt(qtd, posicao);
            
            lista_total.setSelectedIndex(posicao);
            lista4.setElementAt(ft1.format(qtd*Preco),posicao);
            
            
            Total+=Preco;
            txt_total.setText(ft.format(Total));
            lista_descricao.setSelectedIndex(lista_qtd.getSelectedIndex());
            lista_preco.setSelectedIndex(lista_qtd.getSelectedIndex());
            lista_total.setSelectedIndex(lista_qtd.getSelectedIndex());
            return;
        }
        catch (Exception e){}
            
        lista1.addElement(NomeProduto);
        lista_descricao.setModel(lista1);
        //para a quantidade
        lista2.addElement(1);
        lista_qtd.setModel(lista2);
        //adicionar o preço
        lista3.addElement(Preco);
        lista_preco.setModel(lista3);
        //total
         lista4.addElement(Preco);
        lista_total.setModel(lista4);
        
        Total+=Preco;
        txt_total.setText(ft.format(Total));
        
    }
    
    private void bt_cafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cafeActionPerformed
        Adiciona_Produto("Café", 0.65f);
    }//GEN-LAST:event_bt_cafeActionPerformed

    private void bt_descafeinadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_descafeinadoActionPerformed
      Adiciona_Produto("Descafeinado", 0.70f);
    }//GEN-LAST:event_bt_descafeinadoActionPerformed

    private void bt_galaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_galaoActionPerformed
       Adiciona_Produto("Galão", 0.95f);
    }//GEN-LAST:event_bt_galaoActionPerformed

    private void bt_garotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_garotoActionPerformed
  Adiciona_Produto("Garoto", 0.60f);;
    }//GEN-LAST:event_bt_garotoActionPerformed

    private void bt_cariocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cariocaActionPerformed
        Adiciona_Produto("Carioca", 0.95f);;
    }//GEN-LAST:event_bt_cariocaActionPerformed

    private void bt_capuccinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_capuccinoActionPerformed
     Adiciona_Produto("Capuccino", 1.40f);
    }//GEN-LAST:event_bt_capuccinoActionPerformed

    private void bt_boloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_boloActionPerformed
       Adiciona_Produto("Bolo", 1.60f);
    }//GEN-LAST:event_bt_boloActionPerformed

    private void bt_salgadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salgadoActionPerformed
       Adiciona_Produto("Salgado", 1.30f);
    }//GEN-LAST:event_bt_salgadoActionPerformed

    private void bt_mistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_mistaActionPerformed
    Adiciona_Produto("Mista", 2.80f);
    }//GEN-LAST:event_bt_mistaActionPerformed

    private void bt_torradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_torradaActionPerformed
     Adiciona_Produto("Torrada", 1.60f);
    }//GEN-LAST:event_bt_torradaActionPerformed

    private void bt_aguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_aguaActionPerformed
     Adiciona_Produto("Água", 1.60f);
    }//GEN-LAST:event_bt_aguaActionPerformed

    private void bt_colaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_colaActionPerformed
        Adiciona_Produto("Cola", 1.00f);
    }//GEN-LAST:event_bt_colaActionPerformed

    private void bt_sumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sumoActionPerformed
        Adiciona_Produto("Sumo", 1.20f);
    }//GEN-LAST:event_bt_sumoActionPerformed

    private void bt_vinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_vinhoActionPerformed
        Adiciona_Produto("Vinho", 3.00f);
    }//GEN-LAST:event_bt_vinhoActionPerformed

    private void lista_descricaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_descricaoMouseReleased
        lista_qtd.setSelectedIndex(lista_descricao.getSelectedIndex());
        lista_preco.setSelectedIndex(lista_descricao.getSelectedIndex());
        lista_total.setSelectedIndex(lista_descricao.getSelectedIndex());
    }//GEN-LAST:event_lista_descricaoMouseReleased

    private void lista_qtdMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_qtdMouseReleased
        lista_descricao.setSelectedIndex(lista_qtd.getSelectedIndex());
        lista_preco.setSelectedIndex(lista_qtd.getSelectedIndex());
        lista_total.setSelectedIndex(lista_qtd.getSelectedIndex());
    }//GEN-LAST:event_lista_qtdMouseReleased

    private void lista_precoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_precoMouseReleased
            lista_descricao.setSelectedIndex(lista_preco.getSelectedIndex());
        lista_qtd.setSelectedIndex(lista_preco.getSelectedIndex());
        lista_total.setSelectedIndex(lista_preco.getSelectedIndex());
    }//GEN-LAST:event_lista_precoMouseReleased

    private void bt_removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_removerActionPerformed
   JOptionPane.showMessageDialog(this,
                    "A opção em manutenção !!!",
                    "P:O:S",
                    JOptionPane.ERROR_MESSAGE);
        /*
        if(lista_descricao.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this,
                    "Deve escolher um produto !!!",
                    "P:O:S",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        //Já posso remover
        float prc=lista_preco.getSelectedValue();
        Total-=prc;
        //atualizar o total
        txt_total.setText(ft.format(Total));
        //vamos remover o produto também
        lista1.remove(lista_descricao.getSelectedIndex());
        lista2.remove(lista_qtd.getSelectedIndex());
        lista3.remove(lista_preco.getSelectedIndex());
        lista4.remove(lista_total.getSelectedIndex());*/
    }//GEN-LAST:event_bt_removerActionPerformed

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed
        // TODO add your handling code here:
        int resposta=JOptionPane.showConfirmDialog(this,
                "Pretende criar um novo pedido?",
                "P:O:S",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        
        if(resposta==0){
            //limpar o conteúdo das listas
            //colocar o total a zero
            //atualizar a caixa do total, umerário e troco
            lista1.clear();lista2.clear();lista3.clear();
            Total=0;
            txt_total.setText("");
            numerario.setText("");
            troco.setText("");
            
        }
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_pagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_pagamentoActionPerformed
       if(lista_descricao.getModel().getSize()==0){
           JOptionPane.showMessageDialog(this,
                   "Não existem items a pagamento",
                   "P:O:S",
                   JOptionPane.ERROR_MESSAGE);
           return;
       }
       float Recebido=Float.parseFloat(JOptionPane.showInputDialog(this,
               "Insira valor para o pagamento"));
       if(Recebido<Total){
           JOptionPane.showMessageDialog(this,
                   "Quantia insuficiente",
                   "P:O:S",
                   JOptionPane.ERROR_MESSAGE);
           return;
       }
       numerario.setText(ft.format(Recebido));
       troco.setText(ft.format(Recebido-Total));
          JOptionPane.showMessageDialog(this,
                   "Pagamento efetuado",
                   "P:O:S",
                   JOptionPane.INFORMATION_MESSAGE);
          
          //vamos invocar a classe imprimir
          PrinterJob j=PrinterJob.getPrinterJob();
          j.setPrintable(new Imprimir());
          j.printDialog();
          
          try{j.print();}
          catch (PrinterException e){}
          
          JOptionPane.showMessageDialog(this,
                  "Impressão efetuada", 
                  "P:O:S",
                  JOptionPane.INFORMATION_MESSAGE);
          
          //guardar na base de dados
          LigacaoMySql bd=new LigacaoMySql();
          bd.criarLigacao();
          
          try{
              Connection cn=bd.criarLigacao();
              Statement st=cn.createStatement();
              
              //classe para manipular a data do sistema e formatar
              LocalDateTime dt=LocalDateTime.now();
              DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyy");
              
              //inserir os dados na tabela pedidos
              st.executeUpdate("insert into pedidos(data,total) values("
              +"'"+dtf.format(dt)+"','"+Total+"')");
              
              //guardar os produtos em detalhe relacionando pelo id do pedido
              ResultSet rs=st.executeQuery("select * from pedidos order by idpedido desc");
              if (rs.next()){
                  int np=Integer.parseInt(rs.getString("idpedido"));
                  for(int i=0;i<lista1.size();i++){
                      st.executeUpdate("insert into detalhe (idpedido, descricao,"
                      + "quantidade,preco) values('"+np+"','"+
                              lista1.getElementAt(i).toString()+"',"
                              +"'"+lista2.getElementAt(i).toString()+"',"
                              +"'"+lista3.getElementAt(i).toString()+"')");
                      
                  }
              }
              JOptionPane.showMessageDialog(this,
                      "Pedido foi registado!!");
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(this,
                      "Erro ao registar o pedido.");
          }
          
          
          
          //limpar
            lista1.clear();lista2.clear();lista3.clear();lista4.clear();
            Total=0;
            txt_total.setText("");
            numerario.setText("");
            troco.setText("");
    }//GEN-LAST:event_bt_pagamentoActionPerformed

    private void bt_rqtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rqtdActionPerformed
        //
           if(lista_descricao.getSelectedIndex()<0){
            JOptionPane.showMessageDialog(this,
                    "Deve escolher um produto !!!",
                    "P:O:S",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
           int posicao=lista_descricao.getSelectedIndex();
           lista_qtd.setSelectedIndex(posicao);
           int qtd=lista_qtd.getSelectedValue()-1;
           lista2.setElementAt(qtd, posicao);
           
           //preco
           lista_preco.setSelectedIndex(posicao);
           float prc=lista_preco.getSelectedValue();
           
           //vamos posicionar na lista do total
           lista_total.setSelectedIndex(posicao);
           lista4.setElementAt(ft1.format(qtd*prc),posicao);
           
           Total-=prc;
           txt_total.setText(ft.format(Total));
           
           if(qtd==0){
               lista1.remove(lista_descricao.getSelectedIndex());
               lista2.remove(lista_qtd.getSelectedIndex());
               lista3.remove(lista_preco.getSelectedIndex());
               lista4.remove(lista_total.getSelectedIndex());
           }
    }//GEN-LAST:event_bt_rqtdActionPerformed

    private void lista_totalMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_totalMouseReleased
         lista_qtd.setSelectedIndex(lista_total.getSelectedIndex());
        lista_preco.setSelectedIndex(lista_total.getSelectedIndex());
        lista_descricao.setSelectedIndex(lista_total.getSelectedIndex());
    }//GEN-LAST:event_lista_totalMouseReleased

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
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_agua;
    private javax.swing.JButton bt_bolo;
    private javax.swing.JButton bt_cafe;
    private javax.swing.JButton bt_capuccino;
    private javax.swing.JButton bt_carioca;
    private javax.swing.JButton bt_cola;
    private javax.swing.JButton bt_descafeinado;
    private javax.swing.JButton bt_galao;
    private javax.swing.JButton bt_garoto;
    private javax.swing.JButton bt_mista;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_pagamento;
    private javax.swing.JButton bt_remover;
    private javax.swing.JButton bt_rqtd;
    private javax.swing.JButton bt_salgado;
    private javax.swing.JButton bt_sumo;
    private javax.swing.JButton bt_torrada;
    private javax.swing.JButton bt_vinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lista_descricao;
    private javax.swing.JList<Float> lista_preco;
    private javax.swing.JList<Integer> lista_qtd;
    private javax.swing.JList<Integer> lista_total;
    private javax.swing.JTextField numerario;
    private javax.swing.JPanel pcafetaria;
    private javax.swing.JPanel pcafetaria1;
    private javax.swing.JPanel pcafetaria2;
    private javax.swing.JTextField troco;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
