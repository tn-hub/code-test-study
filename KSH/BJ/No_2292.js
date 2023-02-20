const input = require('fs').readFileSync('/dev/stdin');

let range = 2, count = 1;

if(input != 1){
  while (range <= input) {
    range += 6 * count;
    count++;
  }
}

console.log(count);