package com.epicode.GestioneIncendi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComunicazioneHttp extends CanaleComunicazione {
	private static final Logger logger = LoggerFactory.getLogger(ComunicazioneHttp.class);
	private String baseurlnotifica;

	
	
	public ComunicazioneHttp(String baseurlnotifica) {
		this.baseurlnotifica = baseurlnotifica;
	}



	public void sendGet(Long idSonda, double latitude, double longitude, int smokeLevel  ) {
		logger.info("Allarme sonda: {} - lat: {} lon: {} - Livello fumo: {}", idSonda, latitude, longitude, smokeLevel);
	
		String url = baseurlnotifica + "?=idsonda=" + idSonda + "&lat=" + latitude + "&lon=" + longitude + "&smokelevel=" +smokeLevel;
		logger.info("Call: {}", url);
	}

}
