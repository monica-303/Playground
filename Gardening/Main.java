#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,no;
  cin>>r;
  cin>>c;
  cin>>no;
  if(no>=r+1 && no<=r*2)
    cout<<"It is a mango tree";
  else if(no<=(r*c)-r && no>=(r*c)-(2*r)+1)
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
}