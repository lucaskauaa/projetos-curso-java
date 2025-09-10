
public class Main {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ abc ABC DEFG   ";
		
		System.out.println("Original: " + original);
		System.out.println("toUpperCase: " + original.toUpperCase());
		System.out.println("toLowerCase: " + original.toLowerCase());
		System.out.println("trim(): " + original.trim());
		System.out.println("subString: " + original.substring(2));
		System.out.println("subString: " + original.substring(2, 9));
		System.out.println("replace: " + original.replace('a', 'x'));
		System.out.println("indexOf: " + original.indexOf("abc"));
		System.out.println("lastIndexOf: " + original.lastIndexOf("abc"));
		
		String s = "potato apple lemon";
		String[] texto = s.split(" ");
		
		System.out.println("Split: " + texto[0]);
		System.out.println("Split: " + texto[1]);
		System.out.println("Split: " + texto[2]);
		
		
	}
}