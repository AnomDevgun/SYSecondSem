import java.util.*;
import java.util.Set;
class Hashma{
	public static void main(String[] args){
	LinkedList<String> ob = new LinkedList<String>();
	HashMap<Character,LinkedList> h =new HashMap<Character,LinkedList>();
	LinkedList<String> temp;
	Scanner sc = new Scanner(System.in);
	Scanner s = new Scanner(System.in);
	String a;
	char b;
	for(int i=0;i<5;i++){
	System.out.println("Enter a String: \n");
	a = s.nextLine();
	b = a.charAt(0);
	if(h.containsKey(b)){
		temp = new LinkedList<String>();
		temp = h.get(b);
		temp.add(a);
		}
	else{
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(a);
		h.put(b,ll);	
	}
	}
	System.out.println(h);
	}
	}
	
	//display content using iterator
	/*Set set = h.entrySet();
	Iterator iterator = set.iterator();
	do{
		Map.Entry mentry = (Map.Entry)iterator.next();
		System.out.print("Key is: "+mentry.getKey()+" & Name is: ");
		System.out.println(mentry.getValue());
	}
	while(iterator.hasNext());
	}
	}*/
