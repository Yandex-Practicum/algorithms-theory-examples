int[] visitors = {0, 2, 3, 2, 0, 4, 1, 1, 2};
int[] entriesByVisitor = new int[5];
int bestVisitor = 0;

for (int i = 0; i < visitors.length; i++) {
    int visitor = visitors[i];
    entriesByVisitor[visitor]++;
    if (entriesByVisitor[visitor] > entriesByVisitor[bestVisitor]) {
        bestVisitor = visitor;
    }
}

System.out.println(bestVisitor);
