package principal;


import entidade.Cachorro;
import entidade.Gato;
import entidade.Vaca;

public class Main {

	public static void main(String[] args) {
		 
	    Cachorro x = new Cachorro();
				
		
	    System.out.println("Cachorro é");
		System.out.println(x.EmitirSom()+"\n");
		
		Gato y = new Gato();
		System.out.println("Gato é");
		System.out.println(y.EmitirSom()+"\n");
		
		
		Vaca w = new Vaca();
		System.out.println("A vaca faz");
		System.out.println(w.EmitirSom());
		
		
		

	}

}
