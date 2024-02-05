//This is my first JS code
console.log('Hello World');
let userName = 'Josh'; //String literal
let age = 30;
let isApproved = true;
let firstName = undefined;
let selectedColor = null; 

//Objects
let person = {
    pName : 'Jason',
    pAge : 30
};

console.log(person);

//Dot notation
person.pName = 'Stacy';
console.log(person.pName);

//Bracket notation
person['pName'] = 'Mary';
console.log(person['pName']);

let selection = 'pAge';
person[selection] = '25';
console.log(person);


let selectedColors = ['red', 'blue'];
console.log(selectedColors);
selectedColors[2] = 'green';
selectedColors[3] = 100;
console.log(selectedColors);
console.log(selectedColors.length);
//Array is a data structure used to represent a number of items.

function greet(){
    console.log('Hello Buddy');
}

greet();

//uName is a parameter
function greet2(uName, lName){
    console.log('Hello ' + uName + lName);
}

greet2('Joseph ', 'Baker'); //Joseph is an argument
greet2('Mary ', 'Stellar');

//Calculates a value
function square(number){
    return number* number;
}

console.log(square(5));