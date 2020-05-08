/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workoutappswing;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 * Class that manages the Swing elements involved in the countdown and updates them.
 * 
 * @author jkling
 */
public class Counter {

    private final JProgressBar intervalTimeProgressBar;
    private final JProgressBar breakTimeProgressBar;
    private final JLabel remainingRounds;
    private final JButton startButton;
    private final JButton breakButton;
    private final JButton stopButton;
    private final CountDownTimer timer;

    /**
     * Constructor.
     * 
     * @param intervalTimeProgressBar the progress bar keeping showing the interval time
     * @param breakTimeProgressBar the progress bar showing the break time
     * @param remainingRounds the label showing the remaining rounds
     * @param startButton the button to start the workout
     * @param breakButton the button to break the workout
     * @param stopButton the button to stop the workout
     * @param timer the CountDownTimer
     */
    public Counter(JProgressBar intervalTimeProgressBar, JProgressBar breakTimeProgressBar,
            JLabel remainingRounds, JButton startButton, JButton breakButton,
            JButton stopButton, CountDownTimer timer) {
        this.intervalTimeProgressBar = intervalTimeProgressBar;
        this.breakTimeProgressBar = breakTimeProgressBar;
        this.remainingRounds = remainingRounds;
        this.startButton = startButton;
        this.breakButton = breakButton;
        this.stopButton = stopButton;
        this.timer = timer;
        if (this.timer.getInitialBreakTime() <= 0) {
            this.breakTimeProgressBar.setEnabled(false);
        }
        updateValues();
    }

    /**
     * updates the swing elements based on the current time/round
     */
    public void updateValues() {
        int intervalTime = this.timer.getCurrentIntervalTime();
        this.intervalTimeProgressBar.setValue(intervalTime);
        this.intervalTimeProgressBar.setString(intervalTime + " sec");
        if (this.timer.getRoundsToGo() > 0) {
            this.breakTimeProgressBar.setEnabled(true);
            int breakTime = this.timer.getCurrentBreakTime();
            this.breakTimeProgressBar.setValue(breakTime);
            this.breakTimeProgressBar.setString(breakTime + " sec");
        } else {
            this.breakTimeProgressBar.setEnabled(false);
        }
        this.remainingRounds.setText(this.timer.getCurrentRound() + "/" + this.timer.getInitialRounds() + "Rounds");
    }

    /**
     * "increments" the Counter - triggers the Counter for its next action
     * 
     * @param manager the CountDownManager that holds this Counter
     */
    public void tick(CountDownManager manager) {
        this.timer.dec();
        updateValues();
        if (this.timer.getCurrentIntervalTime() <= 0 && this.timer.getRoundsToGo() <= 0) {
            manager.clear();
            int res = JOptionPane.showConfirmDialog(this.intervalTimeProgressBar, "Congratulations! You finished your Workout!", "Wuhuuu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
            // reset workout
            if (res == 0) {
                this.timer.resetWorkout();
                updateValues();
                this.startButton.setText("Start");
                this.startButton.setEnabled(true);
                this.breakButton.setEnabled(false);
                this.stopButton.setEnabled(false);
            }
        }
    }

}
