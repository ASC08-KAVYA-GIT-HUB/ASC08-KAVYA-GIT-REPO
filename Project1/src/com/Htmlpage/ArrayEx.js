window.onload = function() {
    // Define an array with sample elements
    const myArray = ['Apple', 'Banana', 'Cherry', 'Date', 'Elderberry'];

    // Get the display div by id
    const displayDiv = document.getElementById('arrayDisplay');

    // Clear any existing content
    displayDiv.innerHTML = '';

    // Loop through the array and create a paragraph for each element with class 'arrayItem'
    myArray.forEach(function(item) {
        const p = document.createElement('p');
        p.className = 'arrayItem';
        p.textContent = item;
        displayDiv.appendChild(p);
    });
};

