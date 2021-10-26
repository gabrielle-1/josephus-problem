package com.diegopinheiro.projectchallenge_01;

import org.junit.Assert;
import org.junit.Test;



public class TestJosephusProblem {
	
	@Test
	public void testJosephusProblem2And7() {
		int[] actual = JosephusProblem.solve(2, 7);
		int[] expected = {1, 3, 5, 0, 4, 2, 6};
		Assert.assertArrayEquals(expected, actual);
	}
	
	@Test
	public void testJosephusProblem4And7() {
		int[] actual = JosephusProblem.solve(4, 7);
		int[] expected = {3, 0, 5, 4, 6, 2, 1};
		Assert.assertArrayEquals(expected, actual);
	}
}
