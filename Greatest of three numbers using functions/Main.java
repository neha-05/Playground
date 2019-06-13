#include <stdio.h>
int main()
{
  int a,b,c;
  scanf("%d%d%d",&a,&b,&c);
  printf("%d",greatest(a,b,c));
  
}
int greatest(int a,int b,int c)
{
   
  int big;
  if(a>b && a>c)
    big=a;
  else if(b>a && b>c)
    big=b;
  else
    big=c;
  return big;
}
