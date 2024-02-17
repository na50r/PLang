console.log('Hello world');

const interestRate = 0.3;
console.log(interestRate);

//Primitives
let firstName = 'Mosh'; //String literal
let lastName = 'Hamedani';
let age = 30; //Number literal
let isApproved = true; //Boolean literal
lastName = undefined;
lastName = null; //Null is used for empty stuff
console.log(firstName);

//Reference types: Object, Array, Function
let aPerson = {
    aName:'Mosh',
    anAge: 30,
};

let aName = aPerson.aName;
let anAge = aPerson.anAge;

//Arrays, Data structure used to represent a list of items
let selectedColors = ['red', 'blue', 'green'];
selectedColors[3] = 'violet';
selectedColors[5] = 1;
console.log(selectedColors);

//Functions
const Primes = (bound) => {
    let tmp = [];
    for(i = 0; i<=bound; i++){tmp[i]=true;}
    tmp[0] = false;
    tmp[1] = false;
    let primes = [];
    for(i = 2; i<bound; i++){
        if(tmp[i]==true){primes.push(i);}
        for(j = 2; j<bound; j++){
            if(j%i == 0){
                tmp[j] = false;
            }
        }
    }
    return primes;
}


