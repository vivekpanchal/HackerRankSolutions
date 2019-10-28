#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    
    unsigned long long int N, Sum = 0, i, Num;
    
    cin>>N;
    
    for (i = 1 ; i <= N ; i++)
        {
        cin>> Num;
        Sum += Num;
    }
    
    cout<<Sum<<endl;
       
    
    
    return 0;
}
