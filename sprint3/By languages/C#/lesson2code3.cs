public static string AsBinaryString(int n)
{
    if (n < 0)
        return "-" + AsBinaryString(-n);
    int lastDigit = n % 2;
    return AsBinaryString(n / 2) + lastDigit.ToString();
}
