//THIS IS ASSIGNMENT 1
//ANOM DEVGUN
import java.util.*;
import java.util.Set;
class hma{
	public static void main(String[] args){
	LinkedList<String> ob = new LinkedList<String>();
	HashMap<Character,LinkedList> h =new HashMap<Character,LinkedList>();
	LinkedList<String> temp;
	Scanner sc = new Scanner(System.in);
	Scanner s = new Scanner(System.in);
	String a;
	String sstring;
	char b,d;
	int ch;
	while(true){
	System.out.println("1)To add strings to the HashMap\n");
	System.out.println("2)To Display the HashMap\n");
	System.out.println("3)To Search a string in the HashMap\n");
	System.out.println("4)Exit the program\n");
	ch  = sc.nextInt();
	switch(ch){
	case 1:  
			System.out.print("\033\143");
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
				break;
	
	case 2:
		System.out.print("\033\143");
		System.out.println(h);
		break;
	case 3:
		System.out.print("\033\143");
		System.out.println("Please  enter the search string: \n");
		sstring = s.nextLine();
		d = sstring.charAt(0);
		if(h.containsKey(d)){
			//temp = new LinkedList<String>();
			temp = h.get(d);
			if(temp.contains(sstring)){
				System.out.println("The string "+sstring+" exists in the hashmap\n");
		}
			else
				System.out.println("The String is not present\n");
		}
		else{
			System.out.println("Key not found\n");
		}
		break;	
	case 4:
		System.exit(0);
		break;
	default:
		System.out.println("Goodbye\n");	
	}
	}
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
