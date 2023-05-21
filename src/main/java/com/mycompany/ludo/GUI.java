/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.ludo;

import java.awt.Color;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledDocument;

/**
 *
 * @author caiotavares
 */
public class GUI extends javax.swing.JPanel {
    
    private Player bluePlayer;
    
    public void setBluePlayer(Player bluePlayer) {
        this.bluePlayer = bluePlayer;
    }
    
    public void setBluePiece(JPanel Panel) {
        Graphics g = Panel.getGraphics();
        int panelWidth = Panel.getWidth();
        int panelHeight = Panel.getHeight();
        int circleDiameter = Math.min(panelWidth, panelHeight) - 20; // 20 é a margem
        int circleX = (panelWidth - circleDiameter) / 2;
        int circleY = (panelHeight - circleDiameter) / 2;
        g.setColor(Color.BLUE);
        g.fillOval(circleX, circleY, circleDiameter, circleDiameter);
    }
    
    public void clearBluePiece(JPanel panel) {
        Graphics g = panel.getGraphics();
        int panelWidth = panel.getWidth();
        int panelHeight = panel.getHeight();
        int circleDiameter = Math.min(panelWidth, panelHeight) - 20; // 20 é a margem
        int circleX = (panelWidth - circleDiameter) / 2;
        int circleY = (panelHeight - circleDiameter) / 2;
        g.clearRect(circleX, circleY, circleDiameter, circleDiameter);
    }

    
    public void setNewBluePosition(int position, int oldPosition) {
        // Mapear os valores de position para os respectivos JPanels
        Map<Integer, JPanel> positionMap = new HashMap<>();
        positionMap.put(1, White13);
        positionMap.put(2, White14);
        positionMap.put(3, White15);
        positionMap.put(4, White16);
        positionMap.put(5, White17);
        positionMap.put(6, White18);
        positionMap.put(7, White19);
        positionMap.put(8, White20);
        positionMap.put(9, White21);
        positionMap.put(10, White22);
        positionMap.put(11, White23);
        positionMap.put(12, White24);
        positionMap.put(13, Yellow1);
        positionMap.put(14, White25);
        positionMap.put(15, White26);
        positionMap.put(16, White27);
        positionMap.put(17, White28);
        positionMap.put(18, White29);
        positionMap.put(19, White30);
        positionMap.put(20, White31);
        positionMap.put(21, White32);
        positionMap.put(22, White33);
        positionMap.put(23, White34);
        positionMap.put(24, White35);
        positionMap.put(25, White36);
        positionMap.put(26, Green1);
        positionMap.put(27, White37);
        positionMap.put(28, White38);
        positionMap.put(29, White39);
        positionMap.put(30, White40);
        positionMap.put(31, White41);
        positionMap.put(32, White42);
        positionMap.put(33, White43);
        positionMap.put(34, White44);
        positionMap.put(35, White45);
        positionMap.put(36, White46);
        positionMap.put(37, White47);
        positionMap.put(38, White48);
        positionMap.put(39, Red1);
        positionMap.put(38, White1);
        positionMap.put(39, White2);
        positionMap.put(40, White3);
        positionMap.put(41, White4);
        positionMap.put(42, White5);
        positionMap.put(43, White6);
        positionMap.put(44, White7);
        positionMap.put(45, White8);
        positionMap.put(46, White9);
        positionMap.put(47, White10);
        positionMap.put(48, Blue2);
        positionMap.put(49, Blue3);
        positionMap.put(50, Blue4);
        positionMap.put(51, Blue5);
        positionMap.put(52, Blue6);
        
        if (position > 53) {
            JOptionPane.showMessageDialog(null, "Azul Venceu!");
            return;
        }
        

        // Verifica se o valor de position existe no mapa
        if (positionMap.containsKey(position)) {
            JPanel panel = positionMap.get(position);
            if (oldPosition > 0) {
                JPanel oldPanel = positionMap.get(oldPosition);
                clearBluePiece(oldPanel);
            }
            
            setBluePiece(panel);
        } else {
//            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao mover a peça, jogue o dado novamente!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        
//        int panelWidth = getWidth();
//        int panelHeight = getHeight();
//        
//        int circleDiameter = Math.min(panelWidth, panelHeight) - 20; // 20 é a margem
//        
//        int circleX = (panelWidth - circleDiameter) / 2;
//        int circleY = (panelHeight - circleDiameter) / 2;
//        
//        g.setColor(Color.RED); // Defina a cor do círculo aqui
//        g.fillOval(circleX, circleY, circleDiameter, circleDiameter);
//    }
//    
//    public Dimension getPreferredSize() {
//        return new Dimension(200, 200); // Defina as dimensões preferenciais do painel aqui
//    }
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BlueStart = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        BluePiece1 = new javax.swing.JPanel();
        RedStart = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        YellowStart = new javax.swing.JPanel();
        GreenStart = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        Green6 = new javax.swing.JPanel();
        Green5 = new javax.swing.JPanel();
        Green3 = new javax.swing.JPanel();
        Green4 = new javax.swing.JPanel();
        Yellow2 = new javax.swing.JPanel();
        Yellow1 = new javax.swing.JPanel();
        Green2 = new javax.swing.JPanel();
        Yellow3 = new javax.swing.JPanel();
        Green1 = new javax.swing.JPanel();
        Red1 = new javax.swing.JPanel();
        Yellow4 = new javax.swing.JPanel();
        Red2 = new javax.swing.JPanel();
        Blue6 = new javax.swing.JPanel();
        Yellow5 = new javax.swing.JPanel();
        Yellow6 = new javax.swing.JPanel();
        Blue3 = new javax.swing.JPanel();
        Blue4 = new javax.swing.JPanel();
        Blue5 = new javax.swing.JPanel();
        Blue2 = new javax.swing.JPanel();
        Blue1 = new javax.swing.JPanel();
        Red3 = new javax.swing.JPanel();
        Red4 = new javax.swing.JPanel();
        Red5 = new javax.swing.JPanel();
        Red6 = new javax.swing.JPanel();
        White2 = new javax.swing.JPanel();
        White3 = new javax.swing.JPanel();
        White4 = new javax.swing.JPanel();
        White5 = new javax.swing.JPanel();
        White6 = new javax.swing.JPanel();
        White7 = new javax.swing.JPanel();
        White8 = new javax.swing.JPanel();
        White9 = new javax.swing.JPanel();
        White10 = new javax.swing.JPanel();
        White11 = new javax.swing.JPanel();
        White1 = new javax.swing.JPanel();
        White13 = new javax.swing.JPanel();
        White14 = new javax.swing.JPanel();
        White15 = new javax.swing.JPanel();
        White16 = new javax.swing.JPanel();
        White17 = new javax.swing.JPanel();
        White18 = new javax.swing.JPanel();
        White19 = new javax.swing.JPanel();
        White20 = new javax.swing.JPanel();
        White21 = new javax.swing.JPanel();
        White22 = new javax.swing.JPanel();
        White23 = new javax.swing.JPanel();
        White24 = new javax.swing.JPanel();
        White25 = new javax.swing.JPanel();
        White26 = new javax.swing.JPanel();
        White27 = new javax.swing.JPanel();
        White28 = new javax.swing.JPanel();
        White29 = new javax.swing.JPanel();
        White30 = new javax.swing.JPanel();
        White31 = new javax.swing.JPanel();
        White32 = new javax.swing.JPanel();
        White33 = new javax.swing.JPanel();
        White34 = new javax.swing.JPanel();
        White35 = new javax.swing.JPanel();
        White36 = new javax.swing.JPanel();
        White37 = new javax.swing.JPanel();
        White38 = new javax.swing.JPanel();
        White39 = new javax.swing.JPanel();
        White40 = new javax.swing.JPanel();
        White41 = new javax.swing.JPanel();
        White42 = new javax.swing.JPanel();
        White43 = new javax.swing.JPanel();
        White44 = new javax.swing.JPanel();
        White45 = new javax.swing.JPanel();
        White46 = new javax.swing.JPanel();
        White47 = new javax.swing.JPanel();
        White48 = new javax.swing.JPanel();
        White12 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ButtonDice = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextDice = new javax.swing.JTextPane();
        jToggleButton1 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(959, 612));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BlueStart.setBackground(new java.awt.Color(51, 51, 255));
        BlueStart.setPreferredSize(new java.awt.Dimension(240, 240));

        jPanel7.setBackground(new java.awt.Color(0, 0, 153));
        jPanel7.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 153));
        jPanel9.setPreferredSize(new java.awt.Dimension(25, 25));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        BluePiece1.setBackground(new java.awt.Color(0, 0, 153));
        BluePiece1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BluePiece1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout BluePiece1Layout = new javax.swing.GroupLayout(BluePiece1);
        BluePiece1.setLayout(BluePiece1Layout);
        BluePiece1Layout.setHorizontalGroup(
            BluePiece1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        BluePiece1Layout.setVerticalGroup(
            BluePiece1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(BluePiece1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BluePiece1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout BlueStartLayout = new javax.swing.GroupLayout(BlueStart);
        BlueStart.setLayout(BlueStartLayout);
        BlueStartLayout.setHorizontalGroup(
            BlueStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueStartLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        BlueStartLayout.setVerticalGroup(
            BlueStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BlueStartLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel1.add(BlueStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        RedStart.setBackground(new java.awt.Color(255, 51, 51));
        RedStart.setPreferredSize(new java.awt.Dimension(240, 240));

        jPanel5.setPreferredSize(new java.awt.Dimension(140, 140));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RedStartLayout = new javax.swing.GroupLayout(RedStart);
        RedStart.setLayout(RedStartLayout);
        RedStartLayout.setHorizontalGroup(
            RedStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RedStartLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        RedStartLayout.setVerticalGroup(
            RedStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RedStartLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jPanel1.add(RedStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        YellowStart.setBackground(new java.awt.Color(255, 255, 51));
        YellowStart.setPreferredSize(new java.awt.Dimension(240, 240));

        javax.swing.GroupLayout YellowStartLayout = new javax.swing.GroupLayout(YellowStart);
        YellowStart.setLayout(YellowStartLayout);
        YellowStartLayout.setHorizontalGroup(
            YellowStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        YellowStartLayout.setVerticalGroup(
            YellowStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        jPanel1.add(YellowStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, -1, -1));

        GreenStart.setBackground(new java.awt.Color(0, 255, 0));
        GreenStart.setPreferredSize(new java.awt.Dimension(240, 240));

        jPanel6.setPreferredSize(new java.awt.Dimension(140, 140));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout GreenStartLayout = new javax.swing.GroupLayout(GreenStart);
        GreenStart.setLayout(GreenStartLayout);
        GreenStartLayout.setHorizontalGroup(
            GreenStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GreenStartLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        GreenStartLayout.setVerticalGroup(
            GreenStartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GreenStartLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jPanel1.add(GreenStart, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        Green6.setBackground(new java.awt.Color(0, 255, 0));
        Green6.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Green6Layout = new javax.swing.GroupLayout(Green6);
        Green6.setLayout(Green6Layout);
        Green6Layout.setHorizontalGroup(
            Green6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Green6Layout.setVerticalGroup(
            Green6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(Green6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        Green5.setBackground(new java.awt.Color(0, 255, 0));
        Green5.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Green5Layout = new javax.swing.GroupLayout(Green5);
        Green5.setLayout(Green5Layout);
        Green5Layout.setHorizontalGroup(
            Green5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Green5Layout.setVerticalGroup(
            Green5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Green5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        Green3.setBackground(new java.awt.Color(0, 255, 0));
        Green3.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Green3Layout = new javax.swing.GroupLayout(Green3);
        Green3.setLayout(Green3Layout);
        Green3Layout.setHorizontalGroup(
            Green3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Green3Layout.setVerticalGroup(
            Green3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Green3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        Green4.setBackground(new java.awt.Color(0, 255, 0));
        Green4.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Green4Layout = new javax.swing.GroupLayout(Green4);
        Green4.setLayout(Green4Layout);
        Green4Layout.setHorizontalGroup(
            Green4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Green4Layout.setVerticalGroup(
            Green4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Green4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, -1, -1));

        Yellow2.setBackground(new java.awt.Color(255, 255, 51));
        Yellow2.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Yellow2Layout = new javax.swing.GroupLayout(Yellow2);
        Yellow2.setLayout(Yellow2Layout);
        Yellow2Layout.setHorizontalGroup(
            Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Yellow2Layout.setVerticalGroup(
            Yellow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Yellow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        Yellow1.setBackground(new java.awt.Color(255, 255, 51));
        Yellow1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Yellow1Layout = new javax.swing.GroupLayout(Yellow1);
        Yellow1.setLayout(Yellow1Layout);
        Yellow1Layout.setHorizontalGroup(
            Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Yellow1Layout.setVerticalGroup(
            Yellow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Yellow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, -1, -1));

        Green2.setBackground(new java.awt.Color(0, 255, 0));
        Green2.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Green2Layout = new javax.swing.GroupLayout(Green2);
        Green2.setLayout(Green2Layout);
        Green2Layout.setHorizontalGroup(
            Green2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Green2Layout.setVerticalGroup(
            Green2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Green2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 280, -1, -1));

        Yellow3.setBackground(new java.awt.Color(255, 255, 51));
        Yellow3.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Yellow3Layout = new javax.swing.GroupLayout(Yellow3);
        Yellow3.setLayout(Yellow3Layout);
        Yellow3Layout.setHorizontalGroup(
            Yellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Yellow3Layout.setVerticalGroup(
            Yellow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Yellow3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        Green1.setBackground(new java.awt.Color(0, 255, 0));
        Green1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Green1Layout = new javax.swing.GroupLayout(Green1);
        Green1.setLayout(Green1Layout);
        Green1Layout.setHorizontalGroup(
            Green1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Green1Layout.setVerticalGroup(
            Green1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Green1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        Red1.setBackground(new java.awt.Color(255, 51, 51));
        Red1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Red1Layout = new javax.swing.GroupLayout(Red1);
        Red1.setLayout(Red1Layout);
        Red1Layout.setHorizontalGroup(
            Red1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Red1Layout.setVerticalGroup(
            Red1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Red1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        Yellow4.setBackground(new java.awt.Color(255, 255, 51));
        Yellow4.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Yellow4Layout = new javax.swing.GroupLayout(Yellow4);
        Yellow4.setLayout(Yellow4Layout);
        Yellow4Layout.setHorizontalGroup(
            Yellow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Yellow4Layout.setVerticalGroup(
            Yellow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Yellow4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));

        Red2.setBackground(new java.awt.Color(255, 51, 51));
        Red2.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Red2Layout = new javax.swing.GroupLayout(Red2);
        Red2.setLayout(Red2Layout);
        Red2Layout.setHorizontalGroup(
            Red2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Red2Layout.setVerticalGroup(
            Red2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Red2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, -1, -1));

        Blue6.setBackground(new java.awt.Color(51, 51, 255));
        Blue6.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Blue6Layout = new javax.swing.GroupLayout(Blue6);
        Blue6.setLayout(Blue6Layout);
        Blue6Layout.setHorizontalGroup(
            Blue6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Blue6Layout.setVerticalGroup(
            Blue6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Blue6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        Yellow5.setBackground(new java.awt.Color(255, 255, 51));
        Yellow5.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Yellow5Layout = new javax.swing.GroupLayout(Yellow5);
        Yellow5.setLayout(Yellow5Layout);
        Yellow5Layout.setHorizontalGroup(
            Yellow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Yellow5Layout.setVerticalGroup(
            Yellow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Yellow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));

        Yellow6.setBackground(new java.awt.Color(255, 255, 51));
        Yellow6.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Yellow6Layout = new javax.swing.GroupLayout(Yellow6);
        Yellow6.setLayout(Yellow6Layout);
        Yellow6Layout.setHorizontalGroup(
            Yellow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Yellow6Layout.setVerticalGroup(
            Yellow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Yellow6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, -1, -1));

        Blue3.setBackground(new java.awt.Color(51, 51, 255));
        Blue3.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Blue3Layout = new javax.swing.GroupLayout(Blue3);
        Blue3.setLayout(Blue3Layout);
        Blue3Layout.setHorizontalGroup(
            Blue3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Blue3Layout.setVerticalGroup(
            Blue3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Blue3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        Blue4.setBackground(new java.awt.Color(51, 51, 255));
        Blue4.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Blue4Layout = new javax.swing.GroupLayout(Blue4);
        Blue4.setLayout(Blue4Layout);
        Blue4Layout.setHorizontalGroup(
            Blue4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Blue4Layout.setVerticalGroup(
            Blue4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Blue4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        Blue5.setBackground(new java.awt.Color(51, 51, 255));
        Blue5.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Blue5Layout = new javax.swing.GroupLayout(Blue5);
        Blue5.setLayout(Blue5Layout);
        Blue5Layout.setHorizontalGroup(
            Blue5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Blue5Layout.setVerticalGroup(
            Blue5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Blue5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        Blue2.setBackground(new java.awt.Color(51, 51, 255));
        Blue2.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Blue2Layout = new javax.swing.GroupLayout(Blue2);
        Blue2.setLayout(Blue2Layout);
        Blue2Layout.setHorizontalGroup(
            Blue2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Blue2Layout.setVerticalGroup(
            Blue2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Blue2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        Blue1.setBackground(new java.awt.Color(51, 51, 255));
        Blue1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Blue1Layout = new javax.swing.GroupLayout(Blue1);
        Blue1.setLayout(Blue1Layout);
        Blue1Layout.setHorizontalGroup(
            Blue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Blue1Layout.setVerticalGroup(
            Blue1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Blue1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        Red3.setBackground(new java.awt.Color(255, 51, 51));
        Red3.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Red3Layout = new javax.swing.GroupLayout(Red3);
        Red3.setLayout(Red3Layout);
        Red3Layout.setHorizontalGroup(
            Red3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Red3Layout.setVerticalGroup(
            Red3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Red3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 480, -1, -1));

        Red4.setBackground(new java.awt.Color(255, 51, 51));
        Red4.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Red4Layout = new javax.swing.GroupLayout(Red4);
        Red4.setLayout(Red4Layout);
        Red4Layout.setHorizontalGroup(
            Red4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Red4Layout.setVerticalGroup(
            Red4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Red4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        Red5.setBackground(new java.awt.Color(255, 51, 51));
        Red5.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Red5Layout = new javax.swing.GroupLayout(Red5);
        Red5.setLayout(Red5Layout);
        Red5Layout.setHorizontalGroup(
            Red5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Red5Layout.setVerticalGroup(
            Red5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Red5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        Red6.setBackground(new java.awt.Color(255, 51, 51));
        Red6.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout Red6Layout = new javax.swing.GroupLayout(Red6);
        Red6.setLayout(Red6Layout);
        Red6Layout.setHorizontalGroup(
            Red6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        Red6Layout.setVerticalGroup(
            Red6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(Red6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        White2.setBackground(new java.awt.Color(255, 255, 255));
        White2.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White2Layout = new javax.swing.GroupLayout(White2);
        White2.setLayout(White2Layout);
        White2Layout.setHorizontalGroup(
            White2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White2Layout.setVerticalGroup(
            White2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, -1, -1));

        White3.setBackground(new java.awt.Color(255, 255, 255));
        White3.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White3Layout = new javax.swing.GroupLayout(White3);
        White3.setLayout(White3Layout);
        White3Layout.setHorizontalGroup(
            White3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White3Layout.setVerticalGroup(
            White3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, -1, -1));

        White4.setBackground(new java.awt.Color(255, 255, 255));
        White4.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White4Layout = new javax.swing.GroupLayout(White4);
        White4.setLayout(White4Layout);
        White4Layout.setHorizontalGroup(
            White4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White4Layout.setVerticalGroup(
            White4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        White5.setBackground(new java.awt.Color(255, 255, 255));
        White5.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White5Layout = new javax.swing.GroupLayout(White5);
        White5.setLayout(White5Layout);
        White5Layout.setHorizontalGroup(
            White5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White5Layout.setVerticalGroup(
            White5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        White6.setBackground(new java.awt.Color(255, 255, 255));
        White6.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White6Layout = new javax.swing.GroupLayout(White6);
        White6.setLayout(White6Layout);
        White6Layout.setHorizontalGroup(
            White6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White6Layout.setVerticalGroup(
            White6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        White7.setBackground(new java.awt.Color(255, 255, 255));
        White7.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White7Layout = new javax.swing.GroupLayout(White7);
        White7.setLayout(White7Layout);
        White7Layout.setHorizontalGroup(
            White7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White7Layout.setVerticalGroup(
            White7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        White8.setBackground(new java.awt.Color(255, 255, 255));
        White8.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White8Layout = new javax.swing.GroupLayout(White8);
        White8.setLayout(White8Layout);
        White8Layout.setHorizontalGroup(
            White8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White8Layout.setVerticalGroup(
            White8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        White9.setBackground(new java.awt.Color(255, 255, 255));
        White9.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White9Layout = new javax.swing.GroupLayout(White9);
        White9.setLayout(White9Layout);
        White9Layout.setHorizontalGroup(
            White9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White9Layout.setVerticalGroup(
            White9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        White10.setBackground(new java.awt.Color(255, 255, 255));
        White10.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White10Layout = new javax.swing.GroupLayout(White10);
        White10.setLayout(White10Layout);
        White10Layout.setHorizontalGroup(
            White10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White10Layout.setVerticalGroup(
            White10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));

        White11.setBackground(new java.awt.Color(255, 255, 255));
        White11.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White11Layout = new javax.swing.GroupLayout(White11);
        White11.setLayout(White11Layout);
        White11Layout.setHorizontalGroup(
            White11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White11Layout.setVerticalGroup(
            White11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        White1.setBackground(new java.awt.Color(255, 255, 255));
        White1.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White1Layout = new javax.swing.GroupLayout(White1);
        White1.setLayout(White1Layout);
        White1Layout.setHorizontalGroup(
            White1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White1Layout.setVerticalGroup(
            White1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, -1, -1));

        White13.setBackground(new java.awt.Color(255, 255, 255));
        White13.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White13Layout = new javax.swing.GroupLayout(White13);
        White13.setLayout(White13Layout);
        White13Layout.setHorizontalGroup(
            White13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White13Layout.setVerticalGroup(
            White13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        White14.setBackground(new java.awt.Color(255, 255, 255));
        White14.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White14Layout = new javax.swing.GroupLayout(White14);
        White14.setLayout(White14Layout);
        White14Layout.setHorizontalGroup(
            White14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White14Layout.setVerticalGroup(
            White14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        White15.setBackground(new java.awt.Color(255, 255, 255));
        White15.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White15Layout = new javax.swing.GroupLayout(White15);
        White15.setLayout(White15Layout);
        White15Layout.setHorizontalGroup(
            White15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White15Layout.setVerticalGroup(
            White15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        White16.setBackground(new java.awt.Color(255, 255, 255));
        White16.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White16Layout = new javax.swing.GroupLayout(White16);
        White16.setLayout(White16Layout);
        White16Layout.setHorizontalGroup(
            White16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White16Layout.setVerticalGroup(
            White16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        White17.setBackground(new java.awt.Color(255, 255, 255));
        White17.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White17Layout = new javax.swing.GroupLayout(White17);
        White17.setLayout(White17Layout);
        White17Layout.setHorizontalGroup(
            White17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White17Layout.setVerticalGroup(
            White17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        White18.setBackground(new java.awt.Color(255, 255, 255));
        White18.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White18Layout = new javax.swing.GroupLayout(White18);
        White18.setLayout(White18Layout);
        White18Layout.setHorizontalGroup(
            White18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White18Layout.setVerticalGroup(
            White18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, -1, -1));

        White19.setBackground(new java.awt.Color(255, 255, 255));
        White19.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White19Layout = new javax.swing.GroupLayout(White19);
        White19.setLayout(White19Layout);
        White19Layout.setHorizontalGroup(
            White19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White19Layout.setVerticalGroup(
            White19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White19, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        White20.setBackground(new java.awt.Color(255, 255, 255));
        White20.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White20Layout = new javax.swing.GroupLayout(White20);
        White20.setLayout(White20Layout);
        White20Layout.setHorizontalGroup(
            White20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White20Layout.setVerticalGroup(
            White20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        White21.setBackground(new java.awt.Color(255, 255, 255));
        White21.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White21Layout = new javax.swing.GroupLayout(White21);
        White21.setLayout(White21Layout);
        White21Layout.setHorizontalGroup(
            White21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White21Layout.setVerticalGroup(
            White21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        White22.setBackground(new java.awt.Color(255, 255, 255));
        White22.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White22Layout = new javax.swing.GroupLayout(White22);
        White22.setLayout(White22Layout);
        White22Layout.setHorizontalGroup(
            White22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White22Layout.setVerticalGroup(
            White22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, -1, -1));

        White23.setBackground(new java.awt.Color(255, 255, 255));
        White23.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White23Layout = new javax.swing.GroupLayout(White23);
        White23.setLayout(White23Layout);
        White23Layout.setHorizontalGroup(
            White23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White23Layout.setVerticalGroup(
            White23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White23, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        White24.setBackground(new java.awt.Color(255, 255, 255));
        White24.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White24Layout = new javax.swing.GroupLayout(White24);
        White24.setLayout(White24Layout);
        White24Layout.setHorizontalGroup(
            White24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White24Layout.setVerticalGroup(
            White24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, -1, -1));

        White25.setBackground(new java.awt.Color(255, 255, 255));
        White25.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White25Layout = new javax.swing.GroupLayout(White25);
        White25.setLayout(White25Layout);
        White25Layout.setHorizontalGroup(
            White25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White25Layout.setVerticalGroup(
            White25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        White26.setBackground(new java.awt.Color(255, 255, 255));
        White26.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White26Layout = new javax.swing.GroupLayout(White26);
        White26.setLayout(White26Layout);
        White26Layout.setHorizontalGroup(
            White26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White26Layout.setVerticalGroup(
            White26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        White27.setBackground(new java.awt.Color(255, 255, 255));
        White27.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White27Layout = new javax.swing.GroupLayout(White27);
        White27.setLayout(White27Layout);
        White27Layout.setHorizontalGroup(
            White27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White27Layout.setVerticalGroup(
            White27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White27, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, -1, -1));

        White28.setBackground(new java.awt.Color(255, 255, 255));
        White28.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White28Layout = new javax.swing.GroupLayout(White28);
        White28.setLayout(White28Layout);
        White28Layout.setHorizontalGroup(
            White28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White28Layout.setVerticalGroup(
            White28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White28, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, -1, -1));

        White29.setBackground(new java.awt.Color(255, 255, 255));
        White29.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White29Layout = new javax.swing.GroupLayout(White29);
        White29.setLayout(White29Layout);
        White29Layout.setHorizontalGroup(
            White29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White29Layout.setVerticalGroup(
            White29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White29, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        White30.setBackground(new java.awt.Color(255, 255, 255));
        White30.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White30Layout = new javax.swing.GroupLayout(White30);
        White30.setLayout(White30Layout);
        White30Layout.setHorizontalGroup(
            White30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White30Layout.setVerticalGroup(
            White30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        White31.setBackground(new java.awt.Color(255, 255, 255));
        White31.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White31Layout = new javax.swing.GroupLayout(White31);
        White31.setLayout(White31Layout);
        White31Layout.setHorizontalGroup(
            White31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White31Layout.setVerticalGroup(
            White31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White31, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, -1, -1));

        White32.setBackground(new java.awt.Color(255, 255, 255));
        White32.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White32Layout = new javax.swing.GroupLayout(White32);
        White32.setLayout(White32Layout);
        White32Layout.setHorizontalGroup(
            White32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White32Layout.setVerticalGroup(
            White32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        White33.setBackground(new java.awt.Color(255, 255, 255));
        White33.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White33Layout = new javax.swing.GroupLayout(White33);
        White33.setLayout(White33Layout);
        White33Layout.setHorizontalGroup(
            White33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White33Layout.setVerticalGroup(
            White33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White33, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        White34.setBackground(new java.awt.Color(255, 255, 255));
        White34.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White34Layout = new javax.swing.GroupLayout(White34);
        White34.setLayout(White34Layout);
        White34Layout.setHorizontalGroup(
            White34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White34Layout.setVerticalGroup(
            White34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White34, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 240, -1, -1));

        White35.setBackground(new java.awt.Color(255, 255, 255));
        White35.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White35Layout = new javax.swing.GroupLayout(White35);
        White35.setLayout(White35Layout);
        White35Layout.setHorizontalGroup(
            White35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White35Layout.setVerticalGroup(
            White35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White35, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, -1, -1));

        White36.setBackground(new java.awt.Color(255, 255, 255));
        White36.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White36Layout = new javax.swing.GroupLayout(White36);
        White36.setLayout(White36Layout);
        White36Layout.setHorizontalGroup(
            White36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White36Layout.setVerticalGroup(
            White36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White36, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 320, -1, -1));

        White37.setBackground(new java.awt.Color(255, 255, 255));
        White37.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White37Layout = new javax.swing.GroupLayout(White37);
        White37.setLayout(White37Layout);
        White37Layout.setHorizontalGroup(
            White37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White37Layout.setVerticalGroup(
            White37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White37, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        White38.setBackground(new java.awt.Color(255, 255, 255));
        White38.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White38Layout = new javax.swing.GroupLayout(White38);
        White38.setLayout(White38Layout);
        White38Layout.setHorizontalGroup(
            White38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White38Layout.setVerticalGroup(
            White38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, -1, -1));

        White39.setBackground(new java.awt.Color(255, 255, 255));
        White39.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White39Layout = new javax.swing.GroupLayout(White39);
        White39.setLayout(White39Layout);
        White39Layout.setHorizontalGroup(
            White39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White39Layout.setVerticalGroup(
            White39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White39, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        White40.setBackground(new java.awt.Color(255, 255, 255));
        White40.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White40Layout = new javax.swing.GroupLayout(White40);
        White40.setLayout(White40Layout);
        White40Layout.setHorizontalGroup(
            White40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White40Layout.setVerticalGroup(
            White40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White40, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        White41.setBackground(new java.awt.Color(255, 255, 255));
        White41.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White41Layout = new javax.swing.GroupLayout(White41);
        White41.setLayout(White41Layout);
        White41Layout.setHorizontalGroup(
            White41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White41Layout.setVerticalGroup(
            White41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White41, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        White42.setBackground(new java.awt.Color(255, 255, 255));
        White42.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White42Layout = new javax.swing.GroupLayout(White42);
        White42.setLayout(White42Layout);
        White42Layout.setHorizontalGroup(
            White42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White42Layout.setVerticalGroup(
            White42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White42, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        White43.setBackground(new java.awt.Color(255, 255, 255));
        White43.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White43Layout = new javax.swing.GroupLayout(White43);
        White43.setLayout(White43Layout);
        White43Layout.setHorizontalGroup(
            White43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White43Layout.setVerticalGroup(
            White43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White43, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, -1, -1));

        White44.setBackground(new java.awt.Color(255, 255, 255));
        White44.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White44Layout = new javax.swing.GroupLayout(White44);
        White44.setLayout(White44Layout);
        White44Layout.setHorizontalGroup(
            White44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White44Layout.setVerticalGroup(
            White44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White44, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 480, -1, -1));

        White45.setBackground(new java.awt.Color(255, 255, 255));
        White45.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White45Layout = new javax.swing.GroupLayout(White45);
        White45.setLayout(White45Layout);
        White45Layout.setHorizontalGroup(
            White45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White45Layout.setVerticalGroup(
            White45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White45, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 520, -1, -1));

        White46.setBackground(new java.awt.Color(255, 255, 255));
        White46.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White46Layout = new javax.swing.GroupLayout(White46);
        White46.setLayout(White46Layout);
        White46Layout.setHorizontalGroup(
            White46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White46Layout.setVerticalGroup(
            White46Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White46, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        White47.setBackground(new java.awt.Color(255, 255, 255));
        White47.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White47Layout = new javax.swing.GroupLayout(White47);
        White47.setLayout(White47Layout);
        White47Layout.setHorizontalGroup(
            White47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White47Layout.setVerticalGroup(
            White47Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White47, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 560, -1, -1));

        White48.setBackground(new java.awt.Color(255, 255, 255));
        White48.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White48Layout = new javax.swing.GroupLayout(White48);
        White48.setLayout(White48Layout);
        White48Layout.setHorizontalGroup(
            White48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White48Layout.setVerticalGroup(
            White48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White48, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 560, -1, -1));

        White12.setBackground(new java.awt.Color(255, 255, 255));
        White12.setPreferredSize(new java.awt.Dimension(40, 40));

        javax.swing.GroupLayout White12Layout = new javax.swing.GroupLayout(White12);
        White12.setLayout(White12Layout);
        White12Layout.setHorizontalGroup(
            White12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        White12Layout.setVerticalGroup(
            White12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(White12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        ButtonDice.setText("Dado");
        ButtonDice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDiceActionPerformed(evt);
            }
        });

        TextDice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TextDice.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jScrollPane1.setViewportView(TextDice);

        jToggleButton1.setText("Regras");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(240, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ButtonDice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jToggleButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ButtonDice, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonDiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDiceActionPerformed
        // Gerar um número aleatório entre 1 e 6 (representando as faces do dado)
        int resultado = (int) (Math.random() * 6) + 1;
        TextDice.setText("");
        
        String resultadoString = Integer.toString(resultado);
        StyledDocument doc = TextDice.getStyledDocument();
        
        Piece bluePlayerPiece1 = bluePlayer.getPiece1();
        
        if (bluePlayerPiece1.started == false) {
            if (resultado == 6) {
                bluePlayerPiece1.started = true;
                bluePlayerPiece1.oldPosition = bluePlayerPiece1.position;
                bluePlayerPiece1.position = 1;
                setNewBluePosition(bluePlayerPiece1.position, bluePlayerPiece1.oldPosition);
            }
        } else {
            bluePlayerPiece1.oldPosition = bluePlayerPiece1.position;
            bluePlayerPiece1.position = bluePlayerPiece1.position + resultado;
            setNewBluePosition(bluePlayerPiece1.position, bluePlayerPiece1.oldPosition);
        }
        
        try {
            doc.insertString(doc.getLength(), resultadoString, null);
        } catch (BadLocationException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ButtonDiceActionPerformed

    private void BluePiece1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BluePiece1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BluePiece1MouseClicked

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        String ludoRegras = "Regras do LUDO:\n" +
                "- O jogo pode ser jogado por 2 a 4 jogadores.\n" +
                "- Cada jogador deve possui 4 peças que devem ser movidas ao redor do tabuleiro.\n" +
                "- O objetivo é mover todas as suas peças até a área final.\n" +
                "- Os jogadores se revezam lançando um dado para determinar o número de casas a serem avançadas.\n" +
                "- Ao chegar em uma casa ocupada por uma peça adversária, a peça adversária é enviada de volta à área de início.\n" +
                "- Vence o jogador que conseguir mover todas as suas peças para a área final primeiro (área central).\n";

        JOptionPane.showMessageDialog(null, ludoRegras, "Regras do Jogo Ludo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jToggleButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Blue1;
    private javax.swing.JPanel Blue2;
    private javax.swing.JPanel Blue3;
    private javax.swing.JPanel Blue4;
    private javax.swing.JPanel Blue5;
    private javax.swing.JPanel Blue6;
    private javax.swing.JPanel BluePiece1;
    private javax.swing.JPanel BlueStart;
    private javax.swing.JButton ButtonDice;
    private javax.swing.JPanel Green1;
    private javax.swing.JPanel Green2;
    private javax.swing.JPanel Green3;
    private javax.swing.JPanel Green4;
    private javax.swing.JPanel Green5;
    private javax.swing.JPanel Green6;
    private javax.swing.JPanel GreenStart;
    private javax.swing.JPanel Red1;
    private javax.swing.JPanel Red2;
    private javax.swing.JPanel Red3;
    private javax.swing.JPanel Red4;
    private javax.swing.JPanel Red5;
    private javax.swing.JPanel Red6;
    private javax.swing.JPanel RedStart;
    private javax.swing.JTextPane TextDice;
    private javax.swing.JPanel White1;
    private javax.swing.JPanel White10;
    private javax.swing.JPanel White11;
    private javax.swing.JPanel White12;
    private javax.swing.JPanel White13;
    private javax.swing.JPanel White14;
    private javax.swing.JPanel White15;
    private javax.swing.JPanel White16;
    private javax.swing.JPanel White17;
    private javax.swing.JPanel White18;
    private javax.swing.JPanel White19;
    private javax.swing.JPanel White2;
    private javax.swing.JPanel White20;
    private javax.swing.JPanel White21;
    private javax.swing.JPanel White22;
    private javax.swing.JPanel White23;
    private javax.swing.JPanel White24;
    private javax.swing.JPanel White25;
    private javax.swing.JPanel White26;
    private javax.swing.JPanel White27;
    private javax.swing.JPanel White28;
    private javax.swing.JPanel White29;
    private javax.swing.JPanel White3;
    private javax.swing.JPanel White30;
    private javax.swing.JPanel White31;
    private javax.swing.JPanel White32;
    private javax.swing.JPanel White33;
    private javax.swing.JPanel White34;
    private javax.swing.JPanel White35;
    private javax.swing.JPanel White36;
    private javax.swing.JPanel White37;
    private javax.swing.JPanel White38;
    private javax.swing.JPanel White39;
    private javax.swing.JPanel White4;
    private javax.swing.JPanel White40;
    private javax.swing.JPanel White41;
    private javax.swing.JPanel White42;
    private javax.swing.JPanel White43;
    private javax.swing.JPanel White44;
    private javax.swing.JPanel White45;
    private javax.swing.JPanel White46;
    private javax.swing.JPanel White47;
    private javax.swing.JPanel White48;
    private javax.swing.JPanel White5;
    private javax.swing.JPanel White6;
    private javax.swing.JPanel White7;
    private javax.swing.JPanel White8;
    private javax.swing.JPanel White9;
    private javax.swing.JPanel Yellow1;
    private javax.swing.JPanel Yellow2;
    private javax.swing.JPanel Yellow3;
    private javax.swing.JPanel Yellow4;
    private javax.swing.JPanel Yellow5;
    private javax.swing.JPanel Yellow6;
    private javax.swing.JPanel YellowStart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
