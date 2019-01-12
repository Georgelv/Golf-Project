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
 * This class converts the number in word version.
 * @author georgelyu
 *
 */
public class Counting {

	 protected String num;

	 //Methods for getting the number in word version
	    public String getNum() {
	        return this.num;
	    }

	    public Counting(int Num){
	        if (Num==1) num = "First";
	        if (Num==2) num = "Second";
	        if (Num==3) num = "Third";
	        if (Num==4) num = "Fourth";
	        if (Num==5) num = "Fifth";
	        if (Num==6) num = "Sixth";
	        if (Num==7) num = "Seventh";
	        if (Num==8) num = "Eighth";
	        if (Num==9) num = "Ninth";
	        if (Num==10) num = "Tenth";
	        if (Num==11) num = "Eleventh";
	        if (Num==12) num = "Twelfth";
	        if (Num==13) num = "Thirteenth";
	        if (Num==14) num = "Fourteenth";
	        if (Num==15) num = "Fifteenth";
	        if (Num==16) num = "Sixteenth";
	        if (Num==17) num = "Seventeenth";
	        if (Num==18) num = "Final";
	    }

}
