const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

let input = [];

rl.on("line", (line) => {
    input.push(line);
}).on("close", () => {
    let n = Number(input[0]); //입력 받을 그룹 단어의 개수
    let count = n; //그룹단어의 개수

    for(let i=0; i<n; i++){
        let chk = [];
        let str = input[i];

        for(let j=0; j<str.length; j++) {
            if(!chk.includes(str[j])) {
                chk.push(str[j]);
            }
            else {
                if(str[j] === str[j-1]){
                    break;
                }
                else{
                    count--;
                    break;
                }
            }
        }

    }
    console.log(count);

    process.exit();
});