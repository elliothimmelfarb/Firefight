package fireModel;

public class Test {

	public static void main(String[] args) {
		FiringModel fireModel = new FiringModel();
		int times = 50;
		
		while (times > 0){
			System.out.println(fireModel.getDeviationAngle() + " " + fireModel.getDeviationDistance(1, 100));
			times--;
		}
	}

}
