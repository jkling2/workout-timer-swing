/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jkling2.workoutappswing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 * Class that manages the Counter and the Timer.
 * 
 * @author jkling
 */
public class CountDownManager {

    private Counter timer;

    /**
     * Constructor initializing and starting a 1 sec timer
     */
    public CountDownManager() {

        Timer countdownTimer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (timer != null) {
                    timer.tick(CountDownManager.this);
                }
            }
        });
        countdownTimer.start();
    }

    /**
     * set the given Counter
     * 
     * @param timer the Counter to set
     */
    public void set(Counter timer) {
        this.timer = timer;
    }

    /**
     * remove the current Counter
     */
    public void clear() {
        this.timer = null;
    }

}
