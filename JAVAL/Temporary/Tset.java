import java.util.*;

class Tset{

public static void main(String args[]){
TreeSet<Integer> ts = new TreeSet<Integer>();
int num,a;
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of Elements: ");
num = s.nextInt();
s.nextLine();
for(int i=0;i<num;i++){
a = s.nextInt();
ts.add(a);
}
System.out.println(ts);
}
}
