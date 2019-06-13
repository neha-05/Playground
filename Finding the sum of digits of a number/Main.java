#include <stdio.h> 
int main() 
{
  int n,n1; 
  int count=1,sum=0;
  scanf("%d",&n);
  while(count<=n)
  {
    n1=n%10;
    n=n/10; 
    sum=sum+n1;
    count++;
  }
  printf("%d",sum);
  return 0;
}