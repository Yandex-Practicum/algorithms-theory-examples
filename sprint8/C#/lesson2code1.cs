bool Compare(string first, string second) {
    if (first.Length != second.Length) {
        return false;
    }

    int length = first.Length;
    for (int i = 0; i < length; ++i) {
        if (first[i] != second[i]) {
            return false;
        }
    }

    return true;
}
