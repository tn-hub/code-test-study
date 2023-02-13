const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let str = line;
    let count = [];
    for(let i=0; i<26; i++){
        count[i] = 0;
    }
    let temp = 'A';

    for(let i=0; i<str.length; i++){
        if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
            count[str.charCodeAt(i)-'A'.charCodeAt(0)] += 1;
        }
        else{
            count[str.charCodeAt(i)-'a'.charCodeAt(0)] += 1;
        }
    }

    let maxInt = -1;
    let maxChar = '?';
    for(let i=0; i<26; i++){
        if(count[i] > maxInt){
            maxInt = count[i];
            maxChar = String.fromCharCode(i+65); //출력할 대문자
        }
        else if(count[i] == maxInt){
            maxChar = '?'; //같으면 ? 출력
        }
    }
    console.log(maxChar);

    rl.close();
}).on("close", () => {
    process.exit();
});