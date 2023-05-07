int N = s.Length;
int[] π = new int[N];

for (int i = 1; i < N; i++)
{
    string substring = s.Substring(0, i);
    for (int k = i - 1; k >= 0; k--)
    {
        string prefix = substring.Substring(0, k);
        string suffix = substring.Substring(i - k, k);
        if (prefix == suffix)
        {
            π[i - 1] = k;
            break;
        }
    }
}

