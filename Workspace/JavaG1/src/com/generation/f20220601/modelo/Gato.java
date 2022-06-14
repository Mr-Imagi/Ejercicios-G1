package com.generation.f20220601.modelo;

public class Gato extends Mascota{
	//extends es para hacer uso de herencia
	private Boolean garrasRetractil;
	private Boolean visionNocturna;
	private String sonidoVocal;
	public Boolean getGarrasRetractil() {
		return garrasRetractil;
	}
	public void setGarrasRetractil(Boolean garrasRetractil) {
		this.garrasRetractil = garrasRetractil;
	}
	public Boolean getVisionNocturna() {
		return visionNocturna;
	}
	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}
	public String getSonidoVocal() {
		return sonidoVocal;
	}
	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}
	@Override
	public String toString() {
		return "Gato [garrasRetractil=" + garrasRetractil + ", visionNocturna=" + visionNocturna + ", sonidoVocal="
				+ sonidoVocal + " "+ super.toString();
		
	
	}
	public void hacerSonido() {
		System.out.println("Miau Miau");
	}
	
	
}
