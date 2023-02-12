const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let str = line;
    let strArr = str.split(" ");
    let count = 0;

    for(let i=0; i<strArr.length; i++){
        if(strArr[i].length>0){
            count++;
        }
    }

    console.log(count);
    rl.close();
}).on("close", () => {
    process.exit();
});