/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workoutappswing;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Class that manages the initial and current workout time.
 * 
 * @author jkling
 */
public class CountDownTimer {

    private static final URL SOUND_BEFORE_INTERVAL = CountDownTimer.class.getClassLoader().getResource("sounds/beforeInterval.wav");
    private static final URL SOUND_BEFORE_BREAK = CountDownTimer.class.getClassLoader().getResource("sounds/beforeBreak.wav");
    
    private final int initialIntervalTime;
    private final int initialBreakTime;
    private final int initialRounds;
    private int currentIntervalTime;
    private int currentBreakTime;
    private int currentRound;
    
    /**
     * Constructor.
     * @param intervalTime the interval time of the workout
     * @param breakTime the break time of the workout
     * @param rounds the number of rounds to perform the workout
     */
    public CountDownTimer(int intervalTime, int breakTime, int rounds) {
        this.initialIntervalTime = intervalTime;
        this.currentIntervalTime = intervalTime;
        this.initialBreakTime = breakTime;
        this.currentBreakTime = breakTime;
        this.initialRounds = rounds;
        this.currentRound = 0;
    }

    /**
     * @return the initial interval time
     */
    public int getInitialIntervalTime() {
        return initialIntervalTime;
    }

    /**
     * @return the initial break time
     */
    public int getInitialBreakTime() {
        return initialBreakTime;
    }

    /**
     * @return the initial number of rounds
     */
    public int getInitialRounds() {
        return initialRounds;
    }

    /**
     * @return the current interval time
     */
    public int getCurrentIntervalTime() {
        return currentIntervalTime;
    }

    /**
     * @return the current break time
     */
    public int getCurrentBreakTime() {
        return currentBreakTime;
    }
    
    /**
     * @return the current round
     */
    public int getCurrentRound() {
        return currentRound;
    }
    
    /**
     * @return the number of rounds that are left
     */
    public int getRoundsToGo() {
        return this.initialRounds - this.currentRound;
    }
    
    /**
     * increments the current round number by one 
     * 
     * @return the new round
     */
    public int setNextRound() {
        this.currentRound++;
        return this.currentRound;
    }
    
    /**
     * plays the sound from the given URL
     * 
     * @param soundURL the URL of the sound to play
     */
    private void playSound(URL soundURL) {
        try {
            // Open an audio input stream.
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundURL);
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
     * Decreases the CountDownTimer by 1 second
     */
    public void dec() {
        if (this.currentRound == 0) {
            this.currentRound++;
            playSound(CountDownTimer.SOUND_BEFORE_INTERVAL);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CountDownTimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (this.currentRound <= initialRounds) {
            if (currentIntervalTime > 0) {
                this.currentIntervalTime--;
                if (this.currentIntervalTime == 0) {
                    playSound(SOUND_BEFORE_BREAK);
                }
            } else if (currentBreakTime > 0) {
                this.currentBreakTime--;
                if (this.currentBreakTime == 0) {
                    playSound(SOUND_BEFORE_INTERVAL);
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
    
    /**
     * Resets the workout by setting the current times/rounds to their initial value
     */
    public void resetWorkout() {
        this.currentIntervalTime = this.initialIntervalTime;
        this.currentBreakTime = this.initialBreakTime;
        this.currentRound = 0;
    }
    
    /**
     * Returns the object as a string
     * 
     * @return the formatted string 
     */
    public String toString() {
        return "countdown from: " + this.initialIntervalTime + "-" + this.initialBreakTime + "_" + this.initialRounds
                + "; countdown actual: " + this.currentIntervalTime + "-" + this.currentBreakTime + "-" + this.currentRound;
    }
}
