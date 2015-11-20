package fireModel;

/**
 * Used in a infantry combat simulation to determine where a bullet misses a target
 * @author Elliot Himmelfarb
 *
 */
public class FiringModel {
	
	public FiringModel () {}
	
	
	/**
	 * returns deviation angle in degrees (360) from the intended target
	 * @return degree angle of deviation
	 */
	public int getDeviationAngle() {
		return (int)(Math.random() * 360);
	}
	
	/**
	 * returns the distance of the deviation in centimeters from the intended point
	 * @param inaccuracyVal total inaccuracy value
	 * @param distance2Target how far the target is from the shooter
	 * @return
	 */
	public int getDeviationDistance(double inaccuracyVal, double distance2Target) {
		double missVal = (Math.random() * inaccuracyVal);
		int missVal2 = (int)(distance2Target*Math.tan(missVal));
		if (missVal2 < 0) missVal2 *= -1;
		
		return missVal2;
	}
}
