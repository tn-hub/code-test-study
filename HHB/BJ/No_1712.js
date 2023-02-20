const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let strArr = line.split(" ");

    let a = parseInt(strArr[0]);
    let b = parseInt(strArr[1]);
    let c = parseInt(strArr[2]);

    if(b >= c){
        console.log("-1");
    }
    else{
        console.log(a/(c-b) + 1);
    }

    rl.close();
}).on("close", () => {
    process.exit();
});