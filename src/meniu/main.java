package meniu;
import java.util.Scanner;
public class main {
	public static void main(String args[])
	  {Scanner sc=new Scanner(System.in);
	  System.out.println("1. peste cu legume");
	  System.out.println("2. tiramisu");
	  System.out.println("3. clatite");
	  System.out.println("Alege ce vrei sa manaci");
	  
	  int op=sc.nextInt();
	  switch(op){
	  case 1: System.out.println("Ai ales peste cu legume");
	  break;
	  
	  case 2: System.out.println("Ai ales tiramisu");
	  break;
	  
	  case 3: System.out.println("Ai ales clatite");
	  break;
	  
	  }

}
}
	