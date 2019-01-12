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
 * This class contains all the loops and outputs.
 * @author georgelyu
 *
 */
import java.util.Scanner;
import java.util.Random;

public class game {


			
	//Methods that contain the loop and outputs
    public static void gameMain() {
    	
    System.out.println(">>>>>Welcome to TTY Golf!<<<<<\n\n");
	System.out.println("Please Select a Course: ");
	System.out.println("1: Genesee Valley Park North Course");
	System.out.println("2. The Old Course at St. Andrews");	
    Scanner scan=new Scanner(System.in);	
	int roundNumber=0;
	
	//for loop for controlling each round
	for(int round=1;round<19;round++) {
		
		int c=scan.nextInt();
		if(c==1) {
	        System.out.println("Your choice is: Genesee Valley Park North Course.");

		}
		else {
	        System.out.println("Your choice is: The Old Course at St. Andrews.");

		}
		int totalScores = 0;
		
		//for loop for controlling each hole
		for(int numofHoles=1; numofHoles<19; numofHoles++) {
			int yards=0;
			int pars=0;
	    if(c==1) {
			System.out.println("You are playing The Genesee Valley Park North Course.\n\n");
			GeneseeCourse g=new GeneseeCourse(numofHoles);
			yards=g.getYards();
			pars=g.getPars();
			
			}		
			
		if(c==2) {
				System.out.println("You are playing The Old Course at St. Andrews.\n\n");
				OldCourse o=new OldCourse(numofHoles);
				yards=o.getYards();
				pars=o.getPars();
			}
		
		Counting n1=new Counting(numofHoles);
		System.out.println("You are at the "+n1.getNum()+" tee."+" Yards to the hole: "+yards+" Pars of this hole: "+pars+"\n");
		
		int counting = 0;
		
		//loop for counting the distance and tracing the location of the golf before reaching the green
		while(yards>20) {
		for(int hit=1;hit<19;hit++) {
			System.out.println("\nPlease choose your club [1-10]");
			
			//extra credit
			//If the ball is in the sand, user must enter 10 or the program will continue infinitely
			int club=scan.nextInt();
			System.out.println("Your choice is: "+club);
			
			if(yards>80&&yards<95) {
				while(club!=10) {
					System.out.println("Please Enter 10 or you cannot get out of the there!");
					club=scan.nextInt();
				}
			}
			
			Clubs clubs=new Clubs(club);
			System.out.println("Please choose your power [1-10]");
			int power=scan.nextInt();
			System.out.println("Your choice is: "+power);
			Distance d=new Distance(clubs.getMean(),clubs.getStd(),power);
			int v=(int)d.getValue();
			System.out.println("You hit the ball with the distance "+v+" yards, Nice!");
			 yards=yards-v;
			
			 //extra credit
			 //Ball land in the water hazard
			 if(yards>50&&yards<65) {
				 System.out.println("\nOops! You are in the water hazard.");
				 System.out.println("Now, you will get back to the last place and play again");
				 System.out.println("Unfortunately, You lose a stroke. Try to get rid of the water hazard next time! \n");
				 yards=yards+v;
				 System.out.println("You still have "+yards+" yards to the hole");
				 continue;
			 }
			 else if(yards>80&&yards<95) {
				 System.out.println("\nOops! You are in the sand trap");
				 System.out.println("You can only use club 10 to get out of here!\n"); 
			 }
			 
			 
			 
			 //the ball is at the back of the hole but it's not out of the green
			 if(yards<0&&yards>=-20) {
				 yards=-yards;
				 System.out.println("Your ball are at the back of the hole but it's on the GREEN!");
			 }
			//In case some players hit the ball out of the green
				if(yards<-20) {
					System.out.println("Sorry. Your ball pass the green. Try to bring it back!");
					yards=-yards;
				}
				
			 Counting n3=new Counting(hit);
			 //water hazard causes the number of shoots plus 1
			 if(yards>50&&yards<65) {
				 
		    	System.out.println("Your "+n3.getNum()+1+" Shoot! "+" You have "+yards+" yards to the hole");
			    hit++;
			 }
			 else {
					System.out.println("Your "+n3.getNum()+" Shoot! "+" You have "+yards+" yards to the hole");

			 }
			//If the ball is on the green, the program will change the clubs for the user
			if(yards<20) {
				counting=hit;
				break;
			}

		}
		}
		
			System.out.println("\n\nCongratulations! You are on the GREEN!!\n\n");
			System.out.println(">>>>>Now, you will change your clubs and putt your ball.>>>>>");
			
			//converting the yards to feet
			int feets=yards*3;
			//make sure feet are not negative
			if (feets<0) {
				feets=-feets;
			}
			
			//for loop for the putting 
			int puttsCounting=0;
			for(int putts=1;putts!=0;putts++) {
				
				System.out.println("Please choose you putt power [1-10]");
				int power2=scan.nextInt();
				Putt p=new Putt(power2);
				//get the distance of the putting
				Distance d2=new Distance(p.getMean(),p.getStddev(),power2);
				int puttDist = (int) d2.getValue();
                System.out.println("\nYour putt went " + puttDist + " feet.");
                feets = feets - puttDist;
                
                //counting the number of shooting
                Counting n2=new Counting(putts+counting);
				System.out.println("This is the "+n2.getNum()+" shoot "+ feets+" feets to the hole!");

                //Locating the ball in the green
                if(feets>1){
                    System.out.println("\n\nYou should putt your ball back! It's far from the hole");
                }
                if(feets<=1) {
                    System.out.println("\n\nCongratualations! The ball is sinking and is in the hole!\n\n ");
                    puttsCounting=putts;
                	break;
            }
			}
			int totalStrokes=puttsCounting+counting;
			//extra credit of golf jargon
			int score=totalStrokes-pars;
			if(score==0) {
				System.out.println("You made par on this hole! Nice!");
			}
			if(score>0) {
				System.out.println("Your score is "+score+" over the par on this hole");
				if(score==1) {
					System.out.println("You made a BOGEY shoot! Good work.");
				}
				else if(score==2) {
					System.out.println("You made a DOUBLE BOGEY shoot! Good work.");

				}
				else if(score==3) {
					System.out.println("You made a TRIPLE BOGEY shoot! Good work.");

				}
			}
			if(score<0) {
				int nscore=-score;
				System.out.println("Your score is "+nscore+" under the par on this hole");
				if(score==-3) {
					System.out.println("You made a ALBATROSS shoot! Unbelievable");
				}
				else if(score==-2) {
					System.out.println("You made a EAGLE shoot! Pefect!");
				}
				else if(score==-1) {
					System.out.println("You made a BIRDY shoot! Excellent Work!");
				}
			}
			if(totalStrokes==0) {
				System.out.println("Hole-in-one!! How lucky you are!");
			}
           totalScores+=score;
           if(totalScores>0) {
			System.out.println("Your score after the "+n1.getNum()+" hole is "+totalScores+" over the par");
           }
           else if(totalScores<0) {
				System.out.println("Your score after the "+n1.getNum()+" hole is "+totalScores+" below the par");

           }
           else if(totalScores==0) {
				System.out.println("Your score after the "+n1.getNum()+" hole is par");

           }
           //user input for next hole or quit
			System.out.println("\nType RETURN to continue to the next hole or Type SKIP to quit this round");
			String choice2=scan.next();
			if(choice2.equalsIgnoreCase("RETURN")) continue;
			if(choice2.equalsIgnoreCase("SKIP")) break;
		}
		//After playing 18 holes, the system will calculate the total score
		if(totalScores<0) {
		System.out.println("\n\nYour final score for this round is: "+totalScores+" under, Nice Work!");
		
		}
		else if(totalScores>0) {
			System.out.println("Your final score for this round is: "+totalScores+" over, Maybe Try Again?");
		}
		//User input for quitting the game or continuing another round
		System.out.println("Would you like to play another round [Y/N]?");
		System.out.println("Y for playng another round:) ; N for quit the game :(");
		System.out.println("Your choice is: ");
		String choice=scan.next();
		if(choice.equalsIgnoreCase("Y")) {
			System.out.println("Another round begins!");
			System.out.println("Please Select a Course: ");
			System.out.println("1: Genesee Valley Park North Course");
			System.out.println("2. The Old Course at St. Andrews");	
			continue;
		}
		else if(choice.equalsIgnoreCase("N")) {
			roundNumber=round;
			break;
		}
	}
	System.out.println("The Game End ");
	System.out.println("You played "+roundNumber+ " rounds\nThank you for playing this game!");
}
    }
