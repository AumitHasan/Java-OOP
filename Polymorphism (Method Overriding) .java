import java.util.*;
import java.lang.*;
import java.io.*;


class Aumit{
	
	int sum(int a, int b){
		return a + b + 10;
	}
}

class Hasan extends Aumit{
	
	int sum(int a, int b){
		return a + b;
	}
	
	public static void main(String[] args) {
		
    Hasan obj = new Hasan();
		System.out.println(obj.sum(5, 7));
	}
}
