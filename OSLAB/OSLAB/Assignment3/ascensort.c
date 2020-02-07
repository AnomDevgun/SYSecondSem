#include<stdio.h>
#include <sys/types.h> 
#include <unistd.h>
#include<stdlib.h>  
#include<sys/wait.h>
int main(int args, char *argv[])
{
  	int  n=5, c, d, swap;
  	int i[5];
	for(int j=1;j<6;j++)
		sscanf(argv[j], "%d", &i[j-1]); 	//READ FORMATTED STRING INPUT TO INT
  	for (c = 0 ; c < n - 1; c++)
  	{
  		for (d = 0 ; d < n - c - 1; d++)		//SORT
  		{
      			if (i[d] > i[d+1])
      			{
        			swap= i[d];
        			i[d]= i[d+1];
       			 	i[d+1]=swap;
      			}
    		}
  	}

  	printf("Sorted list in ascending order:\n");
		
	for (c = 0; c < n; c++)					//PRINT
     		printf("%d\t", i[c]);
	printf("\n\n");

  	return 0;
}
