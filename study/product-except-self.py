# Product of array except self

# Given an array 'nums', must output an array 'ans' such that ans[i]
# equals the product of all elements of nums except for nums[i].

# A time complexity of O(n) and a space complexity of O(1) is required. 


from audioop import mul
from sre_constants import MIN_UNTIL


def product(nums):
    ans = [1] * len(nums)

    multiplicant = 1
    for i in range(len(nums)):
        ans[i] *= multiplicant
        multiplicant *= nums[i]

    multiplicant = 1
    for j in range(len(nums) - 1, -1, -1):
        ans[j] *= multiplicant
        multiplicant *= nums[j]

    return ans


print(product([1, 2, 3, 4]))


