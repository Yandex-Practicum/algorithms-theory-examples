boolean compare(String first, String second) {
    if (first.length() != second.length()) {
        return false;
    }

    int length = first.length();
    for (int i = 0; i < length; ++i) {
        if (first.charAt(i) != second.charAt(i)) {
            return false;
        }
    }

    return true;
}
