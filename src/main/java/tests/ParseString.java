package tests;

public class ParseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "$5.34";
		Double db = Double.parseDouble(str.substring(1, 5));
		
		System.out.println(db);
	}

}
