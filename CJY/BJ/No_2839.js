const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});

rl.on("line", (s) => {
    s = parseInt(s);
    let a = 0;
    for (let i = ~~(s / 5); i >= 0; i--) {
        if(~~((s - (i * 5)) % 3) === 0) {
            a = i + ~~((s - (i * 5)) / 3);
            break;
        }
    }
    console.log(a === 0 ? "-1" : a);
    rl.close();
}).on("close", () => {process.exit();});