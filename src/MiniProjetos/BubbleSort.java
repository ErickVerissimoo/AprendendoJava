package MiniProjetos;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] vetor = new int [] {1, 6, 21, 34, 26, 12, 11};
		int auxiliar = 0;
		for (int i = 0; i<5; i++) {
			for(int j = 0; j<6; j++) {
				if(vetor[j] > vetor[j+1]) {
					auxiliar = vetor[j];
					vetor[j] = vetor[j+1];
					vetor[j+1] = auxiliar;
				}
				
			}
		}
		for(int o = 0; o<vetor.length; o++) {
			System.out.printf("\t%d", vetor[o]);
		}
	}

}
