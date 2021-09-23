package classes_demo;

// 1.Create a class student(define your own member variables) create setters and getters and try to create 5 students and print their details in main class

public class Student {

	private int sid;
	private String sname;
	private int sage;
	private String stream;
	
	public void set(int sid,String sname,int sage,String stream) {
		this.sid=sid;
		this.sname=sname;
		this.sage=sage;
		this.stream=stream;
	}
	
	public int getid() {
		System.out.print("ID: ");
		return this.sid;
	}
	
	public String getname() {
		System.out.print("Name: ");
		return this.sname;
	}
	
	public int getage() {
		System.out.print("Age: ");
		return this.sage;
	}
	
	public String getstream() {
		System.out.print("Stream: ");
		return this.stream;
	}
	

	
	


}
