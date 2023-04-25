package org.example;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZappingTest {

	@Test
	public void desdeCanal0HaciaCanal0Devuelve0() {
		int valorInicial = new Zapping(0).countClicksToDestinyUp(0);
		int valorEsperado = 0;
		assertEquals(valorEsperado, valorInicial);
	}
	

	@Test
	public void desdeCanal1HaciaCanal2Devuelve1() {
		int valorInicial = new Zapping(1).countClicksToDestinyUp(2);
		int valorEsperado = 1;
		assertEquals(valorEsperado, valorInicial);
	}
	 
	@Test
	public void desdeCanal10HaciaCanal30Devuelve20() {
		int valorInicial = new Zapping(10).countClicksToDestinyUp(30);
		int valorEsperado = 20;
		assertEquals(valorEsperado, valorInicial);
	}
	
	@Test
	public void desdeCanal2HaciaCanal99Devuelve2() {
		int valorInicial = new Zapping(2).countClicksToDestinyDown(99);
		int valorEsperado = 2;
		assertEquals(valorEsperado, valorInicial);
	}
	
	@Test
	public void desdeCanal5HaciaCanal63Devuelve41() {
		int valorInicial = new Zapping(5).countClicksToDestinyDown(63);
		int valorEsperado = 41;
		assertEquals(valorEsperado, valorInicial);
	}
	
	@Test
	public void desdeCanal63HaciaCanal5Devuelve41() {
		int valorInicial = new Zapping(63).countClicksToDestinyUp(5);
		int valorEsperado = 41;
		assertEquals(valorEsperado, valorInicial);
	}
	
	@Test
	public void desdeCanal1HaciaCanal51Devuelve49() {
		int valorInicial = new Zapping(1).countClicksToDestinyDown(51);
		int valorEsperado = 49;
		assertEquals(valorEsperado, valorInicial);
	}
}
