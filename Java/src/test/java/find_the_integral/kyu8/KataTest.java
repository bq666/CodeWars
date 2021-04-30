package find_the_integral.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
	@Test
	public void exampleTests() {
		assertEquals("1x^3", Kata.integrate(3,2));
		assertEquals("2x^6", Kata.integrate(12,5));
		assertEquals("10x^2", Kata.integrate(20,1));
		assertEquals("10x^4", Kata.integrate(40,3));
		assertEquals("30x^3", Kata.integrate(90,2));
	}
}