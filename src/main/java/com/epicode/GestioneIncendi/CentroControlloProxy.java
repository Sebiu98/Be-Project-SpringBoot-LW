package com.epicode.GestioneIncendi;

public class CentroControlloProxy implements CentroControlloInterface {
	
	private CentroControlloInterface concreteCentroControllo;
	
	
	public CentroControlloProxy() {
		concreteCentroControllo = CentroControlloFactory.createCentroControllo();
	}
	

	@Override
	public void rilevaIncendio(InfoSonda info) {
		concreteCentroControllo.rilevaIncendio(info);
	}

}
