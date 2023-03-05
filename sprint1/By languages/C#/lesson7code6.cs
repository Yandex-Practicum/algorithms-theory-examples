public static (List<int>, List<int>) GetLeastPrimesLinear(int n)
{
    List<int> lp = Enumerable.Repeat(0, n + 1).ToList();
    List<int> primes = new List<int>();

    for (int i = 2; i <= n; i++)
    {
        if (lp[i] == 0)
        {
            lp[i] = i;
            primes.Add(i);
        }

        foreach (int p in primes)
        {
            int x = p * i;

            if (p > lp[i] || x > n)
            {
                break;
            }

            lp[x] = p;
        }
    }

    return (primes, lp);
}
