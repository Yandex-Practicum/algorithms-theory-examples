int[] cumulativeSums = new int[sequence.length() + 1];
int cgCount = 0;
for (int position = 0; position < sequence.length(); position++) {
    if (sequence.charAt(position) == 'C' || sequence.charAt(position) == 'G') {
        cgCount++;
    }
    cumulativeSums[position + 1] = cgCount;
}
System.out.println(cumulativeSums[right] - cumulativeSums[left]);
