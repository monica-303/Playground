#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float mil;
  int petrol_avl,distance,tot;
  cin>>mil;
  cin>>petrol_avl;
  cin>>distance;
  tot=mil*petrol_avl;
  if(tot>=distance)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  
}