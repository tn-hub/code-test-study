const rl = require("readline").createInterface({input: process.stdin, output: process.stdout})

rl.on("line", (s) => {
    s = s.split(" ");
    console.log(s[1] * 1 < s[2] * 1 ? ~~(s[0] * 1 / (s[2] * 1 - s[1])) + 1 : -1);
    rl.close();
}).on("close", () => {process.exit();});