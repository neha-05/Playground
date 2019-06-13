#include<stdio.h>
int sq(int num);// Function declaration
int main() {
   int n;
   scanf("%d", &n);
   printf("%d", sq(n)); // Function call
  	return 0;
}
int sq(int num)
{// Function definition
    int sq;
    sq = num*num;
    
    return sq;
}