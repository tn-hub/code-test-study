const rl = require("readline").createInterface({input: process.stdin, output: process.stdout})

rl.on("line", (n) => {
    let i = 1, s = 1;
    while (n > s) {
        i++;
        s += i;
    }
    n = s - n;
    console.log(i % 2 === 0 ? (i - n) + "/" + (1 + n) : (1 + n) + "/" + (i - n));
    rl.close();
}).on("close", () => {process.exit();})