const rl = require("readline").createInterface({input: process.stdin, output: process.stdout})

rl.on("line", (s) => {
    let alp = [];
    let cnt = 2;
    for (let i = 0; i < 26; i++) {
        if(i % 3 === 0 && i <= 15 || i === 19 || i === 22) cnt++;
        alp[i] = cnt;
    }

    let sum = 0;
    for (let i = 0, len = s.length; i < len; i++) sum += alp[s.charCodeAt(i) - 65];
    console.log(sum);
    rl.close();
}).on("close", () => {process.exit();});