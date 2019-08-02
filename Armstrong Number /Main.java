#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int n,digits=0,number,last,sum;
  scanf("%d",&n);
  number=n;
  while (n != 0) {
      digits++;
      n = n/10;
   }
   
   n = number;
   
  while(n != 0){
    last = n%10;
    sum += pow(last,digits);
    n = n/10;
  }
  if(sum==number){
    printf("Armstrong Number");
  }
  else{
    printf("Not an Armstrong Number");
  }
	return 0;
}