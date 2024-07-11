package JavaPoo;

public class ClassePessoa {
	String Nome;
	String acao = " ";
	
	
	public void comer(){
		if(acao.isEmpty()){
		System.out.println( Nome + " " + " foi comer" );
		acao = "comendo";
	    }else if(acao.equals("dormindo")){
	    	System.out.println("não pode comer pois esta domindo");
	    }else if(acao.equals("andando")){
	    	System.out.println("Não pode comer pois esta andando");
	    }
	}
	
	public void dormir(){
		if(acao.isEmpty()){
		System.out.println(Nome + " "+ "esta Zzz...");
		acao = "dormindo";
		}else if(acao.equals("comendo")){
			System.out.println("não pode dormir pois esta comendo");
		}else if(acao.equals("andando")){
			System.out.println("não pode dormir pois esta andando");
		}
	}
	
	public void andar(){
		if(acao.isEmpty()){
		System.out.println(Nome + " "+ " esta andando");
		acao = "andando";
		}else if(acao.equals("dormindo")) {
			System.out.println("Não pode andar pois esta dormindo");
		}else if(acao.equals("comendo")){
			System.out.println("Não pode andar pois esta comendo");
	}
		
	
	}
	
	

}
