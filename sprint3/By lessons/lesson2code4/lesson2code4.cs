public static string AsBinaryString(int n)
{
    if (n < 0)
        return "-" + AsBinaryString(-n);
    if (n == 0 || n == 1)
        return n.ToString();
    int lastDigit = n % 2;
    return AsBinaryString(n / 2) + lastDigit.ToString();
}
