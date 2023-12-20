package com.app.main;

public class CalculatePie implements PieCalculate {
	//this method is for calculate the approximate value of Pi
    public  double calculatePie(int pointsInCircle, int Points) {
                       
		return 4.0*pointsInCircle/Points;
		
    }
}
