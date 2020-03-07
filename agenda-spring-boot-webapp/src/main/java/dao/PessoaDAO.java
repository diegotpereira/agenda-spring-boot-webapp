package dao;

import java.util.List;

import model.Pessoa;



public interface PessoaDAO {
	
	public void addPessoa(Pessoa pessoa);

	public List<Pessoa> getAllPessoas();

	public void deletePessoa(Integer pessoaId);

	public Pessoa updatePessoa(Pessoa pessoa);

	public Pessoa getPessoa(int pessoaid);

}
