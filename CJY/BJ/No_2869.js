const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});

rl.on("line", (s) => {
    const arr = s.split(" ");
    let p = 0, c = 1;
    let a = parseInt(arr[0]);
    let b = parseInt(arr[1]);
    let v = parseInt(arr[2]) - a;

    while (true) {
        p += a;
        if(p >= (v  % (a - b)) + a) break;
        p -= b;
        c++;
    }
    console.log(~~(v / (a - b)) + c);
    rl.close();
}).on("close", () => {process.exit();});