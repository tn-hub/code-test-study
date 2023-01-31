const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});
let arr = [];
let cnt = 0;

rl.on("line", (s) => {
    arr.push(s);
    if(cnt === parseInt(arr[0])) rl.close();
    cnt++;
}).on("close", () => {
    let a = "";
    for (let i = 0; i < arr[0]; i++) {
        const input = arr[i + 1].split(" ");
        const n = parseInt(input[0]);
        const txtArr = input[1].split("");
        for (let j = 0, len = txtArr.length; j < len; j++) for (let k = 0; k < n; k++) a += txtArr[j];
        a += "\n";
    }
    console.log(a);
    process.exit();
});