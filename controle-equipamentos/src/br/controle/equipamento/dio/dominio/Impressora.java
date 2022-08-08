package br.controle.equipamento.dio.dominio;

public class Impressora extends Equipamento {
	
	private String serial;
	private String cor;
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Impressora [serial=" + serial + ", cor=" + cor + "]";
	}
	@Override
	public double calcularPeriodo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
