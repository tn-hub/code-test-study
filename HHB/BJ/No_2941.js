const readline = require("readline");

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

rl.on("line", (line) => {
    let str = line.split("");
    let count = 0;

    for(let i=0; i<str.length; i++){
        if(str[i]==="c" || str[i]==="s" || str[i]==="z" && i+1 < str.length){
            if(i+1 < str.length){
                if(str[i+1]==="=" || str[i+1]==="-") i++;
            }
        }
        else if(str[i]==="d" && i+1 < str.length){
            if(str[i+1]==="z"){
                if(i+2 < str.length){
                    if(str[i+2]==="=") i+=2;
                }
            }
            else if(str[i+1]==="-") i++;
        }
        else if(str[i]==="l" || str[i]==="n" && i+1 < str.length){
            if(str[i+1]==="j") i++;
        }
        count++;
    }
    console.log(count);

    rl.close();
}).on("close", () => {
    process.exit();
});