public class TaskSix{
	public static void main(String[] args){

		for(int i = 4; i <= 10; i+=4){
		    for(int j = 1; j <= 5; j++){
                       int result = (int) Math.pow(i,j);
			System.out.print(result + " ");
			}
 
		}
	}
}