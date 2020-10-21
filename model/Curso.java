package model;

public class Curso {
	private String id;
	private String nome;
	private String area;
	private int semestres;
	private String periodo;
	
	public Curso(String id, String nome, String area, int semestres, String periodo) {
		this.id = id;
		this.nome = nome;
		this.area = area;
		this.semestres = semestres;
		this.periodo = periodo;
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getArea() {
		return area;
	}
	public int getSemestres() {
		return semestres;
	}
	public String getPeriodo() {
		return periodo;
	}
}
