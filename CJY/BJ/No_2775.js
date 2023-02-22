const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});
let T = 0, k, n;
let answer = "";

rl.on("line", (s) => {
    if(T > 0) {
        if(T % 2 === 0) {
            k = s;
        } else {
            n = s;
            let arr = Array.from({length: n}, (v, i) => 1 + i++);
            for (let j = 1; j <= n; j++) arr[j - 1] = j;
            for (let j = 0; j < k; j++) for (let l = 1; l < n; l++) arr[l] = arr[l - 1] + arr[l];
            answer += arr[n - 1] + "\n";
        }
        T--;
        if(T === 0) {
            console.log(answer);
            rl.close();
        }
    } else {
        T = parseInt(s) * 2;
    }
}).on("close", () => {process.exit();});