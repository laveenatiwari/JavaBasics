package codilityprogramspractice;

public class PassingCars_Array {

	
	public static void main(String[] args) {
		PassingCars_Array  ar = new PassingCars_Array();
		System.out.println(ar.solution(new int[] {0,1,0,1,1}));
	}

	public int solution(int[] A) {
	    int eastBoundCarsSeen =0;
	    int passingCars =0;
	    for(int a :A){
	        if(a==0){
	          eastBoundCarsSeen++;
	        }else{
	            passingCars = passingCars+eastBoundCarsSeen;
	            if(passingCars >1000000000) {
	            	return -1;
	            }
	        }
	    }
	        return passingCars;
	    }
	
	    }
