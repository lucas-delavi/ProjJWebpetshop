package br.edu.qi.Classes;

public class Servico {
	private int idservico;
	private String nome;
	private float preco;
	private String dia;
	private String horario;
	
	
	public int getIdservico() {
		return idservico;
	}
	
	public void setIdservico(int idservico) {
		this.idservico = idservico;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public String getDia() {
		return dia;
	}
	
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	@Override
	public String toString() {
		return "Serviço: " + nome + "\n"
				+ "Valor: " + preco + "\n"
				+ "Data: " + dia + "\n"
				+ "Horário: "+ horario;
	}
}
