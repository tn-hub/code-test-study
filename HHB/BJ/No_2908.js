const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let strArr = line;
    let a = strArr[0].split("").reverse().join("");
    let b = strArr[1].split("").reverse().join("");

    console.log(a>b ? a : b);

    rl.close();
}).on("close", () => {
    process.exit();
});