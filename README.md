# Workout Timer App using Swing

This Swing-based Workout Timer lets you set the Interval Time, Break Time and Rounds for your individual Workout. 

![Demo](/WorkoutTimerSwing_demo.PNG)

A newer application (build with React) that works the same way can be found here: [React Workout Timer](https://jkling2.github.io/workout-timer/ "React Workout Timer").

## Steps to build and run the Swing application
Prerequisite for execution is a Java installation on your machine (version 8+). 

```bash

#clone repo
git clone https://github.com/jkling2/workout-timer-swing.git
cd workout-timer-swing

# build using maven
mvn package

# run using maven
mvn exec:java -Dexec.mainClass="io.github.jkling2.workoutappswing.WorkoutAppGUI"

# run the JAR
cd target
java -jar WorkoutAppSwing-1.0-SNAPSHOT.jar

```