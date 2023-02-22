const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});
let T = 0;
let answer = "";

rl.on("line", (s) => {
    if(T > 0) {
        const arr = s.split(" ");
        let H = parseInt(arr[0]);
        let N = parseInt(arr[2]);
        let a = N % H === 0 ? H : ~~(N % H);
        let b = a === H ? ~~(N / H) : ~~(N / H) + 1;
        answer += a + (b > 9 ? "" : "0") + b + "\n";
        T--;
        if(T === 0) {
            console.log(answer);
            rl.close();
        }
    } else {
        T = parseInt(s);
    }
}).on("close", () => {process.exit();});