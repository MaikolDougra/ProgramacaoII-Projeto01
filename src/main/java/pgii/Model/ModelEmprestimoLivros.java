public class EmprestimoLivros {
    
    private int id;
    private Livro livro;
    private Emprestimo emprestimo;

    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    public int getLivro() {
		return livro;
	}
	public void setLivro(int livro) {
		this.livro = livro;
	}

    public int getEmprestimo() {
		return emprestimo;
	}
	public void setEmprestimo(int emprestimo) {
		this.emprestimo = emprestimo;
	}
}
