public static List<int> GetSmallerPrimes(int n)
{
    List<int> smallerPrimes = new List<int>();

    for (int num = 2; num <= n; num++)
    {
        if (IsPrime(num))
        {
            smallerPrimes.Add(num);
        }
    }

    return smallerPrimes;
}
