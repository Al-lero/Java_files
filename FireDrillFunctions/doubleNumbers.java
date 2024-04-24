
 public static int[] doubleNumber(int[] numbers){
	int temp = 0;
        int[] doubledNumbers = new int[numbers.length*2];
        for(int i = 0; i < numbers.length; i++){
            int number = numbers[i];
            doubledNumbers[i] = number;
            int doubledSum = number * 2;
            doubledNumbers[numbers.length +i] = doubledSum;
        }
	
        for(int i = 0; i < doubledNumbers.length - 1; i++){
     
            if(doubledNumbers[i] > doubledNumbers[i+1]){
                temp = doubledNumbers[i];
                doubledNumbers[i] = doubledNumbers[i+1];
                doubledNumbers[i+1] = temp;
            }
        }
    
        return doubledNumbers;
    }

   
    
