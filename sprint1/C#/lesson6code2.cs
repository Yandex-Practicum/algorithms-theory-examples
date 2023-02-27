List<int> cumulativeSums = new List<int>() { 0 };
int cgCount = 0;

for (int position = 0; position < sequence.Length; position++)
{
    if ((sequence[position] == 'C') || (sequence[position] == 'G'))
    {
        cgCount++;
    }

    cumulativeSums.Add(cgCount);
}

Console.WriteLine(cumulativeSums[right] - cumulativeSums[left]);
