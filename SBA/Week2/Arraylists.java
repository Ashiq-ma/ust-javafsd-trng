package Sba;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylists {
public static void main(String args[]) {
	List lst=new ArrayList();
	for(int i=0;i<20;i++) {
	lst.add(i);
	}

	Iterator itr=lst.iterator(); 
		while(itr.hasNext()) {
			System.out.println(itr.next());
	}
	
	
}
}
