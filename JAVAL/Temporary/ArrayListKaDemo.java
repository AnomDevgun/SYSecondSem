import java.util.*;

class ArrayLists
{
	public ArrayList<String> list=new ArrayList<String>();
	public ArrayLists()
	{
		System.out.println("____________________________ArrayList!___________________________");
	}

}

public class ArrayListKaDemo
{
	public static void main(String args[])
	{
		int element;
		Scanner sc=new Scanner(System.in);
		ArrayLists a=new ArrayLists();
		System.out.println("\n1.Add Element:\n2.Remove element:\n3.Modify element\n4.Search element");
		System.out.println("\nEnter your choice: \t");
		int choice=sc.nextInt();
		switch(choice)
		{

			case 1: System.out.println("\nEnter the element to be added: \t");
			element=sc.next();
			a.addElement(element);
			break;

			case 2: System.out.println("\nEnter the element to be removed: \t");
			element=sc.next();
			a.removeElement(element);
			break;

			case 3: System.out.println("\nEnter the element to be modified: \t");
			element=sc.next();
			System.out.println("\nEnter new element: \t");
			int new_element =sc.next();
			a.modifyElement(element, new_element);
			
			case 4: System.out.println("\nEnter the element to be searched: \t");
			element=sc.next();
			a.searchElement(element);
			break;

			default: System.out.println("\nWrong Choice!!\n");
			}
			}
			}			
			




















