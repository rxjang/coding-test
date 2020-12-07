package oncoder.e9;

public class test1 {
	  public String solution(String[] library, String message){
		  String[] answerArr = message.split(" ");
		  //message를 띄어쓰기를 기준으로 끊음
	      String answer="";
	        
	      for (int i = 0; i<answerArr.length; i++){
	    	  //message의 한 문자만큼 for문을 돌림
	    	  boolean check = false;
	    	  //check는 암호가 library에 있는지 검증하기 위해 사용
	    	  
	          for(int j=0 ; j<library.length ;j++){
	        	  //각 message가 라이브러리와 일치하는 문자가 있는지 확인
	        	  String secretKey = library[j].substring(library[j].indexOf(" ")+1);
	        	  //코드를 라이브러리에서 찾음
	              if(secretKey.equals(answerArr[i])){
	            	  answer += library[j].substring(0,library[j].indexOf(" "));
	                  check = true;
	                  //코드와 라이브러리를 비교하여 일치하면 정답 String에 추가하고 check를 true로 변경
	              }
	          }
	          if(!check){
	        	  answer += "?";
	        	  //check가 false이면 library에 해당 코드가 없는 것이므로 ?처리
	          }
	      } 
	      return answer;
	  }
}
