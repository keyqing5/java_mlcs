package mlcs_classical_ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class dominant {
	public static int indexofpoint = 0; // index(progressively increase)
	public int level; // level information
	public int ID; // in-degree
	public char character;
	public List<Integer> coordinate = new ArrayList<Integer>(); // coordinate
	// Iterator<Integer> itd =coordinate.iterator();
	public Set<dominant> successor = new HashSet<dominant>(); // successor
	// Iterator<dominant> its = successor.iterator();
	public Set<dominant> precursor = new HashSet<dominant>(); // precursor
	// Iterator<dominant> itp = precursor.iterator();

	public dominant(List<int[][]> STL, int d, char[] alphabet) { // construct a completely new dominant ,d means the
								// dimension
		ID = 1;
		level = 0;
		++indexofpoint;
		//dominant_successor(STL,d,alphabet);
	}

	public void source(int d) { // add a dummy source point
		ID = 0;
		level = 0;
		for (int i = 0; i < d; ++i) {
			coordinate.add(0);
		}
	}

	public void end(int d) { // add a dummy end point
		ID = 1;
		for (int i = 0; i < d; ++i) {
			coordinate.add(999999); // assume 999999 as NAN
		}
	}

	// public dominant dominant_successor(dominant p_point,List<int[][]> STL,int
	// d,char[] alphabat){ //record successor of point
	// dominant new_point = new dominant(d);
	// Iterator<Integer> itc=p_point.coordinate.iterator();
	// for (int i =0;i<d;++i){ //read successor table
	// int[][] ST;
	// int j =itc.next();
	// ST = STL.get(i);
	// new_point.coordinate.add(ST[i][j]);
	// new_point.character=alphabet[i];
	// }
	// new_point.level=p_point.level+1;
	// p_point.successor.add(new_point);
	// new_point.precursor.add(p_point);
	// return new_point;
	// }
	public void dominant_successor(List<int[][]> STL, int d, char[] alphabet) { // record
																				// successor
																				// of
																				// point

		dominant p_point = this;
		int alpha_size = alphabet.length;
		Iterator<Integer> itc = coordinate.iterator();
		for (int i = 1; i <= alpha_size; ++i) {
			dominant new_point = new dominant(STL,d,alphabet);
			for (int j = 0; j < d; ++j) { // read successor table
				int[][] ST;
				int k = itc.next();
				ST = STL.get(j);
				if (ST[j][k]<999999){
					new_point.coordinate.add(ST[j][k]);
					new_point.character = alphabet[j];
				}
				else {
					new_point.end(d); //successor is the end point
					break;
				}
			}
			new_point.level = p_point.level + 1;
			new_point.precursor.add(p_point);
			p_point.successor.add(new_point);
		}

	}
	
}
