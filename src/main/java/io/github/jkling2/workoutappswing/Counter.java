/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.jkling2.workoutappswing;

import javax.swing.JLabel;
import javax.swing.JProgressBar;

    public class Counter {

        private final JProgressBar iTPB;
        private final JProgressBar bTPB;
        private final JLabel remainingRounds;
        private final CountDownTimer timer;

        public Counter(JProgressBar iTPB, JProgressBar bTPB, JLabel remainingRounds, CountDownTimer timer) {
            this.iTPB = iTPB;
            this.bTPB = bTPB;
            this.remainingRounds = remainingRounds;
            this.timer = timer;
            updateValues();
        }
        
        private void updateValues() {
            int intervalTime = timer.getCurrentIntervalTime();
            iTPB.setValue(intervalTime);
            iTPB.setString(intervalTime + " sec");
            int breakTime = timer.getCurrentBreakTime();
            bTPB.setValue(breakTime);
            bTPB.setString(breakTime + " sec");
            int roundsToGo = timer.getCurrentRound();
            remainingRounds.setText((timer.getInitialRounds() - roundsToGo + 1) + "/" + timer.getInitialRounds() + "Rounds");
        }

        public void tick(CountDownManager manager) {
            timer.dec();
            updateValues();
            if (timer.getCurrentIntervalTime() <= 0 && timer.getCurrentBreakTime() <= 0 && timer.getCurrentRound() <= 1) {
                manager.clear();
            }
        }

    }
