def read_line(fileName):
    try:
        with open(fileName, 'r') as file:
            lines = file.readlines()
            return [line.strip() for line in lines]
    except:
        print("File '{fileName}' not found")


def count_num(linesA, linesB):
    ind = 0
    max_len = max(len(linesA), len(linesB))
    # print(max_len)

    while ind < max_len:

        if linesA[ind].isdigit() and linesB[ind].isdigit():
            print(int(linesA[ind]) ** int(linesB[ind]))
        else:
            print('wrong input')

        ind += 1


linesA = read_line('A.txt')
linesB = read_line('B.txt')
count_num(linesA, linesB)
