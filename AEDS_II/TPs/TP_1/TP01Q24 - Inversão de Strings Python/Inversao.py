def inversao(palavra):
    return palavra[::-1]  # inverte a string

def main():
    while True:
        palavra = input().strip()
        if palavra.upper() == "FIM":
            break
        print(inversao(palavra))

if __name__ == "__main__":
    main()
