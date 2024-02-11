console.log("Hello There!");
let luckyNum = 23;
console.log(luckyNum);
luckyNum = new Object();

let a = 'global';

function fun(){
    let a = 'function';

    if(true){
        let a = 'block';
        let b = 'kekw';
    }
}

function add(a,b){
    return a+b;
}


const human = {
    dna:"Hello there",
    kek:"Ohoho"
}

class Human{
    constructor(name){
        this.dna = 'AACTG';
        this.name = name;
    }

    get gender(){
        return this.gender
    }

    set gender(val){
        this.gender = val;
    }
}

const list = ['foo', 'bar', 'bar'];

