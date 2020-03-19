import java.util.*;
import java.lang.*;
import java.io.*;

class Calculation {
	
	int sum(int a, int c) {
		return a + c;
	}
}
class Calculator extends Calculation{
	
	public static void main(String[] args) {
			
		Calculator obj = new Calculator();
		System.out.println(obj.sum(5, 7));
	}
	
}
