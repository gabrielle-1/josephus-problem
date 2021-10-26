package com.diegopinheiro.projectchallenge_01;

public class JosephusProblem {

	public static int[] solve(int m, int n) {
		
		int[] vectorAlives = new int[n];
		int[] vectorDeaths = new int[n];
		
		//Declarando o index/contador das pessoas vivas como 1 pois deve ser um valor acima do contador do looping abaixo:0
		int indexAlives=1;
		int indexDeaths=0;
			
		for(int i=0; i<n; i++) {
			vectorAlives[i] = i;
			vectorDeaths[i] = -1;
		}		
			
			
		while(vectorDeaths[n-1] == -1){						
			int i=0;
			while(i<n){
				if(vectorAlives[i] != -1)  {
					if(indexAlives == m) {						
						vectorDeaths[indexDeaths] = vectorAlives[i];
						indexDeaths++;
						vectorAlives[i] = -1;
						indexAlives=1;
					}else {
						indexAlives++;
					}	
				}					
				i++;
			}
				
		}
		
		return vectorDeaths;
	}
}
