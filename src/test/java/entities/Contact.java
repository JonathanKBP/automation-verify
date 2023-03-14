package entities;

public class Contact {
    private String nome;
    private String email;
    private String telefone;
    private String desafio;
    
	public Contact(String nome, String email, String telefone, String desafio) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.desafio = desafio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getDesafio() {
		return desafio;
	}

	public void setDesafio(String desafio) {
		this.desafio = desafio;
	}

	
}
