/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
//Z字查找
var searchMatrix = function (matrix, target) {
    let row = matrix.length;
    let clo = matrix[0].length;
    let ridx = 0;
    let cidx = clo - 1;
    while (ridx < row && cidx >= 0) {
        if (matrix[ridx][cidx] > target) {
            cidx--;
        } else if (matrix[ridx][cidx] < target) {
            ridx++;
        } else {
            return true;
        }
    }

    return false;
};
