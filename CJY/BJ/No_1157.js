const rl = require("readline").createInterface({input: process.stdin, output: process.stdout})

rl.on("line", (s) => {
    s = s.toUpperCase();
    let arr = Array.from({length: 26}, () => 0);
    for (let i = 0, len = s.length; i < len; i++) arr[s.charCodeAt(i) - 65]++;

    let max = 0;
    let answer;
    let b;

    for (let i = 0; i < 26; i++) {
        if(arr[i] === 0) continue;
        if(max < arr[i]) {
            max = arr[i];
            answer = String.fromCharCode(i + 65);
            b = false;
        } else if(max === arr[i]) {
            b = true;
        }
    }
    console.log(b ? '?' : answer);
    rl.close();
}).on("close", () => {process.exit();})