def remove(word):
    punctuation = ['.', ',', '!', '?', ';', ':']
    for p in punctuation:
        if word.endswith(p):
            return word[:-1]
    return word


def read_file(fileName):
    try:
        with open('DATA.in', 'r') as file:
            words = file.read().split()
            return [remove(word) for word in words]

    except:
        print("text '{fileName}' not found")


def count_word(words):
    a = dict()

    for w in words:
        if w in a:
            a[w] += 1
        else:
            a[w] = 1

    for w in words:
        if (a[w] > 0):
            print(w + " " + str(a[w]))
            a[w] = 0


wordsA = read_file('DATA.in')
count_word(wordsA)
