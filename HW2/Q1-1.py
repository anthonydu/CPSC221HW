from sympy import symbols


c = symbols("c")


def R(n):
    if n == 0:
        return 1
    else:
        return R(n - 1) + 3 * c


def ans(n):
    return n * 3 * c + 1


for i in range(0, 10):
    print(R(i) == ans(i))
