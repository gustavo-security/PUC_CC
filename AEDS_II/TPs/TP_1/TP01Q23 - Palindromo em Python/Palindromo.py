def is_palindromo(palavra):
    tamanho = len(palavra)
    for i in range(tamanho // 2):  # percorre até a metade
        if palavra[i] != palavra[tamanho - i - 1]:
            return False
    return True


def main():
    while True:
        palavra = input().strip()  # lê a palavra
        if palavra.upper() == "FIM":  # condição de parada
            break
        resultado = is_palindromo(palavra)
        print("SIM" if resultado else "NAO")


if __name__ == "__main__":
    main()
