const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});

rl.on("line", (s) => {
    console.log(s.replace(/c=|c-|dz=|d-|lj|nj|s=|z=/g, "*").length);
    rl.close();
}).on("close", () => {process.exit();});