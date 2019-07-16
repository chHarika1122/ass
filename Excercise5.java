package lab13;

interface Factorial1{
	int factt(int x);
}

public class Excercise5 {
public int factorials(int n) {
	int f=1;
	while(n>0) {
		f=f*n;
		n--;
	}return f;
}
public static void main(String[] args) {
	Excercise5 cfac=new Excercise5();
	Factorial1 fact1=cfac::factorials;
    System.out.println(fact1.factt(10));	
}
}
