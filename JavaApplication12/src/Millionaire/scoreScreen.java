package Millionaire;

import static Millionaire.DoYouWantToBeAMillionaire.getQuestionNumber;
import static Millionaire.DoYouWantToBeAMillionaire.setQuestionNumber;
import java.awt.Color;
import javax.swing.BorderFactory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ocdsb
 */
public class scoreScreen extends javax.swing.JFrame {

    /**
     * Creates new form scoreScreen
     */
    public scoreScreen() {
        initComponents();
        setQuestionNumber();
        System.out.println(getQuestionNumber());
        Color easyColor = new Color(0, 255, 0);
        Color mediumColor = new Color(255,127, 0);
        Color hardColor = new Color(255,0, 95);
        
        
        if(getQuestionNumber() == 1){
            Question1.setBackground(easyColor);
        }
        else if(getQuestionNumber() == 1){
            Question1.setBackground(easyColor);
            Question2.setBackground(easyColor);
        }
        else if(getQuestionNumber() == 3){
            Question1.setBackground(easyColor);
            Question2.setBackground(easyColor);
            Question3.setBackground(easyColor);
        }
        else if(getQuestionNumber() == 4){
            Question1.setBackground(easyColor);
            Question2.setBackground(easyColor);
            Question3.setBackground(easyColor);
            Question4.setBackground(easyColor);
            
        }else if(getQuestionNumber() == 5){
            Question1.setBackground(easyColor);
            Question2.setBackground(easyColor);
            Question3.setBackground(easyColor);
            Question5.setBackground(easyColor);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Question5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Question4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Question3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Question2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Question1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Question6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Question7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Question57 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        Question53 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        Question56 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        Question51 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        Question55 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        Question50 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        Question52 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        Question54 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 17, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 72, 239));
        jPanel1.setForeground(new java.awt.Color(72, 72, 239));
        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setForeground(new java.awt.Color(51, 153, 255));

        jPanel3.setBackground(new java.awt.Color(0, 16, 255));

        Question5.setBackground(new java.awt.Color(255, 204, 223));
        Question5.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel1.setText("15  $1000000");

        javax.swing.GroupLayout Question5Layout = new javax.swing.GroupLayout(Question5);
        Question5.setLayout(Question5Layout);
        Question5Layout.setHorizontalGroup(
            Question5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        Question5Layout.setVerticalGroup(
            Question5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        Question4.setBackground(new java.awt.Color(229, 255, 229));
        Question4.setForeground(new java.awt.Color(204, 204, 204));

        jLabel2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel2.setText("4    $500");

        javax.swing.GroupLayout Question4Layout = new javax.swing.GroupLayout(Question4);
        Question4.setLayout(Question4Layout);
        Question4Layout.setHorizontalGroup(
            Question4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question4Layout.setVerticalGroup(
            Question4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        Question3.setBackground(new java.awt.Color(229, 255, 229));
        Question3.setForeground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel3.setText("3    $300");

        javax.swing.GroupLayout Question3Layout = new javax.swing.GroupLayout(Question3);
        Question3.setLayout(Question3Layout);
        Question3Layout.setHorizontalGroup(
            Question3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question3Layout.setVerticalGroup(
            Question3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Question2.setBackground(new java.awt.Color(229, 255, 229));
        Question2.setForeground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel4.setText("2    $200");

        javax.swing.GroupLayout Question2Layout = new javax.swing.GroupLayout(Question2);
        Question2.setLayout(Question2Layout);
        Question2Layout.setHorizontalGroup(
            Question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question2Layout.setVerticalGroup(
            Question2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        Question1.setBackground(new java.awt.Color(229, 255, 229));
        Question1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel5.setText("1    $100");

        javax.swing.GroupLayout Question1Layout = new javax.swing.GroupLayout(Question1);
        Question1.setLayout(Question1Layout);
        Question1Layout.setHorizontalGroup(
            Question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question1Layout.setVerticalGroup(
            Question1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Question6.setBackground(new java.awt.Color(255, 204, 223));
        Question6.setForeground(new java.awt.Color(204, 204, 204));

        jLabel6.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel6.setText("14  $500000");

        javax.swing.GroupLayout Question6Layout = new javax.swing.GroupLayout(Question6);
        Question6.setLayout(Question6Layout);
        Question6Layout.setHorizontalGroup(
            Question6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question6Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question6Layout.setVerticalGroup(
            Question6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        Question7.setBackground(new java.awt.Color(255, 204, 223));
        Question7.setForeground(new java.awt.Color(204, 204, 204));

        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel7.setText("13  $250000");

        javax.swing.GroupLayout Question7Layout = new javax.swing.GroupLayout(Question7);
        Question7.setLayout(Question7Layout);
        Question7Layout.setHorizontalGroup(
            Question7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question7Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question7Layout.setVerticalGroup(
            Question7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel7))
        );

        Question57.setBackground(new java.awt.Color(255, 204, 223));
        Question57.setForeground(new java.awt.Color(204, 204, 204));

        jLabel57.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel57.setText("12  $125000");

        javax.swing.GroupLayout Question57Layout = new javax.swing.GroupLayout(Question57);
        Question57.setLayout(Question57Layout);
        Question57Layout.setHorizontalGroup(
            Question57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question57Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question57Layout.setVerticalGroup(
            Question57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question57Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel57))
        );

        Question53.setBackground(new java.awt.Color(255, 204, 223));
        Question53.setForeground(new java.awt.Color(204, 204, 204));

        jLabel53.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel53.setText("11  $64000");

        javax.swing.GroupLayout Question53Layout = new javax.swing.GroupLayout(Question53);
        Question53.setLayout(Question53Layout);
        Question53Layout.setHorizontalGroup(
            Question53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question53Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel53)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question53Layout.setVerticalGroup(
            Question53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question53Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel53))
        );

        Question56.setBackground(new java.awt.Color(255, 242, 229));
        Question56.setForeground(new java.awt.Color(204, 204, 204));

        jLabel56.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel56.setText("10  $32000");

        javax.swing.GroupLayout Question56Layout = new javax.swing.GroupLayout(Question56);
        Question56.setLayout(Question56Layout);
        Question56Layout.setHorizontalGroup(
            Question56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question56Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel56)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question56Layout.setVerticalGroup(
            Question56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question56Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel56))
        );

        Question51.setBackground(new java.awt.Color(255, 242, 229));
        Question51.setForeground(new java.awt.Color(204, 204, 204));

        jLabel51.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel51.setText("9    $16000");

        javax.swing.GroupLayout Question51Layout = new javax.swing.GroupLayout(Question51);
        Question51.setLayout(Question51Layout);
        Question51Layout.setHorizontalGroup(
            Question51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question51Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel51)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question51Layout.setVerticalGroup(
            Question51Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question51Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel51))
        );

        Question55.setBackground(new java.awt.Color(255, 242, 229));
        Question55.setForeground(new java.awt.Color(204, 204, 204));

        jLabel55.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel55.setText("8    $8000");

        javax.swing.GroupLayout Question55Layout = new javax.swing.GroupLayout(Question55);
        Question55.setLayout(Question55Layout);
        Question55Layout.setHorizontalGroup(
            Question55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question55Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel55)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question55Layout.setVerticalGroup(
            Question55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question55Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel55))
        );

        Question50.setBackground(new java.awt.Color(255, 242, 229));
        Question50.setForeground(new java.awt.Color(204, 204, 204));

        jLabel50.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel50.setText("7    $4000");

        javax.swing.GroupLayout Question50Layout = new javax.swing.GroupLayout(Question50);
        Question50.setLayout(Question50Layout);
        Question50Layout.setHorizontalGroup(
            Question50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question50Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel50)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question50Layout.setVerticalGroup(
            Question50Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question50Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel50))
        );

        Question52.setBackground(new java.awt.Color(255, 242, 229));
        Question52.setForeground(new java.awt.Color(204, 204, 204));

        jLabel52.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel52.setText("6    $2000");

        javax.swing.GroupLayout Question52Layout = new javax.swing.GroupLayout(Question52);
        Question52.setLayout(Question52Layout);
        Question52Layout.setHorizontalGroup(
            Question52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question52Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel52)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question52Layout.setVerticalGroup(
            Question52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question52Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel52))
        );

        Question54.setBackground(new java.awt.Color(229, 255, 229));
        Question54.setForeground(new java.awt.Color(204, 204, 204));

        jLabel54.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 11)); // NOI18N
        jLabel54.setText("5    $1000");

        javax.swing.GroupLayout Question54Layout = new javax.swing.GroupLayout(Question54);
        Question54.setLayout(Question54Layout);
        Question54Layout.setHorizontalGroup(
            Question54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Question54Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel54)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Question54Layout.setVerticalGroup(
            Question54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Question54Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel54))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Question5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Question54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Question5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Question1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        nextBtn.setBackground(new java.awt.Color(72, 72, 239));
        nextBtn.setForeground(new java.awt.Color(72, 72, 239));
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/NextBtn2.png"))); // NOI18N
        nextBtn.setBorder(null);
        nextBtn.setBorderPainted(false);
        nextBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nextBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nextBtnMouseExited(evt);
            }
        });
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Money.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Money.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(nextBtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(37, 37, 37)
                .addComponent(nextBtn)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        super.dispose();
        QuestionScreen question = new QuestionScreen();
        question.setVisible(true);
    }//GEN-LAST:event_nextBtnActionPerformed

    private void nextBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseExited
        Color purpleColour = new Color(72,72,239);
        nextBtn.setBackground(purpleColour);
        nextBtn.setForeground(purpleColour);
    }//GEN-LAST:event_nextBtnMouseExited

    private void nextBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextBtnMouseEntered
        nextBtn.setBackground(Color.GREEN);
        nextBtn.setForeground(Color.GREEN);
    }//GEN-LAST:event_nextBtnMouseEntered

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
            java.util.logging.Logger.getLogger(scoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(scoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(scoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(scoreScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new scoreScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Question1;
    private javax.swing.JPanel Question2;
    private javax.swing.JPanel Question3;
    private javax.swing.JPanel Question4;
    private javax.swing.JPanel Question5;
    private javax.swing.JPanel Question50;
    private javax.swing.JPanel Question51;
    private javax.swing.JPanel Question52;
    private javax.swing.JPanel Question53;
    private javax.swing.JPanel Question54;
    private javax.swing.JPanel Question55;
    private javax.swing.JPanel Question56;
    private javax.swing.JPanel Question57;
    private javax.swing.JPanel Question6;
    private javax.swing.JPanel Question7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton nextBtn;
    // End of variables declaration//GEN-END:variables
}
