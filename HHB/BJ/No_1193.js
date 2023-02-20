const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let n = parseInt(line);
    let count = 1;
    let x = 0;

    while(x+count < n){
        x = x + count;
        count++;
    }

    if(count%2==0){
        console.log((n-x) + "/" + (count-(n-x-1)));
    }
    else{
        console.log((count-(n-x-1)) + "/" + (n-x));
    }


    rl.close();
}).on("close", () => {
    process.exit();
});