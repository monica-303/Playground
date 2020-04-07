#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int pri,rate,time;
  float r=1,amt=0,c=1,z=0;
  std::cin>>pri;
  std::cin>>rate;
  std::cin>>time;
  r=pri*rate*time/100;
  amt=pri+r;
  c=2*r/100;
  z=amt-c;
  std::cout<<r<<"\n";
  std::cout<<amt<<"\n";
  std::cout<<c<<"\n";
  std::cout<<z;
}