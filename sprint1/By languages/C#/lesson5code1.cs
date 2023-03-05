int[] visitors = {0, 2, 3, 2, 0, 4, 1, 1, 2};
int[] entriesByVisitor = new int[5];
int bestVisitor = 0;

foreach (int visitor in visitors)
{
    entriesByVisitor[visitor]++;
    if (entriesByVisitor[visitor] > entriesByVisitor[bestVisitor])
    {
        bestVisitor = visitor;
    }
}

Console.WriteLine(bestVisitor);
