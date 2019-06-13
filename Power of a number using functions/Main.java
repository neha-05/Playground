#include<stdio.h>
void calculate_power(int,int);
 
void main() 
{
    int b,e;
    scanf("%d",&b);
    scanf("%d",&e);
    calculate_power(b,e);
}
 
void calculate_power(int b,int e)
{
    int power=1;
    while(e>0)
    {
        power=power*b;
        e--;
    }
    printf("%d",power);
}
