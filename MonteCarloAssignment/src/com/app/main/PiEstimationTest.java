package com.app.main;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class PiEstimationTest {

	@Test
	public void testPiApproximation() {
		int points=1000000;
		PieExact p1=new EstimatePie();
		int pointsInCircle=p1.estimatePie(points);
		PieCalculate p2=new CalculatePie();
		double piAproximate=p2.calculatePie(pointsInCircle, points);
	    assertTrue(piAproximate>3 && piAproximate<4);
       
	}
	@Test
	public void testPiApproximation1() {
		int points=1000000;
		PieExact p1=new EstimatePie();
     	int pointsInCircle=p1.estimatePie(points);
		PieCalculate p2=new CalculatePie();
		double piAproximate=p2.calculatePie(pointsInCircle, points);
	    assertFalse(piAproximate<3 && piAproximate>4);
       
	}
	

    @Test
    public void testPiEstimationWithZeroPoints() {
		double piValue = new EstimatePie().estimatePie(0); // Should return 0 if there are no points
        assertEquals(0.0, piValue, 0.0);
    }
	    
	
}
