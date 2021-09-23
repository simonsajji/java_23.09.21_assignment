package classes_demo;

public class Application_data {
	
	public static void main(String[] args) {
		
		// Creating an object of Student
		Student simon=new Student();

		simon.set(15,"SIMON",24,"CS");
		System.out.println("The details of student1: ");
		System.out.println(simon.getname());
		System.out.println(simon.getid());
		System.out.println(simon.getage());
		System.out.println(simon.getstream());
		
		Student shan=new Student();

		shan.set(16,"SHAN",25,"CS");
		System.out.println("\nThe details of student2: ");
		System.out.println(shan.getname());
		System.out.println(shan.getid());
		System.out.println(shan.getage());
		System.out.println(shan.getstream());
		
		Student aleena=new Student();

		aleena.set(14,"ALEENA",24,"BCOM");
		System.out.println("\nThe details of student3: ");
		System.out.println(aleena.getname());
		System.out.println(aleena.getid());
		System.out.println(aleena.getage());
		System.out.println(aleena.getstream());
		
		Student bibin=new Student();

		bibin.set(20,"BIBIN",45,"BCOM");
		System.out.println("\nThe details of student4: ");
		System.out.println(bibin.getname());
		System.out.println(bibin.getid());
		System.out.println(bibin.getage());
		System.out.println(bibin.getstream());
		
		Student anisha=new Student();

		anisha.set(18,"ANISHA AJITH",23,"BCOM");
		System.out.println("\nThe details of student5: ");
		System.out.println(anisha.getname());
		System.out.println(anisha.getid());
		System.out.println(anisha.getage());
		System.out.println(anisha.getstream());
		
		
		
		
		
	}

}
