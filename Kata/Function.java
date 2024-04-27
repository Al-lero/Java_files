public class Function{


public static int [] evenIndex(int [] scores){
			
			for ( int counter = 0; counter < scores.length; counter++){
				if(counter % 2 == 0){
				
				System.out.print(scores[counter] + " ");
				
				}
				
				}

	
			return scores;
	
			}



		public static int [] oddIndex(int [] scores){
			
			for(int counter = 0; counter < scores.length; counter++){
				if (counter % 2 == 1){
			
				System.out.print(scores[counter] + " ");

					}
					}
			return scores;
			

		}
			
			

		public static int [] sumIndex(int [] scores){
				

			for(int counter = 0; counter < scores.length; counter++){
				if (counter % 2 == 1){
				int sum += scores[counter];	

			

		}

		//System.out.println("The sum is : " + sum);
		
		}

			return scores;
		

			
	}

}