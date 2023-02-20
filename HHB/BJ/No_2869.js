const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let strArr = line.split(" ");
    let A = parseInt(strArr[0]);
    let B = parseInt(strArr[1]);
    let V = parseInt(strArr[2]);

    let day = (V-B) / (A-B);
    if((V-B) % (A-B) != 0){
        day++;
    }

    console.log(day);

    rl.close();
}).on("close", () => {
    process.exit();
});