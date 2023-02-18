const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let n = parseInt(line);
    let count = 1;
    let x = 1;

    if(n==1){
        console.log(count);
    }
    else{
        while(x<=n){
            x = x + (6 * count);
            count++;
        }
        console.log(count);
    }

    rl.close();
}).on("close", () => {
    process.exit();
});