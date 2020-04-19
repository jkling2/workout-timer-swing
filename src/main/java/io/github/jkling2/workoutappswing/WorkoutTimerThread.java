/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jkling2.workoutappswing;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JProgressBar;

/**
 *
 * @author jkling
 */
public class WorkoutTimerThread extends Thread{
    private final int initialIntervalTime;
    private final int initialBreakTime;
    private final int initialRounds;
    private int currentIntervalTime;
    private int currentBreakTime;
    private int currentRound;
    private JProgressBar iTPB;
    private JProgressBar bTPB;
    private JButton startButton;
    private JButton breakButton;
    private JButton stopButton;
    
    public WorkoutTimerThread(int iIT, int iBT, int iR) {
        this.initialIntervalTime=iIT;
        this.initialBreakTime=iBT;
        this.initialRounds=iR;
    }

    public int getInitialIntervalTime() {
        return initialIntervalTime;
    }

    public int getInitialBreakTime() {
        return initialBreakTime;
    }

    public int getInitialRounds() {
        return initialRounds;
    }

    public int getCurrentIntervalTime() {
        return currentIntervalTime;
    }

    public int getCurrentBreakTime() {
        return currentBreakTime;
    }

    public int getCurrentRound() {
        return currentRound;
    }
    
    private void initializeCountdown() {
        this.currentIntervalTime = this.initialIntervalTime;
        this.currentBreakTime = this.initialBreakTime;
        this.currentRound = this.initialRounds;
    }
    
    public void startCountdown(JProgressBar iTPB, JProgressBar bTPB, JButton startButton) {
        this.iTPB = iTPB;
        this.bTPB = bTPB;
        this.startButton = startButton;
        start();
    }
    
    public void pauseCountdown() {
        
    }
    
    public void stopCountdown() {
        
    }
    
    @Override
    public void run() {
        this.startButton.setEnabled(false);
        initializeCountdown();
        while (this.currentRound > 0) {
            while (this.currentIntervalTime > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(WorkoutTimerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.currentIntervalTime--;
                iTPB.setValue(this.currentIntervalTime);
                iTPB.setString(this.currentIntervalTime + " sec");
            }
            while (this.currentBreakTime > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(WorkoutTimerThread.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.currentBreakTime--;
                bTPB.setValue(this.currentBreakTime);
                bTPB.setString(this.currentBreakTime + " sec");
            }
            this.currentRound--;
            this.currentIntervalTime = this.initialIntervalTime;
            iTPB.setValue(this.currentIntervalTime);
            iTPB.setString(this.currentIntervalTime + " sec");
            this.currentBreakTime = this.initialBreakTime;
            bTPB.setValue(this.currentBreakTime);
            bTPB.setString(this.currentBreakTime + " sec");
        }
        this.startButton.setEnabled(true);
    }
}
