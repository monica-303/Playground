#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  float famt,samt,aamt;
  cin>>fa;
  cin>>fd;
  cin>>fs;
  cin>>sa;
  cin>>sd;
  cin>>ss;
  cin>>aa;
  cin>>ad;
  cin>>as;
  famt=fa-(fd*fa)/100+fs;
  samt=sa-(sd*sa)/100+ss;
  aamt=aa-(ad*aa)/100+as;
  cout<<"In Flipkart Rs."<<famt<<"\n";
  cout<<"In Snapdeal Rs."<<samt<<"\n";
  cout<<"In Amazon Rs."<<aamt<<"\n";
  if(famt<=samt && famt<aamt)
    cout<<"He will prefer Flipkart";
  else if(samt<aamt)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
  
}