package test;

public class t4 {
	public static void openBrowser() {
		String s="Devyanii";
		String s2="";
		for (int i = s.length()-1; i>=0; i--) {
			s2 = s2+s.charAt(i);
			
			
		}
		System.out.println(s2);
	
		
		

	}
	public static void main(String[] args) {
		openBrowser();
	}

}
