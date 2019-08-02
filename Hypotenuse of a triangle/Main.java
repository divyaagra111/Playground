#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a,b;
  scanf("%f %f",&a,&b);
  float hypotenuse = sqrt(a*a + b*b);
  printf("%.2f",hypotenuse);
   return 0;
}