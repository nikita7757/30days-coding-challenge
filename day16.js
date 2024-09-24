
function gcd(a, b) {
    if (b === 0) {
        return a;
    }
    return gcd(b, a % b);
}


function lcm(a, b) {
    return (a * b) / gcd(a, b);
}

let N = parseInt(prompt("Enter the first number (N): "));
let M = parseInt(prompt("Enter the second number (M): "));


let result = lcm(N, M);

console.log(`LCM of ${N} and ${M} is: ${result}`);
alert(`LCM of ${N} and ${M} is: ${result}`);
