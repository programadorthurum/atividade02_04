package atividade02_04;

public class Ferramenta extends ItemDeLoja {

	private String categoria;
	private Integer serial;

	/**
	 * Construtor padrão
	 * 
	 * @param codigoDoItem
	 * @param nomeDoItem
	 * @param descricaoDoItem
	 * @param valorDoItem
	 */
	public Ferramenta(int codigoDoItem, String nomeDoItem, String descricaoDoItem, double valorDoItem) {

	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria() {
		this.categoria = categoria;
	}

	public Integer getSetial() {
		return serial;
	}

	public void setSetial(Integer serial) {
		this.serial = serial;
	}

	public int getIdentificador() {
		return serial;
	}

	public void separar() {

	}

	public void separar(String categoria) {
		this.categoria = categoria;
	}
}