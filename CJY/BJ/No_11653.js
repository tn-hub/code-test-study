const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});

rl.on("line", (N) => {
    N = parseInt(N); // 소인수분해할 정수 N
    while(N > 1) {
        for (let i = 2; i <= N; i++) {
            if(~~(N % i) === 0) { // 소수인 경우 출력
                N = ~~(N / i);
                console.log(i);
                break;
            }
        }
    }
    rl.close();
}).on("close", () => {process.exit();});