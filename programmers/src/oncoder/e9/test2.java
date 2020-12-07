package oncoder.e9;

public class test2 {
	public int solution(int[] arr, int num){
		int answer=0;
	    for (int i=0; i<arr.length; i++){
	    	//각 날의 들어온 수량 만큼 for문 돌림
	    	if(arr[i] == 0 ) continue;
	    	//배열이 0일땐 스킵
	        if(arr[i] <= num){
	        //해당 날에 들어온 수량이 처리할 수 있는 양보다 적을 경우 day에 +1
	        	answer += 1;
	        }else{
	        //수량이 처리 할 수 있는 양보다 많을경우는 두 가지 케이스로 나눠서 계산	
	        	int diff = arr[i]-num;
	        	//차이
	            if((i+1) < arr.length){
	            	arr[i+1] += diff;
	                answer+=1;
	                //남은 배열이 있을 경우 뒤의 배열에 남은 수량을 더해주고 day에도 +1
	            }
	            if((i+1) == arr.length){
	            	answer += arr[i]/num;
	            	//마지막배열에는 데이터가 축적되서 넘어올 수 있으므로 (남은 수량/처리할 수 있는 양)을 day에 더해줌
	                if(arr[i]%num > 0){
	                	answer += 1;
	                	//나머지가 있는경우 day에 +1을 해줌
	                } 
	            }
	        }  
	     } 
	     return answer;
	}

}
