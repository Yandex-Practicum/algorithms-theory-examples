class Main {
    static void stairs_builder(int n) {
        // build 1 step
        System.out.printf("Осталось построить %d ступеней.\n", n);
        stairs_builder(n - 1);
    }

    public static void main(String[] args) {
        stairs_builder(5);
    }
}
