package lab9;

import java.util.HashMap;
import java.util.Scanner;

public class Excercise2 {
public void getValues(String str) {
	HashMap<Character,Integer>hm=new HashMap();
	char ch[]=str.toCharArray();
	for(char c:ch) {
		if(hm.containsKey(c)) {
			hm.put(c,hm.get(c)+1);
			}
		else
		{
			hm.put(c, 1);
		}
	}
System.out.println(hm);
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str=sc.nextLine();
	Excercise2 ee=new Excercise2();
	ee.getValues(str);
}
}