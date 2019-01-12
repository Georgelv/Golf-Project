package golfProject;
/*
 * Name: Zhaozhou Lyu
 * NetID: zlyu2
 * Assignment number: Project02
 * Lab: TR6:15PM
 * 
 * I did not collaborate with anyone on this assignment.
 */
/**
 * This class contains the information of putting the ball in the green.
 * @author georgelyu
 *
 */
public class Putt {
	 protected int mean;
     protected int stddev;

    //getters
    public int getMean() {
        return mean;
    }

    public int getStddev() {
        return stddev;
    }

    //Putting constructor for tracking the distance of the ball in the green
    public Putt(int power){
        if(power==1){
            mean = 1;
            stddev = 1;
        }
        if(power==2){
            mean = 2;
            stddev = 1;
        }
        if(power==3){
            mean = 4;
            stddev = 2;
        }
        if(power==4){
            mean = 8;
            stddev = 2;
        }
        if(power==5){
            mean = 12;
            stddev = 3;
        }
        if(power==6){
            mean = 16;
            stddev = 3;
        }
        if(power==7){
            mean = 20;
            stddev = 4;
        }
        if(power==8){
            mean = 25;
            stddev = 4;
        }
        if(power==9){
            mean = 30;
            stddev = 5;
        }
        if(power==10){
            mean = 40;
            stddev = 5;
        }
    }
}
