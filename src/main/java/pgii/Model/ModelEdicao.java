public class Edicao {
    
    private int id;
	private int ano;
    private String novo_conteudo;
	private Livro livro;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getNovoConteudo() {
		return novo_conteudo;
	}
	public void setNovoConteudo(String novo_conteudo) {
		this.novo_conteudo = novo_conteudo;
	}

	public int getLivro() {
		return livro;
	}
	public void setLivro(int livro) {
		this.livro = livro;
	}
}
