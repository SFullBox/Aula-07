package revisao;

public class Pessoa {
	private String nome;
	protected int idade;

public void andar() {
	
}
public int aniversario() {
	return idade;
}
public Pessoa(String nome, int idade) {
	this.nome = nome;
	this.idade = idade;
}
}