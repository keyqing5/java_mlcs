package mlcs_classical_ex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class result {//hold the things passed between NCSG and main_pro
	public int maxLevel;
	public int minLevel;
	public LinkedList<NCSG> Graph = new LinkedList<NCSG>();
	public Set<dominant> DW = new HashSet<dominant>();
}

