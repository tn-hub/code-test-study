const input = require('fs').readFileSync('/dev/stdin');

let cnt = 0, i = 0, result = "";

while (true) {
  i++;
  cnt+=i;
  if(cnt >= input){
    if(i%2 == 0){ // 짝수
      result = (input-cnt+i) + "/"+(cnt-input+1);
    } else { // 홀수
      result = (cnt-input+1) + "/"+(input-cnt+i);
    }
    break;
  }
}

console.log(result);