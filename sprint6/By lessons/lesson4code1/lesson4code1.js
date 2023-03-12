function printReversed(node) {
    for (let child of node.children) {
        printReversed(child);
    }
    console.log(node.value);
}
