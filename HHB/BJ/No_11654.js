const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let num = line;
    console.log(num.charCodeAt(0));

    rl.close();
}).on("close", () => {
    process.exit();
});


