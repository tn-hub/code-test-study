const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});
let idx = 0;

rl.on("line", (s) => {
    if(idx) {
        const arr = s.split("");
        let n = 0;
        for (let i = arr.length; i--;) n += parseInt(arr[i]);
        console.log(n);
        rl.close();
    }
    idx++;
}).on("close", () => {process.exit();});