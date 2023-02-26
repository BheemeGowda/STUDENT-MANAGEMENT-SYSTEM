package customexception;

class Task{
	  public void check() {
		for(int i=0;i<=4;i++) {
			System.out.println(i);
		}
	}
	synchronized public void check1() {
		for(int i=4;i>=0;i--) {
			System.out.println(i);
		}
	}
}
class Thread1 extends Thread{
	Task t1;
	public Thread1(Task t1) {
		this.t1=t1;
	}
	@Override
	public void run() {
		t1.check();
	}
}
class Thread2 extends Thread{
	Task t1;
	public Thread2(Task t1) {
		this.t1=t1;
	}
	@Override
	public void run() {
		t1.check1();
	}
}
public class ThreadExample{
	public static void main(String[] args) {
		Task task=new Task();
		Thread1 t=new Thread1(task);
		t.start();
		Thread2 t2=new Thread2(task);
		t2.start();
	}
}
