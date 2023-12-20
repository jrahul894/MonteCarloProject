package com.app.main;

import java.util.Scanner;

public class PiEstimation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no. of points");
		int points = sc.nextInt();
		
		PieExact epi = new EstimatePie();
		int pointsInCircle = epi.estimatePie(points);
		
		PieCalculate cpi = new CalculatePie();
		double piApproximate = cpi.calculatePie(pointsInCircle, points);
		
		System.out.println("Apprimated Pi=" + piApproximate);

	}

}
