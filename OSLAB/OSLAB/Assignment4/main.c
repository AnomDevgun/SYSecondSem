#include<stdio.h>
#include<stdlib.h>
struct node{
	int pid;		//Process ID
	int at;			//Arrival Time
	int bt;			//Burst Time
	struct node *next;			
}*head = NULL,*next=NULL;
void fcfs(){
	int r; 
	struct node *tem = malloc(sizeof(struct node));
	tem = head;
	if(tem == NULL)
		printf("No Processes\n");
	else{
		while(tem->next != NULL){
			if(tem->at > (tem->next)->at){
				r = tem->pid;
				tem->pid = (tem->next)->pid;
				(tem->next)->pid = r;
				r = tem->at;
				tem->at = (tem->next)->at;
				(tem->next)->at = r;
				r = tem->bt;
				tem->bt = (tem->next)->bt;
				(tem->next)->bt = r;
				tem = tem->next; 	
			}
			else{
			tem = tem->next;
			}
		}
	tem = head;
	while(tem!=NULL){
		printf("%d->",tem->pid);
		tem = tem->next;
	}
	}	
}


int main()
{
unsigned int n,i,ch;
printf("How Many Processess do you want to Schedule?\n");
scanf("%u",&n);
for(i=0;i<n;i++){
	struct node *nn = malloc(sizeof(struct node));
	struct node *temp = malloc(sizeof(struct node));
	if(head == NULL)
		{
			printf("Enter the process id: \n");
			scanf("%d",&nn->pid);
			printf("Enter the arrival time: \n");
			scanf("%d",&nn->at);
			printf("Enter the burst time: \n");
			scanf("%d",&nn->bt);
			head = nn;
		}
	else{
		temp = head;
		while(temp->next != NULL){
			temp = temp->next;			
		}
			printf("Enter the process id: \n");
			scanf("%d",&nn->pid);
			printf("Enter the arrival time: \n");
			scanf("%d",&nn->at);
			printf("Enter the burst time: \n");
			scanf("%d",&nn->bt);
			temp->next = nn;
	}		
	}
	printf("Process   Arrival time   Burst time\n"); 
    struct node *t = malloc(sizeof(struct node));
    t = head;
    for (int  i=0; i<n; i++)  
    {  
    while(t != NULL){
        printf("   %d ",t->pid); 
        printf("       %d ",t->at); 
        printf("       		%d",t->bt);
        printf("\n");
        t=t->next; 
    }  
    }
while(1){
	printf("1)For FCFS\n");
	printf("2)For SJF\n");
	printf("3)For Round Robbin\n");
	scanf("%u",&ch);
	switch(ch){
		case 1: printf("You Have Picked FCFS\n");
				fcfs();
		case 2: printf("You Have Picked SJF\n");
				//sjf();
				break;
		case 3: printf("You have Picked Round Robbin\n");
				//rr();
				break;
		case 4: printf("Goodbye!\n");
				break;
		default: printf("Incorrect Choice.\n");							
}
}
return 0;
}
