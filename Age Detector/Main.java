#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int byr,cyr,a,b,age;
  cin>>byr;
  cin>>cyr;
  if(byr>cyr)
    a=1900+byr;
  else
    a=2000+byr;
  b=2000+cyr;
  age=b-a;
  cout<<age;
}