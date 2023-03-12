function compare(first, second) {
    if (first.length !== second.length) {
        return false;
    }

    var length = first.length;
    for (var i = 0; i < length; ++i) {
        if (first[i] !== second[i]) {
            return false;
        }
    }

    return true;
}
