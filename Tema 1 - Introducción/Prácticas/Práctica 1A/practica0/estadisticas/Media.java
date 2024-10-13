package practica0.estadisticas;

import practica0.estadisticas.Media;

public class Media {

	public float calcularMedia(int[] numeros) {
		float media = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			media += numeros[i];
		}
		
		media /= numeros.length;
		
		return media;
	}

}
