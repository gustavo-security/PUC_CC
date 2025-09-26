using System;

class Palindromo
{
    static bool EhPalindromo(string palavra)
    {
        int tamanho = palavra.Length;
        for (int i = 0; i < tamanho / 2; i++)
        {
            if (palavra[i] != palavra[tamanho - i - 1])
            {
                return false;
            }
        }
        return true;
    }

    static void Main()
    {
        while (true)
        {
            string palavra = Console.ReadLine().Trim();
            if (palavra.ToUpper() == "FIM")
                break;

            bool resultado = EhPalindromo(palavra);
            Console.WriteLine(resultado ? "SIM" : "NAO");
        }
    }
}
