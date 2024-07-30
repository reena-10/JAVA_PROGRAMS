package set_Interface;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	public static void main(String[] args) {
    //Creating Hashset and adding element
	HashSet<String> set = new HashSet<String>();
	set.add("Akhilesh");
	set.add("Mithlesh");
	set.add("Mukesh");
	set.add("Kamlesh");
	System.out.println("Elements of HashSet: \n");
	//Traversing set Through Iterator
	Iterator itr = set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
