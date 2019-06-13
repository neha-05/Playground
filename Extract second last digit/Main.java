#include<stdio.h>
int main()
{
  int num,num1,num2;
  scanf("%d",&num);
  num1=num%100;
  num2=num1/10;
  printf("%d",num2);
  return 0;
}