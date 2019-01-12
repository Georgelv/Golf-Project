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
 * This class contains the information of distance that each club can generate.
 * @author georgelyu
 *
 */
import java.util.Random;
public class Distance {

	protected int mean;
	protected int std;
	protected int power;
	protected double value;
	
	//Methods for getting the value
	public double getValue() {
		return this.value;
	}

	//getters and setters for mean std and power
	public int getMean() {
		return mean;
	}

	public int getStd() {
		return std;
	}
	
	public int getPower() {
		return power;
	}

	//method for getting distance of the golf
	
	public Distance(int mean, int stddev, int power) {
		
		Random random=new Random();
		double mean_adj = mean * power / 10.0;
		double stddev_adj = stddev * power / 10.0;
		double value = Math.abs(random.nextGaussian() * stddev_adj + mean_adj);
		this.value=value;
	}
	
	
	
	
}
