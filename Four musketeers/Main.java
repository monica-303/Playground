#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,x2,x3,y1,y2,y3;
  float x,y;
  cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;
  std::cin>>y3;
  x=x1+x2+x3;
  y=y1+y2+y3;
  std::cout<<x/3<<"\n";
  std::cout<<y/3;
}