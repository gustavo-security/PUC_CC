using System;

class Contagem
{
    static int ContandoPalavras(string frase)
    {
        // Divide a frase em palavras pelo espaço
        string[] palavras = frase.Split(' ', StringSplitOptions.RemoveEmptyEntries);
        return palavras.Length;
    }

    static void Main()
    {
        while (true)
        {
            string frase = Console.ReadLine().Trim();
            if (frase.ToUpper() == "FIM")
                break;

            Console.WriteLine(ContandoPalavras(frase));
        }
    }
}
