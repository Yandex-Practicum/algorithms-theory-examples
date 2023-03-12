int factorial(int n)
{
    int accumulator = 1;
    int i = n;
    while (i > 1)
    {
        accumulator *= i;
        i -= 1;
    }
    return accumulator;
}