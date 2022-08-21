##gGiven a 2d array print the array in a spiral format...
def spiralprint(arr,n,m):
    startrow =0
    startcol = 0
    endrow=n-1
    endcol=m-1
    while(startcol<=endcol and startrow<=endrow):
        #startrow
        for col in range(startcol,endcol+1):
            print(arr[startrow][col],end=" ")
        
        #endcol
        for row in range(startrow+1,endrow):
            print(arr[row][endcol],end=" ")
        
        #endrow
        for col in range(endcol,startcol,-1):
            if startrow == endrow:
                break
            print(arr[endrow][col],end=" ")
        #startcol
        for row in range(endrow,startrow,-1):
            if startcol == endcol:
                break
            print(arr[row][startcol],end=" ")

        startrow+=1
        startcol+=1
        endrow-=1
        endcol-=1
d2_array = [
    [1,2,3,4],
    [5,6,7,8],
    [9,10,11,12],
    [13,14,15,16],
    [17,18,19,20]
    ]
spiralprint(d2_array,len(d2_array),len(d2_array[0]))