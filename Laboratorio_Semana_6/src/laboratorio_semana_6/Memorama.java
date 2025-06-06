    package laboratorio_semana_6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Memorama extends javax.swing.JFrame {

    private JButton[] botones;
    private ImageIcon[] imagenes;
    private ImageIcon oculta;
    private int[] cartas;
    private int primera, segunda;
    private boolean esperando;
    private int intentos;
    private boolean terminado;
    private javax.swing.Timer tiempo;
    private boolean[] correctas;

    public Memorama() {
        initComponents();
        iniciarJuego();
    }

    private void iniciarJuego() {
        botones = new JButton[36];
        imagenes = new ImageIcon[18];
        cartas = new int[36];
        correctas = new boolean[36];
        primera = -1;
        segunda = -1;
        esperando = false;
        intentos = 0;
        terminado = false;

        cargarImagenes();
        ponerBotones();
        mezclarCartas();
        ponerListeners();
        lblIntentosRestantes.setText("Intentos Restantes: 10");
    }
    
    private void cargarImagenes() {
        oculta = new ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"));
        
        String[] nombres = {"ft1.jpg", "ft2.jpg", "ft3.jpg", "ft4.jpg", "ft5.jpg", "ft6.jpg",
            "ft7.jpg", "ft8.jpg", "ft9.jpg", "ft10.jpg", "ft11.jpg", "ft12.jpg",
            "ft13.jpg", "ft14.jpg", "ft15.jpg", "ft16.png", "ft17.jpg", "ft18.jpg"};
        
        for (int i = 0; i < 18; i++) {
            imagenes[i] = new ImageIcon(getClass().getResource("/imagenes/" + nombres[i]));
        }
    }
    
    private void ponerBotones() {
        botones[0] = btnBoton;
        botones[1] = btnBoton1;
        botones[2] = btnBoton2;
        botones[3] = btnBoton3;
        botones[4] = btnBoton4;
        botones[5] = btnBoton5;
        botones[6] = btnBoton6;
        botones[7] = btnBoton7;
        botones[8] = btnBoton8;
        botones[9] = btnBoton9;
        botones[10] = btnBoton10;
        botones[11] = btnBoton11;
        botones[12] = btnBoton12;
        botones[13] = btnBoton13;
        botones[14] = btnBoton14;
        botones[15] = btnBoton15;
        botones[16] = btnBoton16;
        botones[17] = btnBoton17;
        botones[18] = btnBoton18;
        botones[19] = btnBoton19;
        botones[20] = btnBoton20;
        botones[21] = btnBoton21;
        botones[22] = btnBoton22;
        botones[23] = btnBoton23;
        botones[24] = btnBoton24;
        botones[25] = btnBoton25;
        botones[26] = btnBoton26;
        botones[27] = btnBoton27;
        botones[28] = btnBoton28;
        botones[29] = btnBoton29;
        botones[30] = btnBoton30;
        botones[31] = btnBoton31;
        botones[32] = btnBoton32;
        botones[33] = btnBoton33;
        botones[34] = btnBoton34;
        botones[35] = btnBoton35;
    }
    
    private void mezclarCartas() {
        int posicion = 0;
        for (int i = 0; i < 18; i++) {
            cartas[posicion] = i;
            cartas[posicion + 1] = i;
            posicion += 2;
        }
        
        Random random = new Random();
        for (int i = 35; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }
    }
    
    private void ponerListeners() {
        for (int i = 0; i < 36; i++) {
            final int num = i;
            botones[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    click(num);
                }
            });
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBoton = new javax.swing.JButton();
        btnBoton1 = new javax.swing.JButton();
        btnBoton2 = new javax.swing.JButton();
        btnBoton3 = new javax.swing.JButton();
        btnBoton4 = new javax.swing.JButton();
        btnBoton5 = new javax.swing.JButton();
        btnBoton6 = new javax.swing.JButton();
        btnBoton7 = new javax.swing.JButton();
        btnBoton8 = new javax.swing.JButton();
        btnBoton9 = new javax.swing.JButton();
        btnBoton10 = new javax.swing.JButton();
        btnBoton11 = new javax.swing.JButton();
        btnBoton12 = new javax.swing.JButton();
        btnBoton13 = new javax.swing.JButton();
        btnBoton14 = new javax.swing.JButton();
        btnBoton15 = new javax.swing.JButton();
        btnBoton16 = new javax.swing.JButton();
        btnBoton17 = new javax.swing.JButton();
        btnBoton18 = new javax.swing.JButton();
        btnBoton19 = new javax.swing.JButton();
        btnBoton20 = new javax.swing.JButton();
        btnBoton21 = new javax.swing.JButton();
        btnBoton22 = new javax.swing.JButton();
        btnBoton23 = new javax.swing.JButton();
        btnBoton24 = new javax.swing.JButton();
        btnBoton25 = new javax.swing.JButton();
        btnBoton26 = new javax.swing.JButton();
        btnBoton27 = new javax.swing.JButton();
        btnBoton28 = new javax.swing.JButton();
        btnBoton29 = new javax.swing.JButton();
        lblIntentosRestantes = new javax.swing.JLabel();
        btnBoton30 = new javax.swing.JButton();
        btnBoton31 = new javax.swing.JButton();
        btnBoton32 = new javax.swing.JButton();
        btnBoton33 = new javax.swing.JButton();
        btnBoton34 = new javax.swing.JButton();
        btnBoton35 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memorama");

        jPanel1.setLayout(new java.awt.GridLayout(6, 6, 6, 6));

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 47)); // NOI18N
        jLabel1.setText("Juego de Memoria");

        btnBoton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        lblIntentosRestantes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblIntentosRestantes.setText("Intentos Restantes: ");

        btnBoton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        btnBoton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pokebola.jpeg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBoton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBoton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBoton18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBoton24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBoton30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBoton35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblIntentosRestantes, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIntentosRestantes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoton4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoton11, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoton17, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton14, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton15, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoton23, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton20, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton21, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton18, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton22, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoton29, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton25, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton26, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton27, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton24, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton28, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBoton35, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton31, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton32, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton33, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton30, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBoton34, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Memorama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Memorama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoton;
    private javax.swing.JButton btnBoton1;
    private javax.swing.JButton btnBoton10;
    private javax.swing.JButton btnBoton11;
    private javax.swing.JButton btnBoton12;
    private javax.swing.JButton btnBoton13;
    private javax.swing.JButton btnBoton14;
    private javax.swing.JButton btnBoton15;
    private javax.swing.JButton btnBoton16;
    private javax.swing.JButton btnBoton17;
    private javax.swing.JButton btnBoton18;
    private javax.swing.JButton btnBoton19;
    private javax.swing.JButton btnBoton2;
    private javax.swing.JButton btnBoton20;
    private javax.swing.JButton btnBoton21;
    private javax.swing.JButton btnBoton22;
    private javax.swing.JButton btnBoton23;
    private javax.swing.JButton btnBoton24;
    private javax.swing.JButton btnBoton25;
    private javax.swing.JButton btnBoton26;
    private javax.swing.JButton btnBoton27;
    private javax.swing.JButton btnBoton28;
    private javax.swing.JButton btnBoton29;
    private javax.swing.JButton btnBoton3;
    private javax.swing.JButton btnBoton30;
    private javax.swing.JButton btnBoton31;
    private javax.swing.JButton btnBoton32;
    private javax.swing.JButton btnBoton33;
    private javax.swing.JButton btnBoton34;
    private javax.swing.JButton btnBoton35;
    private javax.swing.JButton btnBoton4;
    private javax.swing.JButton btnBoton5;
    private javax.swing.JButton btnBoton6;
    private javax.swing.JButton btnBoton7;
    private javax.swing.JButton btnBoton8;
    private javax.swing.JButton btnBoton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblIntentosRestantes;
    // End of variables declaration//GEN-END:variables
}
