package org.dominio;


public class BDCanciones {
	Cancion StillCounting = new Cancion("Still Counting", 1, 3.99, "4:21", "Volbeat", "Guitar Gansters & Cadillac Blood", 2008);
	Cancion Pain = new Cancion("Pain", 2, 4.50, "3:22", "Three Days Grace", "One-X", 2006);
	
	Cancion canciones[] = {StillCounting, Pain};
	
	public int numCanciones() {
		return canciones.length();
	}
}
