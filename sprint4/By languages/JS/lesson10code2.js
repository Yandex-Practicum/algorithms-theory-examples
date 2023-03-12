function effectiveSolution(A, x) {
    const history = new Set();
    const n = x.length;
    const xSorted = x.sort();
    const triples = new Set();
    for (let i = 0; i < n; i++) {
        for (let j = i + 1; j < n; j++) {
            const target = A - xSorted[i] - xSorted[j];
            if (history.has(target)) {
                // Заметим, что тут тройка уже отсортирована за счёт предварительной
                // сортировки всего массива.
                triples.add([target, xSorted[i], xSorted[j]]);
            }
            history.add(xSorted[i]);
        }
    }
    return triples;
}
