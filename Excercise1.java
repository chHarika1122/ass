package lab11;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class MusicPlayTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Music play is executing");
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			System.out.println("Music play Exception");
		} System.out.println("Music play is resumed after sleep");
	}
	
}
class CopyTask implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("copy task is executing");
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {
		System.out.println("copy task exception");
	}
	System.out.println("copy task is resumed after sleep");
	}
	
}
public class Excercise1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Thread Executor & executor srevice demo \n 1.Executor \n2.Executor service \n enter your choice: ");
		int ch=s.nextInt();
		if(ch==1) {
			Executor exc = Executors.newSingleThreadExecutor();
			exc.execute(new MusicPlayTask());
			exc.execute(new CopyTask());
			
		}
		else if(ch==2) {
			ExecutorService excs1=Executors.newSingleThreadExecutor();
			ExecutorService excs2=Executors.newFixedThreadPool(8);
			excs1.execute(new MusicPlayTask());
			excs2.execute(new CopyTask());
			excs1.shutdown();
			excs2.isShutdown();
		}
		else {
			System.out.println("Enter valid choice");
		}
	s.close();
	}

}
