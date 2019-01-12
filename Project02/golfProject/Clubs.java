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
 * This class contains the information of different clubs.
 * @author georgelyu
 *
 */

//methods for getting the information of different clubs
public class Clubs {

	 protected int mean;
	    protected int std;
	    protected String clubName;


	    //getters and setters
	    public int getMean() {
	        return mean;
	    }

	    public int getStd() {
	        return std;
	    }

	    //constructors that contain the information of different clubs
	    public Clubs(int club) {
	        if(club==1){
	            clubName = "Driver";
	            mean = 230;
	            std = 30;
	        }
	        else if(club==2){
	            clubName = "3-wood";
	            mean = 215;
	            std = 20;
	        }
	        else if(club==3){
	            clubName = "3-iron";
	            mean = 180;
	            std = 20;
	        }
	        else if(club==4){
	            clubName = "4-iron";
	            mean = 170;
	            std = 17;
	        }
	        else if(club==5){
	            clubName = "5-iron";
	            mean = 155;
	            std = 15;
	        }
	        else if(club==6){
	            clubName = "6-iron";
	            mean = 145;
	            std = 15;
	        }
	        else if(club==7){
	            clubName = "7-iron";
	            mean = 135;
	            std = 15;
	        }
	        else if(club==8){
	            clubName = "8-iron";
	            mean = 125;
	            std = 15;
	        }
	        else if(club==9){
	            clubName = "9-iron";
	            mean = 110;
	            std = 10;
	        }
	        else if(club==10){
	            clubName = "Wedge";
	            mean = 50;
	            std = 10;
	        }
	
	
	    }
}
