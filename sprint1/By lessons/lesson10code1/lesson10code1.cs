public static int Solve(List<int> array)
{
    int maximal_sum = 0; // Сумма пустого префикса равна 0

    for (int i = 0; i < array.Count; i++)
    {
        int current_sum = array.GetRange(0, i + 1).Sum();

        if (maximal_sum < current_sum)
        {
            maximal_sum = current_sum;
        }
    }

    return maximal_sum;
}
