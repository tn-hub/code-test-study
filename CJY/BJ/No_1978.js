const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});
let n;

rl.on("line", (s) => {
    if(n) {
        s = s.split(" ");
        let cnt = 0;
        for (let i = 0; i < n; i++) {
            let num = parseInt(s[i]);
            if(num === 1) cnt++;
            for (let j = 2; j < num; j++) {
                if (num % j === 0) {
                    cnt++;
                    break;
                }
            }
        }
        console.log(n - cnt);
        rl.close();
    } else {
        n = parseInt(s);
    }
}).on("close", () => {process.exit();});