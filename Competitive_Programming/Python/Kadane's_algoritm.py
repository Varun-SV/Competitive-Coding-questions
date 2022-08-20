##to find the maximum sum subarray
import heartrate
heartrate.trace(browser=True)
import sys
def max_sum_subarray(arr):
    cs = 0
    ms = -1 * sys.maxsize
    for i in arr:
        cs += i
        ms = max(ms, cs)
        if cs < 0:
            cs = 0
    return ms
print("Maximum subarray sum = ",max_sum_subarray([1,2,3,4,-10,9,8,-90]))
print("Maximum subarray sum = ",max_sum_subarray([-1,-2,-3,-4,-10,-9,-8,-90]))
print("Maximum subarray sum = ",max_sum_subarray([-1,-2,-3,-4,-10,-9,-8,-90,-1,-2,-3,-4,-10,-9,8,-90]))