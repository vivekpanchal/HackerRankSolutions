#include <bits/stdc++.h>
#include<math.h>

using namespace std;
int main()
{
   int n,i,j,diag1=0,diag2=0;
    cin>>n;
    int arr[n][n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
           cin>>arr[i][j];
           if(i==j)
           {diag1=diag1+arr[i][j];
           }
           if ((i+j)==(n-1))
           {diag2+=arr[i][j];}
           else
             continue;
        }
    }



   int diff=abs(diag2-diag1);
    cout<<diff;
    return 0;
}
