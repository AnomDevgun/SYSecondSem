import java.util.*;

class Pque{
public static void main(String args[]){
PriorityQueue<String> pq = new PriorityQueue<String>();
Scanner s = new Scanner(System.in);
String a;
int num;
System.out.println("How many Strings do ya want homie?\n");
num = s.nextInt();
s.nextLine();
for(int i=0;i<num;i++){
a = s.nextLine();
pq.add(a);
}
System.out.println(pq);
}
}
