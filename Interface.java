import java.util.*;
import java.lang.*;
import java.io.*;
 
 
interface Problem {
  public void sum(); 
  public void multiply();
}
 
class Solve implements Problem {
  public void sum() {
	int ans = 6 + 4;
	System.out.println(ans);
  }
  public void multiply() {
    int ans = 6 * 4;
    System.out.println(ans);
  }
}
 
class Accepted {
  public static void main(String[] args) {
    Solve obj = new Solve();  
    obj.sum();
    obj.multiply();
  }
}
