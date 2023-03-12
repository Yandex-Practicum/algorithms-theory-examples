public static List<int> Search(string p, string text)
{
    List<int> result = new List<int>();
    string s = p + "#" + text;
    int[] π = new int[p.Length];
    int π_prev = 0;
    for (int i = 1; i <= s.Length; i++)
    {
        int k = π_prev;
        while (k > 0 && s[k - 1] != s[i - 1])
        {
            k = π[k - 1];
        }
        if (s[k - 1] == s[i - 1])
        {
            k++;
        }
        if (i <= p.Length)
        {
            π[i - 1] = k;
        }
        π_prev = k;
        if (k == p.Length)
        {
            result.Add(i - 2 * p.Length);
        }
    }
    return result;
}
