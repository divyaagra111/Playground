#include <stdio.h>
int main() {
	//Type your code
  int num,fact=1;
  scanf("%d",&num);
  if(num==0){
    printf("%d",fact);
  }
  else if(num>0){
    for(int i=1;i<=num;i++){
      fact = fact*i;
    }
    printf("%d",fact);
  }
  else{
    printf("error");
  }
  
	return 0;
}