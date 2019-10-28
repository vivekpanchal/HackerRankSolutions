#include <bits/stdc++.h>

using namespace std;

int main()
{int i,a[3],b[3],alice=0,bob=0;
    for(i=0;i<3;i++)
        cin>>a[i];
     for(i=0;i<3;i++)
        cin>>b[i];
    for(i=0;i<3;i++)
    {
        if(a[i]!=b[i])
        {
            if(a[i]>b[i])
                alice++;
            else
                bob++;
            
        }
        else
            continue;
    }
 cout<<alice<<" "<<bob;
}



   