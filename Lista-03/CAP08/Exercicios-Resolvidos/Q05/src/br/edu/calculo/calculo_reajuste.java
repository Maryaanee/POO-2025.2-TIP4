package br.edu.calculo;

public class calculo_reajuste {
	
	public static double calculo_reajuste(double pa, double pn) {
		double result; 
		result = (100 * pn - 100 * pa) / pa;
		return result;
	} 	
}
