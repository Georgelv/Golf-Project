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
 * This class contains the information of GeneseeCourse.
 * @author georgelyu
 *
 */
public class GeneseeCourse {

	protected int yards;
	protected int pars;
	protected int numofHoles;
	
	//getters and setters for yards and pars
	 public int getYards() {
			return this.yards;
		}
	public void setYards(int yards) {
			this.yards = yards;
		}
	public int getPars() {
			return this.pars;
		}
	public void setPars(int pars) {
			this.pars = pars;
		}
	
	//methods for finding the yards and pars depending on the tees
	public GeneseeCourse(int numofHoles) {
			if(numofHoles==1){
				this.yards=530;
				this.pars=5;
			}
			 else if(numofHoles==2){
		            this.yards = 305;
		            this.pars = 4;
		        }
		        else if(numofHoles==3){
		            this.yards = 331;
		            this.pars = 4;
		        }
		        else if(numofHoles==4){
		            this.yards = 201;
		            this.pars = 3;
		        }
		        else if(numofHoles==5){
		           this.yards = 500;
		            this.pars = 5;
		        }
		        else if(numofHoles==6){
		            this.yards = 226;
		            this.pars = 3;
		        }
		        else if(numofHoles==7){
		           this.yards = 409;
		            this.pars = 4;
		        }
		        else if(numofHoles==8){
		            this.yards = 410;
		            this.pars = 4;
		        }
		        else if(numofHoles==9){
		            this.yards = 229;
		            this.pars = 3;
		        }
		        else if(numofHoles==10){
		            this.yards = 433;
		            this.pars = 4;
		        }
		        else if(numofHoles==11){
		            this.yards = 363;
		            this.pars = 4;
		        }
		        else if(numofHoles==12){
		            this.yards = 174;
		            this.pars = 3;
		        }
		        else if(numofHoles==13){
		            this.yards = 545;
		            this.pars= 5;
		        }
		        else if(numofHoles==14){
		            this.yards = 419;
		            this.pars = 4;
		        }
		        else if(numofHoles==15){
		            this.yards = 512;
		            this.pars = 5;
		        }
		        else if(numofHoles==16){
		            this.yards = 410;
		            this.pars= 4;
		        }
		        else if(numofHoles==17){
		           this. yards = 320;
		            this.pars = 4;
		        }
		        else if(numofHoles==18){
		           this. yards = 170;
		            this.pars= 3;
		        }
			
		
			

}
	
}
	
