//To print the maximum sum subarray
#include<iostream>
#include<climits>
#include<stdio.h>
using namespace std;
int max_sum_subarray(int arr[],int n)
{
    int cs = 0,ms = INT_MIN;
    for(int i=0;i<n;i++)
    {
        cs = cs + arr[i];
        ms = max(cs,ms);
        if (cs < 0)
        {
            cs = 0;
        }
    }
    return ms;
}
void main()
{
    system("cls");
    cout<<"Maximum sum subarray : ";
    int arr = {-2, -3, 4, -1, -2, 1, 5, -3};
    // int arr[] = {1,2,3,4,-10,9,8,-90};
    // int arr[] = {-1,-2,-3,-4,-10,-9,-8,-90};
    // int arr[] = {-1,-2,-3,-4,-10,-9,-8,-90,-1,-2,-3,-4,-10,-9,8,-90};
    int n = sizeof(arr)/sizeof(arr[0]);
    cout<<max_sum_subarray(arr,n);

}