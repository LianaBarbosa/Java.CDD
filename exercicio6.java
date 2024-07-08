package string;

public class exercicio6 {
	public static void main(String[] args) {
		  String texto[] = {"a", "vida", "é", "bela"};
		    String texto2 = " ";
		     for (int i = texto.length-1; i >=0; i--) {
				
		    	 texto2 = texto2 + texto[i] + " ";
			}
		    System.out.println(texto2.toUpperCase());
	}

}
