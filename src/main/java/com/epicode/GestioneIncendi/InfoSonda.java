package com.epicode.GestioneIncendi;

public class InfoSonda {
	private final Long idSonda;
	private final double latitude;
	private final double longitude;
	private final int smokeLevel;

	public InfoSonda(Long idSonda, double latitude, double longitude, int smokeLevel) {
		this.idSonda = idSonda;
		this.latitude = latitude;
		this.longitude = longitude;
		this.smokeLevel = smokeLevel;
	}

	public Long getIdSonda() {
		return idSonda;
	}

	public double getLatitude() {
		return latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public int getSmokeLevel() {
		return smokeLevel;
	}

}
