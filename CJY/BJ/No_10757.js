const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});

rl.on("line", (s) => {
    s = s.split(" ");
    console.log((BigInt(s[0]) + BigInt(s[1])).toString())
    rl.close();
}).on("close", () => {process.exit();});