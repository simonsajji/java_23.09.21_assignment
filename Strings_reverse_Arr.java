package strings_classes;

public class Strings_reverse_Arr {
	
	public static void main(String args[]) {
		
		String h="Geekster is my class room";
		String[] str=h.split(" ");
		
		for(int i=(str.length-1);i>=0;i--) {
			System.out.print(str[i]+" ");
		}
		
	}

}
