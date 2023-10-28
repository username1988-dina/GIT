package udemy;

import java.util.Scanner;

public class Hello1 {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Please type your thoughts!!");
 String thoughts;
 thoughts=sc.nextLine();
 System.out.println(thoughts);
 sc.close();
	}

}
