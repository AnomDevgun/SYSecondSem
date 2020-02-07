#include<stdio.h>
#include <sys/types.h>
#include <unistd.h>
#include<stdlib.h>
#include<sys/wait.h>

int main()
{
	int i,st;
	char n1[5],n2[5],n3[5],n4[5],n5[5];				//CAN INPUT MULTIDIGIT NUMBER
	printf("\nEnter Five Numbers Please\n");
	scanf("%s",n1);
	scanf("%s",n2);
	scanf("%s",n3);
	scanf("%s",n4);
	scanf("%s",n5);
	st=fork();					//Fork to Create a New Process
	if(st == 0)
	{
		printf("\nWe are In the Child Process Through Fork\n");		//IN fork
		printf("\nThe PID is %u ",getpid());						//PID OF CHILD PROCESS
		printf("\nThe Parent Process ID is %u \n\n",getppid());		//Parent ProcessID
		system("gcc descensort.c -o descen");
		char *decen[] = {"./descen",n1,n2,n3,n4,n5,NULL};
		execv(decen[0],decen);
	}
	else
	{
		//sleep(500);
		wait(NULL);
		printf("We are in Parent Process after Fork\n");		//Parent Process
		printf("\nThe Process Pid is: %u ",getpid());			//Parent Process ID
		printf("\nThe Parent Process PID is: %u ",getppid());		//PPID
		system("gcc ascensort.c -o ascen");								//Compile File
		char *args[] = {"./ascen",n1,n2,n3,n4,n5,NULL};
		execv(args[0],args);
	}
	return 0;
}


















