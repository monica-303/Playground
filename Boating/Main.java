#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int mw,na,nc,tw;
  cin>>mw;
  cin>>na;
  cin>>nc;
  tw=na*75+nc*30;
  if(mw<=tw)
    std::cout<<"Boat will drow";
  else
    std::cout<<"Boat is stable";
}