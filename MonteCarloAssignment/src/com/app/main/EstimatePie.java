package com.app.main;

import java.util.concurrent.ThreadLocalRandom;

public class EstimatePie implements PieExact {
	// this method will return the how many points are present inside the circle
	// among total number of points
	public   int estimatePie(int totalPoints) {
		int pointsInCircle = 0;
		for (int i = 0; i < totalPoints; i++) {
			// ThreadLocalRandom generate the random number in double
			// within the range 0.1 to 1.0
			double x = ThreadLocalRandom.current().nextDouble();
			double y = ThreadLocalRandom.current().nextDouble();
			if (x * x + y * y <= 1) {
				pointsInCircle++;
			}
		}
		return pointsInCircle;
		// after completing the for loop 10^6 time the value of points In Circle
		// variable is 785404
	}
}
