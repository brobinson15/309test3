package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import logic.WeightConversion;

class TestWeightConversion {

	@Test
	public void testKilosToPounds() {
		WeightConversion wc = new WeightConversion();
		double output = wc.KilosToPounds(10);
		assertEquals(22.026431, output, 0.000001);
	}
	
	@Test
	public void testPoundsToKilos() {
		WeightConversion wc = new WeightConversion();
		double output = wc.PoundsToKilos(20);
		assertEquals(9.08, output, 0.000001);
	}
}
