##function depicting the staircase search 
def staircase_search(arr, key):
    n = len(arr) - 1
    m = len(arr[0])-1
    if key<arr[0][0] or key>arr[n][m] :
        return (-1,-1)
    else:
        i=0
        j=m
        while(i<=n and j>=0):
            if arr[i][j]==key:
                return (i,j)
            elif arr[i][j]>key:
                j-=1
            else:
                i+=1
    return (-1,-1)

array = [
    [10,20,30,40],
    [15,25,35,45],
    [27,29,37,48],
    [32,33,39,50]
]
key = int(input("Enter the search element : "))
result = staircase_search(array,key)
ans = str(result[0]) +" "+str(result[1])
print(ans)