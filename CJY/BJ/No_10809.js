const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});

rl.on("line", (s) => {
    let a = "";
    for (let i = "a".charCodeAt(0), z = "z".charCodeAt(0); i <= z; i++) a += s.indexOf(String.fromCharCode(i)) + " ";
    console.log(a);
    rl.close();
}).on('close', () => {process.exit();});