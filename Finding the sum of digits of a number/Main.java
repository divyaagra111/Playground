#include <stdio.h>
int main() {
	//Type your code
  int n,count=0,sum=0,digit=0;
  scanf("%d",&n);
  while(n!=0){
        digit = n % 10;
        sum  = sum + digit;
        n /= 10;
    }
   
  printf("%d",sum);
    
	return 0;
}