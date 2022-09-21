package com.epicode.GestioneIncendi;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CentroControlloTest extends CentroControlloProxy {

	@Override
	public void rilevaIncendio(InfoSonda info) {
		assertNotNull(info);
		assertNotNull(info.getIdSonda());
		assertNotNull(info.getLatitude());
		assertNotNull(info.getLongitude());
		assertNotNull(info.getSmokeLevel());
		assertNotEquals(0L, info.getSmokeLevel());
		throw new RuntimeException("Incendio Rilevato");
	}

}
