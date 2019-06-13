#include <stdio.h>
int main() {
  int i,n,value;
  int sum=0;
  scanf("%d",&n);
  	for(i=1;i<=n;i++)
    {
      sum+=i;
     }
  printf("%d",sum);
	return 0;
}