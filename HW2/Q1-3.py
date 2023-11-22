import math


def T(n):
    if n == 1:
        return 13
    else:
        return 2 * T(n / 2) + 13 * n


def ans(n):
    # n = 1, 13
    # n = 2, 2(13) + 13n
    # n = 4, 2(2(13) + 13n) + 13n
    # n = 8, 2(2(2(13) + 13n) + 13n) + 13n

    # n = 1, 1 * 13(n/1)
    # n = 2, 2 * 13(n/2) + 1 * 13(n/1)
    # n = 4, 4 * 13(n/4) + 2 * 13(n/2) + 1 * 13(n/1)
    # n = 8, 8 * 13(n/8) + 4 * 13(n/4) + 2 * 13(n/2) + 1 * 13(n/1)

    return (math.log2(n) + 1) * 13 * n


for i in range(1, 10):
    print(T(2**i) == ans(2**i))
