using System;

public class Program
{
    public static void Main()
    {
        var timeStart = DateTime.Now;
        int i = 0;
        while (i < 1000000000)
        {
            // Do nothing
            i++;
        }

        var timeFinish = DateTime.Now;
        TimeSpan timeSpan = timeFinish - timeStart;
        Console.WriteLine(timeSpan.TotalSeconds + " seconds");
    }
}
