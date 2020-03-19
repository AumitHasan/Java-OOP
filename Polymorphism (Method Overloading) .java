import java.util.*;
import java.lang.*;
import java.io.*;


class Aumit{
	
	int sum(int a, int b){
		return a + b;
	}
	int sum(int a, int b, int c){
		return a + b + c;
	}
	
	public static void main(String[] args) {
			
		Aumit obj = new Aumit();
		
		System.out.println(obj.sum(5, 7));
		System.out.println(obj.sum(1, 2, 3));
	}
	
}
