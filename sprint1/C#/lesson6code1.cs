int cgCount = 0;
for (int position = left; position < right; position++)
{
    if ((sequence[position] == 'C') || (sequence[position] == 'G'))
    {
        cgCount++;
    }
}

Console.WriteLine(cgCount);
