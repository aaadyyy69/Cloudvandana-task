function sortArrayDescending(arr) {
    // Use the sort function with a custom comparator for descending order
    return arr.sort((a, b) => b - a);
}

// Example usage
let inputArray = [5, 2, 9, 1, 5, 6];
let sortedArray = sortArrayDescending(inputArray);
console.log(sortedArray);
