const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});

rl.on("line", (s) => {
    console.log(s.charCodeAt(0));
    rl.close();
}).on("close", () => {process.exit();});