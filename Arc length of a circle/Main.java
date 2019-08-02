#include<stdio.h>
int main()
{
  float radius,angle,ans;
  scanf("%f%f",&radius,&angle);
  ans = (angle / 360) * (2*3.14*radius);
  printf("%.2f",ans);
  return 0;
}
  