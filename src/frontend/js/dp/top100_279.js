/**
 * @param {number} n
 * @return {number}
 */
var numSquares = function (n) {
    let arr = new Array(n + 1).fill(0);
    for (let i = 1; i < n + 1; i++) {
        let min = Infinity;
        for (let j = 1; j * j <= i; j++) {
            min = Math.min(min, arr[i - j * j]);
        }
        arr[i] = min + 1;
    }
    return arr[n];
};
