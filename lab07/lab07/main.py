def main():
    size = int(input("Enter matrix size: "))
    filler = input("Enter matrix filler: ")

    matrix = [[' ' for _ in range(size)] for _ in range(size)]

    for i in range(size // 2):
        for j in range(i + 1):
            matrix[i][j] = filler[0]
            print(matrix[i][j], end=' ')

        print()

    right = 1
    for i in range(size // 2, size):
        print('  ' * (size // 2), end='')
        for j in range(right):
            matrix[i][j] = filler[0]
            print(matrix[i][j], end=' ')

        right += 1
        print()

    with open("Matrix.txt", "w") as fout:
        for row in matrix:
            fout.write(" ".join(row) + "\n")

if __name__ == "__main__":
    main()
