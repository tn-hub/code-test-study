const rl = require("readline").createInterface({input: process.stdin, output: process.stdout})

rl.on("line", (s) => {
    if(s === " ") {
        console.log(0);
    } else {
        const len = s.length - 1;
        if(s.charAt(len) === ' ') s = s.substring(0, len);
        if(s.charAt(0) === ' ') s = s.substring(1);
        console.log(s.split(" ").length);
    }
    rl.close();
}).on("close", () => {process.exit();})