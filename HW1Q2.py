import math

for n in range(1, 10):
    given = 43046721 ** (math.log(9 * n) / (4 * math.log(3)))
    answer = (9 * n) ** 4
    parsed = 6561 * n**4
    print(math.isclose(given, answer))
    print(math.isclose(given, parsed))
