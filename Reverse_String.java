package java_methods;

public class Reverse_String {
	public static void main(String args[]) {
		
		// Q. To convert "Geekster program runnning"  to "retskeerG margorp gninnur" (reverse)
		
		//  Method 1: Using String Builder.reverse()
		System.out.println("\n\tMETHOD #1");
		String str1="java program running";
		String[] l= str1.split(" ");
		for(int p=0;p<l.length;p++) {
			String re=l[p]+" ";
			StringBuilder sBuilder=new StringBuilder(re);
			System.out.print(sBuilder.reverse());
		}
		
		
		// Method 2:-
		System.out.println("\n\tMETHOD #2");
		String str="Geekster Program running";
		String[] k= str.split(" ");
		String empty="";                     // empty string to load new value into it
		
		for(int i=0;i<k.length;i++) {
			
			String rev=k[i]+" ";
			
			for(int j=rev.length()-1;j>=0;j--) {
				
				String r=empty+rev.charAt(j);
				System.out.print(r);
				
			}
		}
		
		
		
		
		
		
	}

}
