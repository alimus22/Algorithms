# Find the Duplicate Number

# Given an array of integers of size n+1, whre each integer is 
# within the range [1, n]. There is a single repeating number
# that must be returned.

# The problem must be solve without modifying the inital array
# and with a constant space utilization. 

# Floyd's algorithm will be used to solve the problem. 

def find_duplicate(nums):
    sum = 0
    for i in range(len(nums)):
        sum += i

    for num in nums:
        sum -= num
    
    return -sum


print(' '.join(['Found:', str(find_duplicate([1,2,3,1,4])), '- Expected: 1']))

print(' '.join(['Found:', str(find_duplicate([1, 2, 1, 1, 1])), '- Expected: 1']))

print(' '.join(['Found:', str(find_duplicate([1, 1, 1])), '- Expected: 1']))