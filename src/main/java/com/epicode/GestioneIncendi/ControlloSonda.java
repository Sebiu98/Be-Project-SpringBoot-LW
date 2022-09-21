package com.epicode.GestioneIncendi;

public class ControlloSonda implements Observer {
	
	private final Long id;
	
	private CentroControlloInterface centroControllo;
	
	public ControlloSonda(Long id, CentroControlloInterface centroControllo) {
		this.id = id;
		this.centroControllo = centroControllo;
	}
	
	@Override
	public void update(Subject obj) {
		InfoSonda info = createInfoSonda((Sonda)obj);
		centroControllo.rilevaIncendio(info);
	}

	private InfoSonda createInfoSonda(Sonda obj) {
		return new InfoSonda(obj.getId(), obj.getLatitude(), obj.getLongitude(),obj.getSmokeLevel());
	}

	public Long getId() {
		return id;
	}


}
