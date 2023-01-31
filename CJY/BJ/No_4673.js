let n = [];
for(let i = 1; i <= 10000; i++) {
    let s = 0;
    let t = i;
    while(t){
        s += t % 10
        t = ~~(t / 10)
    }
    n[i - 1] = s;
}

let a = "";
for(let i = 1; i <= 10000; i++) {
    for(let j = 1; j <= i; j++) {
        if(i - j - n[j - 1] === 0) break;
        if(i === j) a += i + "\n";
    }
}
console.log(a);