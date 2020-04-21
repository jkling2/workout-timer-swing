/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jkling2.workoutappswing;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author jkling
 */
public class CountDownTimer {

    private static final File soundBeforeInterval= new File(".\\src\\main\\resources\\sounds\\beforeInterval.wav");
    private static final File soundBeforeBreak= new File(".\\src\\main\\resources\\sounds\\beforeBreak.wav");
    private final int initialIntervalTime;
    private final int initialBreakTime;
    private final int initialRounds;
    private int currentIntervalTime;
    private int currentBreakTime;
    private int currentRound;
    
    public CountDownTimer(int intervalTime, int breakTime, int rounds) {
        this.initialIntervalTime = intervalTime;
        this.currentIntervalTime = intervalTime;
        this.initialBreakTime = breakTime;
        this.currentBreakTime = breakTime;
        this.initialRounds = rounds;
        this.currentRound = 0;
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

    public void setCurrentIntervalTime(int currentIntervalTime) {
        this.currentIntervalTime = currentIntervalTime;
    }

    public int getCurrentBreakTime() {
        return currentBreakTime;
    }

    public void setCurrentBreakTime(int currentBreakTime) {
        this.currentBreakTime = currentBreakTime;
    }
    
    public int getCurrentRound() {
        return currentRound;
    }
    
    public int getRoundsToGo() {
        return this.initialRounds - this.currentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.currentRound = currentRound;
    }
    
    public int setNextRound() {
        this.currentRound++;
        return this.currentRound;
    }
    
    private void playSound(File file) {
        try {
            // Open an audio input stream.
            URL url = null;
            if (file.canRead()) {
                url = file.toURI().toURL();
            }
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(url);
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
    }

   /**
     * *****************************************
     * Decreases the CountDownTimer by 1 second
     * *****************************************
     */
    public void dec() {
        if (this.currentRound == 0) {
            this.currentRound++;
            playSound(CountDownTimer.soundBeforeInterval);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CountDownTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (this.currentRound <= initialRounds) {
            if (currentIntervalTime > 0) {
                this.currentIntervalTime--;
                if (this.currentIntervalTime == 0) {
                    playSound(CountDownTimer.soundBeforeBreak);
                }
            } else if (currentBreakTime > 0) {
                this.currentBreakTime--;
                if (this.currentBreakTime == 0) {
                    playSound(CountDownTimer.soundBeforeInterval);
                }
            } else if (getRoundsToGo() > 0) {
                this.currentRound++;
                this.currentIntervalTime = this.initialIntervalTime;
                if (getRoundsToGo() >= 0) {
                    this.currentBreakTime = this.initialBreakTime;
                }
            }
        } 
    }
    
    public void resetWorkout() {
        setCurrentIntervalTime(this.initialIntervalTime);
        setCurrentBreakTime(this.initialBreakTime);
        setCurrentRound(0);
    }
    
       /**
         * Returns the object as a string in the format of "00:00:00"
         */
        public String toString() {
            return "countdown from: " + this.initialIntervalTime + "-" + this.initialBreakTime + "_" + this.initialRounds + 
                    "; countdown actual: " + this.currentIntervalTime + "-" + this.currentBreakTime + "-" + this.currentRound ;
        }
}
