/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jkling2.workoutappswing;

/**
 *
 * @author jkling
 */
public class WorkoutAppGUI extends javax.swing.JFrame {

    /**
     * Creates new form WorkoutAppGUI
     */
    public WorkoutAppGUI() {
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        configurationPanel = new javax.swing.JPanel();
        submitButton = new javax.swing.JButton();
        configureButton = new javax.swing.JButton();
        intervalPanel = new javax.swing.JPanel();
        intervalTimeSlider = new javax.swing.JSlider();
        intervalUnitLabel = new javax.swing.JLabel();
        intervalTimeLabel = new javax.swing.JLabel();
        breakPanel = new javax.swing.JPanel();
        breakUnitLabel = new javax.swing.JLabel();
        breakTimeSlider = new javax.swing.JSlider();
        breakTimeLabel = new javax.swing.JLabel();
        roundPanel = new javax.swing.JPanel();
        roundsUnitLabel = new javax.swing.JLabel();
        roundsSlider = new javax.swing.JSlider();
        roundsLabel = new javax.swing.JLabel();
        configurationHeader = new javax.swing.JLabel();
        timerPanel = new javax.swing.JPanel();
        breakButton = new javax.swing.JButton();
        workoutStateLabel = new javax.swing.JLabel();
        breakProgressBar = new javax.swing.JProgressBar();
        stopButton = new javax.swing.JButton();
        intervalProgressBar = new javax.swing.JProgressBar();
        startButton = new javax.swing.JButton();
        timerHeader = new javax.swing.JLabel();
        remainingRoundsLabel = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Workout App");

        configurationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        configurationPanel.setPreferredSize(new java.awt.Dimension(315, 146));

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        configureButton.setText("Configure");
        configureButton.setEnabled(false);
        configureButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configureButtonActionPerformed(evt);
            }
        });

        intervalTimeSlider.setMaximum(120);
        intervalTimeSlider.setPaintLabels(true);
        intervalTimeSlider.setValue(0);
        intervalTimeSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        intervalTimeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                intervalTimeSliderStateChanged(evt);
            }
        });

        intervalUnitLabel.setText("0 sec");

        intervalTimeLabel.setText("Interval Time");

        javax.swing.GroupLayout intervalPanelLayout = new javax.swing.GroupLayout(intervalPanel);
        intervalPanel.setLayout(intervalPanelLayout);
        intervalPanelLayout.setHorizontalGroup(
            intervalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(intervalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(intervalTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intervalTimeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intervalUnitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        intervalPanelLayout.setVerticalGroup(
            intervalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(intervalPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(intervalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(intervalTimeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intervalUnitLabel)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, intervalPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(intervalTimeLabel))
        );

        breakUnitLabel.setText("0 sec");

        breakTimeSlider.setMaximum(120);
        breakTimeSlider.setPaintLabels(true);
        breakTimeSlider.setValue(0);
        breakTimeSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                breakTimeSliderStateChanged(evt);
            }
        });

        breakTimeLabel.setText("Break Time");

        javax.swing.GroupLayout breakPanelLayout = new javax.swing.GroupLayout(breakPanel);
        breakPanel.setLayout(breakPanelLayout);
        breakPanelLayout.setHorizontalGroup(
            breakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(breakTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakTimeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakUnitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        breakPanelLayout.setVerticalGroup(
            breakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(breakPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(breakPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakTimeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(breakTimeLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(breakUnitLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, 0))
        );

        roundsUnitLabel.setText("0 Rounds");

        roundsSlider.setMaximum(50);
        roundsSlider.setPaintLabels(true);
        roundsSlider.setValue(0);
        roundsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                roundsSliderStateChanged(evt);
            }
        });

        roundsLabel.setText("Rounds");

        javax.swing.GroupLayout roundPanelLayout = new javax.swing.GroupLayout(roundPanel);
        roundPanel.setLayout(roundPanelLayout);
        roundPanelLayout.setHorizontalGroup(
            roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roundsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundsUnitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
        );
        roundPanelLayout.setVerticalGroup(
            roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(roundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roundsUnitLabel)
                    .addComponent(roundsLabel))
                .addGap(0, 0, 0))
        );

        configurationHeader.setForeground(java.awt.SystemColor.textHighlight);
        configurationHeader.setLabelFor(configurationHeader);
        configurationHeader.setText("Workout Configuration");
        configurationHeader.setPreferredSize(new java.awt.Dimension(102, 13));

        javax.swing.GroupLayout configurationPanelLayout = new javax.swing.GroupLayout(configurationPanel);
        configurationPanel.setLayout(configurationPanelLayout);
        configurationPanelLayout.setHorizontalGroup(
            configurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configurationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(configurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(configurationHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(roundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(configurationPanelLayout.createSequentialGroup()
                        .addGroup(configurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(intervalPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(breakPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, configurationPanelLayout.createSequentialGroup()
                                .addComponent(submitButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(configureButton)))
                        .addGap(0, 0, 0)))
                .addGap(13, 13, 13))
        );
        configurationPanelLayout.setVerticalGroup(
            configurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configurationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configurationHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intervalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(roundPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(configurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(configureButton)
                    .addComponent(submitButton))
                .addContainerGap())
        );

        timerPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        timerPanel.setPreferredSize(new java.awt.Dimension(315, 151));

        breakButton.setText("Break");
        breakButton.setEnabled(false);
        breakButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breakButtonActionPerformed(evt);
            }
        });

        workoutStateLabel.setText(intervalUnitLabel.getText() + " PUSH - " + breakUnitLabel.getText() + " REST - " + roundsUnitLabel.getText());
        workoutStateLabel.setEnabled(false);

        breakProgressBar.setEnabled(false);
        breakProgressBar.setString(breakProgressBar.getValue() + " sec");
        breakProgressBar.setStringPainted(true);

        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        intervalProgressBar.setEnabled(false);
        intervalProgressBar.setString(intervalProgressBar.getValue() + " sec");
        intervalProgressBar.setStringPainted(true);

        startButton.setText("Start");
        startButton.setEnabled(false);
        startButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        timerHeader.setForeground(java.awt.SystemColor.textHighlight);
        timerHeader.setLabelFor(timerHeader);
        timerHeader.setText("Workout Timer");

        remainingRoundsLabel.setText("0/" + roundsUnitLabel.getText());
        remainingRoundsLabel.setEnabled(false);

        javax.swing.GroupLayout timerPanelLayout = new javax.swing.GroupLayout(timerPanel);
        timerPanel.setLayout(timerPanelLayout);
        timerPanelLayout.setHorizontalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(breakProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timerHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(timerPanelLayout.createSequentialGroup()
                        .addGroup(timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(timerPanelLayout.createSequentialGroup()
                                .addComponent(startButton)
                                .addGap(28, 28, 28)
                                .addComponent(breakButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(stopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(workoutStateLabel)
                            .addComponent(remainingRoundsLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(intervalProgressBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        timerPanelLayout.setVerticalGroup(
            timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(timerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(timerHeader)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(workoutStateLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remainingRoundsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(intervalProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(breakProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(timerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(breakButton)
                    .addComponent(stopButton))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(timerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(configurationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(configurationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(timerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void changeFocus() {
        submitButton.setEnabled(!submitButton.isEnabled());
        configureButton.setEnabled(!configureButton.isEnabled());
        intervalTimeLabel.setEnabled(!intervalTimeLabel.isEnabled());
        intervalTimeSlider.setEnabled(!intervalTimeSlider.isEnabled());
        intervalUnitLabel.setEnabled(!intervalUnitLabel.isEnabled());
        breakTimeLabel.setEnabled(!breakTimeLabel.isEnabled());
        breakTimeSlider.setEnabled(!breakTimeSlider.isEnabled());
        breakUnitLabel.setEnabled(!breakUnitLabel.isEnabled());
        roundsLabel.setEnabled(!roundsLabel.isEnabled());
        roundsSlider.setEnabled(!roundsSlider.isEnabled());
        roundsUnitLabel.setEnabled(!roundsUnitLabel.isEnabled());
        workoutStateLabel.setEnabled(!workoutStateLabel.isEnabled());
        remainingRoundsLabel.setEnabled(!remainingRoundsLabel.isEnabled());
        intervalProgressBar.setEnabled(!intervalProgressBar.isEnabled());
        breakProgressBar.setEnabled(!breakProgressBar.isEnabled());
    }
    
    private void startButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        if (counter != null) {
            countDownManager.set(counter);
            startButton.setText("Continue");
            startButton.setEnabled(false);
            breakButton.setEnabled(true);
            stopButton.setEnabled(true);
        }
        //wTT.startCountdown(this.intervalProgressBar, this.breakProgressBar, this.startButton);
        //wTT = new WorkoutTimerThread(this.intervalTimeSlider.getValue(), this.breakTimeSlider.getValue(), this.roundsSlider.getValue());
    }//GEN-LAST:event_startButtonActionPerformed

    private void breakButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_breakButtonActionPerformed
        countDownManager.clear();
        startButton.setEnabled(true);
        breakButton.setEnabled(false);
        stopButton.setEnabled(false);
    }//GEN-LAST:event_breakButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        countDownManager.clear();
        startButton.setEnabled(true);
        breakButton.setEnabled(false);
        stopButton.setEnabled(false);
    }//GEN-LAST:event_stopButtonActionPerformed

    private void roundsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_roundsSliderStateChanged
        roundsUnitLabel.setText(roundsSlider.getValue() + " Rounds");
    }//GEN-LAST:event_roundsSliderStateChanged

    private void breakTimeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_breakTimeSliderStateChanged
        breakUnitLabel.setText(breakTimeSlider.getValue() + " sec");
    }//GEN-LAST:event_breakTimeSliderStateChanged

    private void intervalTimeSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_intervalTimeSliderStateChanged
        intervalUnitLabel.setText(intervalTimeSlider.getValue() + " sec");
    }//GEN-LAST:event_intervalTimeSliderStateChanged

    private void configureButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configureButtonActionPerformed
        changeFocus();
        breakButton.setEnabled(false);
        stopButton.setEnabled(false);
        startButton.setEnabled(false);
        countDownManager.clear();
    }//GEN-LAST:event_configureButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        changeFocus();
        startButton.setEnabled(true);
        startButton.setText("Start");
        breakButton.setEnabled(false);
        stopButton.setEnabled(false);
        workoutStateLabel.setText(intervalUnitLabel.getText() + " PUSH - " + breakUnitLabel.getText() + " REST - " + roundsUnitLabel.getText());
        intervalProgressBar.setMaximum(intervalTimeSlider.getValue());
        breakProgressBar.setMaximum(breakTimeSlider.getValue());

        countDownTimer = new CountDownTimer(intervalTimeSlider.getValue(), breakTimeSlider.getValue(), roundsSlider.getValue());
        counter = new Counter(intervalProgressBar, breakProgressBar, remainingRoundsLabel, countDownTimer);

        //wTT = new WorkoutTimerThread(this.intervalTimeSlider.getValue(), this.breakTimeSlider.getValue(), this.roundsSlider.getValue());
    }//GEN-LAST:event_submitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(WorkoutAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WorkoutAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WorkoutAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WorkoutAppGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WorkoutAppGUI().setVisible(true);
            }
        });
    }
    
    //private WorkoutTimerThread wTT;
    CountDownManager countDownManager = new CountDownManager();
    private CountDownTimer countDownTimer;
    private Counter counter;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton breakButton;
    private javax.swing.JPanel breakPanel;
    private javax.swing.JProgressBar breakProgressBar;
    private javax.swing.JLabel breakTimeLabel;
    private javax.swing.JSlider breakTimeSlider;
    private javax.swing.JLabel breakUnitLabel;
    private javax.swing.JLabel configurationHeader;
    private javax.swing.JPanel configurationPanel;
    private javax.swing.JButton configureButton;
    private javax.swing.JPanel intervalPanel;
    private javax.swing.JProgressBar intervalProgressBar;
    private javax.swing.JLabel intervalTimeLabel;
    private javax.swing.JSlider intervalTimeSlider;
    private javax.swing.JLabel intervalUnitLabel;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel remainingRoundsLabel;
    private javax.swing.JPanel roundPanel;
    private javax.swing.JLabel roundsLabel;
    private javax.swing.JSlider roundsSlider;
    private javax.swing.JLabel roundsUnitLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JButton stopButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel timerHeader;
    private javax.swing.JPanel timerPanel;
    private javax.swing.JLabel workoutStateLabel;
    // End of variables declaration//GEN-END:variables
}
