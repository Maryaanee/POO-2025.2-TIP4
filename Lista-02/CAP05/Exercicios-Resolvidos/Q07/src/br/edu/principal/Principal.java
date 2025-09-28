package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		int num1, num2, res;
		num1 = 0;
		num2 = 1;
		System.out.print(num1 + ",");
		System.out.print(num2 + ",");
		
		
		for(int i = 3; i < 8; i ++ ) {
			res = num1 + num2;
			System.out.print(res + ",");
			num1 = num2;
			num2 = res;
		}
		System.out.print("...");
		

	}

}
