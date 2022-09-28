public class DataTypeDemo {
	public static void main(String[] args) {
		// width = 20 !WRONG!
		// int width = 20; !RIGHT!
		/*
			byte (8 bits) (char ASCII) -> [-128,127]
			char (8 bits) (char ASCII) -> [0,255]
			short (16 bits) [-32768, 32677]
			int (32 bits) [-2^31, (-2^-31 -1)]
			long (64 bits) [-2^63, (2^63 -1)]
		
			float (32 bits)
			double (64 bits)
			
			char (8 bits) (char ASCII) -> [0, 255]
			string (array of char) -> char[]
		*/
		
		// typeName variableName = value;
		int width = 20;
		int height = 30;
		
		int area = width * height;
		
		width = (int)20.5;
		
		
		System.out.println("Area: " + area);
		
		char a = 'a';
		System.out.println(a);
		
		String b = "bat";
		System.out.println(b);
		
		char first = b.charAt(0);
		System.out.println(first);
		
		char second = b.charAt(1);
		System.out.println(second);
		
		char third = b.charAt(2);
		System.out.println(third);
		
		int batLength = b.length();
		System.out.println("Length of bat: " + batLength);
		
		String cat = "cat";
		String dog = "dog";
		
		boolean isSame = cat.equals(dog);
		System.out.println("Are cat and dog same? : " + isSame);
		
		dog = "cat";
		isSame = cat.equals(dpg);
		System.out.println("Are cat and dog same? : " + isSame);
		
		
		
	}
}