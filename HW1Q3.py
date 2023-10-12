import math


def f(n):
    result = 0
    for k in range(2, n + 1):
        result += 8 * k + 6
    print(math.isclose(result, 6 * (n - 1) + ((2 + n) * (n - 1) / 2) * 8))
    print(math.isclose(result, 6 * n + (n + 2) * (4 * n - 4) - 6))


for i in range(1, 10):
    f(i)


print(math.log(3) / math.log(9) + math.log(160000) / math.log(20))
