const rl = require("readline").createInterface({input: process.stdin, output: process.stdout})

rl.on("line", (s) => {
    const arr = s.split(' ');
    let a = "";
    let b = "";
    for (let i = arr[0].length - 1; i >= 0; i--) a += arr[0].charAt(i);
    for (let i = arr[1].length - 1; i >= 0; i--) b += arr[1].charAt(i);
    console.log(a > b ? a : b);
    rl.close();
}).on("close", () => {process.exit();});