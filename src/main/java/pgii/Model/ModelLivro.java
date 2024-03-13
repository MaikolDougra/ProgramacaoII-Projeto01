public class Livro{
    private int id;
    private String nomeLivro;
    private String descricao;
    private int anoPubli;
    private Autor autor;
    private Editora editora;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeLivro() {
		return nomeLivro;
	}
	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getAnoPubli() {
		return anoPubli;
	}
	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}
}
