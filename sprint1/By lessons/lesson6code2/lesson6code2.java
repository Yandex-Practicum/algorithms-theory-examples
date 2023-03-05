int[] cumulativeSums = new int[sequence.length() + 1];
int cgCount = 0;

for (int i = 0; i < sequence.length(); i++) {
    if (sequence.charAt(i) == 'C' || sequence.charAt(i) == 'G') {
        cgCount++;
    }
    cumulativeSums[i + 1] = cgCount;
}

System.out.println(cumulativeSums[right] - cumulativeSums[left]);
