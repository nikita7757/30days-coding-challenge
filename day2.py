def find_missing_no(array):
    n  = len(array) + 1
    total_sum = (n * (n + 1) // 2)
    Sum = sum(array)
    res = total_sum - Sum
    return res

array = [1, 2, 4, 5]
n = 5
print(find_missing_no(array))
