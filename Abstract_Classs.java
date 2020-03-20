import java.util.*;
import java.lang.*;
import java.io.*;

abstract class Calculation{
	abstract void sum();
}

class Solve extends Calculation{
	void sum(){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = a + b;
		System.out.println(ans);
	}
	public static void main(String[] args){
		Solve obj = new Solve();
		obj.sum();
	}
}
