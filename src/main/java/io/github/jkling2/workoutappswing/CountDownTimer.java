/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jkling2.workoutappswing;

import java.io.File;
import java.io.IOException;
import java.net.URL;
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
        this.currentRound = rounds;
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
    
    
    
    private void playSound() {
        try {
         // Open an audio input stream.
         System.out.println(new File("./"));
         File file = new File("C:\\Users\\jkling\\Documents\\Projects\\private\\Swing\\WorkoutAppSwing\\src\\main\\java\\io\\github\\jkling2\\workoutappswing\\sounds\\beforeInterval.wav");
         URL url = null;
        if (file.canRead()) {url = file.toURI().toURL();}
         System.out.println(url);
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
        if (currentIntervalTime > 0) {
            this.currentIntervalTime--;
            if (this.currentIntervalTime == 0) {
                playSound();
            }
        } else if (currentBreakTime > 0) {
            this.currentBreakTime--;
        } else if (currentRound > 0) {
            this.currentRound--;
            this.currentIntervalTime = this.initialIntervalTime;
            this.currentBreakTime = this.initialBreakTime;
        }
        System.out.println(this.toString());
    }
    
       /**
         * Returns the object as a string in the format of "00:00:00"
         */
        public String toString() {
            return this.currentRound + ":" + this.currentIntervalTime + ":" + this.currentBreakTime;
        }
}
