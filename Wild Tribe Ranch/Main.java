#include<iostream>
int main()
{
  int mw,m1;
  std::cin>>mw;
  std::cin>>m1;
  if(m1==mw)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else if(mw>m1)
    std::cout<<"Yes, you can enter.";
  else
    std::cout<<"Sorry, you can't enter";
}
  