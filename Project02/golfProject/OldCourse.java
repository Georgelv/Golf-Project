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
 * This class contains the information of OldCourse.
 * @author georgelyu
 *
 */
public class OldCourse {
	
	

	protected int yards;
	protected int pars;
	protected int numofHoles;
	protected String nameofHoles;
	
	
	//constructor of the old course with the method for getting yards, pars, and name
		  public OldCourse(int numofHoles){
		        if(numofHoles==1){
		            this.yards = 376;
		            this.pars = 4;
		            this.nameofHoles = "Burn";
		        }
		        else if(numofHoles==2){
		            this.yards = 453;
		            this.pars = 4;
		            this.nameofHoles = "Dyke";
		        }
		        else if(numofHoles==3){
		        	this.yards = 397;
		        	this.pars = 4;
		            this.nameofHoles = "Cartgate (out)";
		        }
		        else if(numofHoles==4){
		        	this.yards = 480;
		        	this.pars = 4;
		            this.nameofHoles = "Ginger beer";
		        }
		        else if(numofHoles==5){
		        	this.yards = 568;
		        	this.pars = 5;
		            this.nameofHoles = "Hole O'Cross (out)";
		        }
		        else if(numofHoles==6){
		        	this.yards = 412;
		        	this.pars = 4;
		            this.nameofHoles = "Heathery (out)";
		        }
		        else if(numofHoles==7){
		        	this.yards = 371;
		        	this.pars = 4;
		            this.nameofHoles = "High (out)";
		        }
		        else if(numofHoles==8){
		        	this.yards = 175;
		        	this.pars = 3;
		            this.nameofHoles = "Short";
		        }
		        else if(numofHoles==9){
		        	this.yards = 352;
		        	this.pars = 4;
		            this.nameofHoles = "End";
		        }
		        else if(numofHoles==10){
		        	this.yards = 386;
		        	this.pars = 4;
		            this.nameofHoles = "Bobby Jones";
		        }
		        else if(numofHoles==11){
		        	this.yards = 174;
		        	this.pars = 3;
		            this.nameofHoles = "High (in)";
		        }
		        else if(numofHoles==12){
		        	this.yards = 348;
		        	this.pars = 4;
		            this.nameofHoles = "Heathery (in)";
		        }
		        else if(numofHoles==13){
		        	this.yards = 465;
		        	this.pars = 4;
		            this.nameofHoles = "Hole O'Cross (in)";
		        }
		        else if(numofHoles==14){
		        	this.yards = 618;
		            this.pars = 5;
		            this.nameofHoles = "Long";
		        }
		        else if(numofHoles==15){
		        	this.yards = 455;
		        	this.pars = 4;
		            this.nameofHoles = "Cartgate";
		        }
		        else if(numofHoles==16){
		        	this.yards = 423;
		        	this.pars = 4;
		            this.nameofHoles = "Corner of the Dyke";
		        }
		        else if(numofHoles==17){
		        	this.yards = 495;
		        	this.pars = 4;
		            this.nameofHoles = "Road";
		        }
		        else if(numofHoles==18){
		        	this.yards = 357;
		        	this.pars = 4;
		            this.nameofHoles = "Tom Morris";
		        }
		
	}
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
	public void setnameofHoles(String nameofHoles) {
		    this.nameofHoles=nameofHoles;
	}
	public String getnameofHoles() {
		return nameofHoles;
	}
	
}
	


