package br.controle.equipamento.dio.dominio;

public class Maquineta extends Equipamento {
	
	private String pos;
	private String tombo;
	private String chip;
	
	
	public Maquineta(String pos,String tombo, String chip) {
		
		this.pos = pos;
		this.tombo = tombo;
		this.chip = chip;
		
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getTombo() {
		return tombo;
	}
	public void setTombo(String tombo) {
		this.tombo = tombo;
	}
	public String getChip() {
		return chip;
	}
	public void setChip(String chip) {
		this.chip = chip;
	}
	@Override
	public String toString() {
		return "Maquineta [pos=" + pos + ", tombo=" + tombo + ", chip=" + chip + "]";
	}
	@Override
	public double calcularPeriodo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
