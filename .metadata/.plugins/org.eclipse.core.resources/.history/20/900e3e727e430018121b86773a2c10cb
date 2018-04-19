package mlcs_classical_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class main_pro {

	static char[] alphabet = { 'A', 'C', 'G', 'T' };

	// Construct successor table
	static int[][] construct_ST(String str) { 
		int len = str.length();
		int[][] ST = new int[4][len + 1]; // from the first line :A C G T
		char str_alpha = 0;
		for (int i = 0; i < 4; ++i) {
			for (int j = 0; j <= len; ++j) { // fill the table
				for (int k = j; k < len; ++k) {
					str_alpha = str.charAt(k);
					if (alphabet[i] == str_alpha) {
						ST[i][j] = k + 1;
						break;
					}
				}
				if (alphabet[i] != str_alpha) {
					ST[i][j] = 999999; // NAN
				}
			}
		}
		return ST;
	}

	static List<int[][]> construct_ST_list(int d, List<String> S) { // construct
																	// a list
																	// for ST
		List<int[][]> STL = new LinkedList<int[][]>();
		for (int i = 0; i < d; ++i) {
			String str = S.get(i);
			int[][] ST = construct_ST(str);
			STL.add(ST);
		}
		return STL;
	}
	
	static int min_length (List<String> S){ //find the minimum of length, return n
		int min_len;
		Iterator<String> itS = S.iterator();
		min_len = itS.next().length();
		while (itS.hasNext()) {
			int new_len =itS.next().length();
			if (new_len<min_len){
				min_len =new_len;
			}
		}
		return min_len;
	}

	public static void main(String[] args) {
		
		//get d
		System.out.println("字符串数量："); 
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();

		// get S1。。Sd
		List<String> S = new ArrayList<String>();
		for (int i = 0; i < d; ++i) { 
			String str = sc.nextLine();
			S.add(str);
		}
		
		//get minimum length of S
		int n = min_length (S);
		
		//judge with StepLength
		// construct successor table
		List<int[][]> STL = new LinkedList<int[][]>(); 
		STL = construct_ST_list(d, S);
		
		//get StepLength
		System.out.println("步长：");
		int StepLength = sc.nextInt();
		
		//judge between n and StepLength
		if (StepLength>n){
			dominant source_point= new dominant(STL, d, alphabet);
			source_point.source(d);
			
			//optcalreuse1,time=1
			//NCSG Graph = new NCSG(source_point,StepLength,STL,alphabet,d,1);
			result fin_re;
			fin_re = 
			
			//output MLCS
			
			//wind up
		}
		
		//split
		int N = n/StepLength + 1;
		
		//optcalreuse2
		NCSG sub_graph;
		for (int i=1;i<=N-1;++i){
			
		}
		
		
		//wind up
		sc.close();
	}
}
