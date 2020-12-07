package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class CraneGame {
//https://programmers.co.kr/learn/courses/30/lessons/64061
	
	public static void main(String[] args) {
		int[][] board= {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves= {1,5,3,5,1,2,1,4};
		System.out.println(solution(board,moves));
	}
	
	public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list=new ArrayList<Integer>();
        
        for(int i=0;i<moves.length;i++){
            for(int j=0;j<board[0].length;j++){
            	if(board[j][i]!=0){
            		list.add(board[j][i]);
	            }
	        }
	    }
	        
        return answer;
	}

}
