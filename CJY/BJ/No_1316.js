const rl = require("readline").createInterface({input: process.stdin, output: process.stdout});
let n = 0;
let cnt;

rl.on("line", (s) => {
    if(n > 0) {
        let arr = Array.from({length: 26}, () => false);
        for (let j = 0, len = s.length; j < len; j++) {
            if(j > 0 && s.charAt(j) !== s.charAt(j -1) && arr[s.charCodeAt(j) - 97]) {
                cnt--;
                break;
            }
            arr[s.charCodeAt(j) - 97] = true;
        }
        n--;
        if(n === 0) {
            console.log(cnt);
            rl.close();
        }
    } else {
        n = parseInt(s);
        cnt = n;
    }
}).on("close", () => {process.exit();});