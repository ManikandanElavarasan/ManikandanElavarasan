package logicquestions;

public class C {
	public static void main(String[] args) {
		
		//vowel or constant we can use switch
		char h='e';
		if(h=='a'||h=='e'||h=='i'||h=='o'||h=='u'||h=='A' ||h=='E'||h=='I'||h=='O'||h=='U')
		{
			System.out.println("The given character"+h+"is Vowel");
		}
		else
		{
			System.out.println("The given character"+h+"is Consonant");
		}
		System.out.println("__________________________________________");
		
				
		//escaping character in java
		 //     /"Hello"/
		 //    /'Hello'/ -->"'/Hello'/"
		//        "Hello"
		//     I "Love" java programming and "Movies"
		//      'I "Love" java programming and "Movies"'
		System.out.println("\"HEllo\" ");
		System.out.println("\"/'Hello'/\"");
		System.out.println("I  \"love\" java Programming");
		
		
		
		
		
	}
}




