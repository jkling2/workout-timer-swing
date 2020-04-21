/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jkling2.workoutappswing;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

    public class Counter {

        private final JProgressBar iTPB;
        private final JProgressBar bTPB;
        private final JLabel remainingRounds;
        private final JButton startButton;
        private final JButton breakButton;
        private final JButton stopButton;
        private final CountDownTimer timer;

        public Counter(JProgressBar iTPB, JProgressBar bTPB, JLabel remainingRounds, JButton startButton, JButton breakButton, JButton stopButton, CountDownTimer timer) {
            this.iTPB = iTPB;
            this.bTPB = bTPB;
            this.remainingRounds = remainingRounds;
            this.startButton = startButton;
            this.breakButton = breakButton;
            this.stopButton = stopButton;
            this.timer = timer;
            if (timer.getInitialBreakTime() <= 0) {
                bTPB.setEnabled(false);
            }
            updateValues();
        }
        
        public void updateValues() {
            int intervalTime = timer.getCurrentIntervalTime();
            iTPB.setValue(intervalTime);
            iTPB.setString(intervalTime + " sec");
            if (timer.getRoundsToGo() > 0) {
                bTPB.setEnabled(true);
                int breakTime = timer.getCurrentBreakTime();
                bTPB.setValue(breakTime);
                bTPB.setString(breakTime + " sec");
            } else {
                bTPB.setEnabled(false);
            }
            remainingRounds.setText(timer.getCurrentRound() + "/" + timer.getInitialRounds() + "Rounds");
        }

        public void tick(CountDownManager manager) {
            timer.dec();
            updateValues();
            if (timer.getCurrentIntervalTime() <= 0 && timer.getRoundsToGo() <= 0) {
                manager.clear();
                int res = JOptionPane.showConfirmDialog(iTPB, "Congratulations! You finished your Workout!", "Wuhuuu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
                // reset workout
                if (res == 0) {
                    timer.resetWorkout();
                    updateValues();
                    startButton.setText("Start");
                    startButton.setEnabled(true);
                    breakButton.setEnabled(false);
                    stopButton.setEnabled(false);
                }
            }
        }

    }
