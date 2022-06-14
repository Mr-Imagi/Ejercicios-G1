package com.generation.f20220601.modelo;

public class Michi extends Gato{
	private Boolean famosoEnInternet;

	public Michi(Boolean famosoEnInternet) {
		super();
		this.famosoEnInternet = famosoEnInternet;
	}

	public Michi() {
		super();
	}

	public Boolean getFamosoEnInternet() {
		return famosoEnInternet;
	}

	public void setFamosoEnInternet(Boolean famosoEnInternet) {
		this.famosoEnInternet = famosoEnInternet;
	}

	@Override
	public String toString() {
		return "Michi [famosoEnInternet=" + famosoEnInternet + "]";
	}

}
