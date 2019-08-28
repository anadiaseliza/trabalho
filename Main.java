package rp;

public class Main {

	public static void main(String[] args) 
	{
		Local local1 = new Local("Terra", 100, 100);
		Pessoa localizacao1 = new Pessoa(150,-10);
		
		
		System.out.println("A pessoa esta localizada no  " + local1.getNomeLocal() + " é: X-" + localizacao1.getLocalX() + " Y-" + localizacao1.getLocalY());
		
	}

}