#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int nb,tar,sc,b,d;
  float over_fin,curr_rr,tot_rr,over,c,val,curr,tot;
  cin>>nb;
  cin>>tar;
  cin>>sc;
  cin>>b;
  over=nb/6;
  d=b/6;
  c=b%6;
  //cout<<c/10;
  over_fin=d+(c/10);
  curr=sc/over_fin;
  val=(int)(curr * 10 + .5);
  curr_rr=(float)val/10;
  tot=tar/over;
  val=(int)(tot * 10 + .5);
  tot_rr=(float)val/10;
  cout<<over<<"\n";
  cout<<over_fin<<"\n";
  cout<<curr_rr<<"\n";
  cout<<tot_rr<<"\n";
  if(tot_rr<curr_rr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
  
}