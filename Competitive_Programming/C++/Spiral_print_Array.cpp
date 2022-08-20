#include<iostream.h>
using namespace std;
void spiral_print_array(int arr[][4],int n,int m)
{
    int startrow=0,startcol = 0,endrow = n-1,endcol = m-1;
    while(startrow<=endrow && startcol<=endcol)
    {
        //Startrow
        for(int col=startcol;col<=endcol;col++)
        {
            cout<<arr[startrow][col]<<" ";
        }

        //Endcol
        for(int row=startrow+1;row<=endrow;row++)
        {
            cout<<arr[row][endcol]<<" ";
        }

        //Endrow
        for(int col = endcol-1;col>=startcol;col--)
        {
            if (startrow == endrow)
            {
                break;
            }
            cout<<arr[endrow][col]<<" ";
        }

        //startcol
        for(int row=endrow-1;row>=startrow;row--)
        {
            if (startcol == endcol)
            {
                break;
            }
            cout<<arr[row][startcol]<<" ";
        }
        startrow++;
        startcol++;
        endcol--;
        endrow--;
    }
}
int main()
{
    int arr[][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    spiral_print_array(arr,4,4);
    return 0;
}