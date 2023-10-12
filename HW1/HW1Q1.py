import math


def f(n):
    arr = []
    for i in range(8, n + 1):
        arr.append((6 * i**2) / (i**2 - 1))

    given = math.prod(arr)
    answer = 6 ** (n - 7) * (8 / 7) * (n / (n + 1))
    parsed = (8 * 6 ** (n - 7) * n) / (7 * n + 7)
    print(math.isclose(given, answer))
    print(math.isclose(given, parsed))


for i in range(8, 20):
    f(i)
