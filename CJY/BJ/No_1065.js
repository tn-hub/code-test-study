const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});

rl.on("line", (s) => {
    const n = parseInt(s);
    let cnt = n;
    if (n >= 100) {
        cnt = 99;
        for (let i = 100; i <= n; i++) {
            if (i === 1000) break;
            if (~~(i % 10) - ~~((i / 100) % 10) === (~~(i % 10) - ~~((i / 10) % 10)) * 2) cnt++;
      }
    }
    console.log(cnt);
    rl.close();
}).on("close", () => {process.exit();});