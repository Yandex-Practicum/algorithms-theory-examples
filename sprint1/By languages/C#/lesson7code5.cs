public static bool[] EratosthenesEffective(int n)
{
    bool[] numbers = Enumerable.Range(0, n + 1).Select(i => true).ToArray();
    numbers[0] = numbers[1] = false;

    for (int num = 2; num < n; num++)
    {
        if (numbers[num])
        {
            for (int j = num * num; j <= n; j += num)
            {
                numbers[j] = false;
            }
        }
    }

    return numbers;
}
