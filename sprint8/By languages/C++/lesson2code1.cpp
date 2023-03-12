bool compare(const std::string& first, const std::string& second) {
    if (first.length() != second.length()) {
        return false;
    }

    size_t length = first.length();
    for (size_t i = 0; i < length; ++i) {
        if (first[i] != second[i]) {
            return false;
        }
    }

    return true;
}
