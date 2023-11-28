function reverseWords(sentence) {
    // Split the sentence into words
    let words = sentence.split(" ");

    // Reverse each word
    let reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words back into a sentence
    let reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

function reverseWord(word) {
    // Split the word into an array of characters, reverse it, and join back into a string
    return word.split("").reverse().join("");
}

// Example usage
let inputSentence = "This is a sunny day";
let reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);
