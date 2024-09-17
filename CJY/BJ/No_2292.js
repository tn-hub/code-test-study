const rl = require("readline").createInterface({input: process.stdin, output: process.stdout})

rl.on("line", (s) => {
    s = parseInt(s);
    let c = 1, a = 1;
    while (s > c) {
        c += 6 * a;
        a++;
    }
    console.log(a);
    rl.close();
}).on("close", () => {process.exit();});