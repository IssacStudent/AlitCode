
//快慢指针查找
var findDuplicate = function (nums) {
    let len = nums.len;
    let slow = 0;
    let fast = 0;
    while (true) {
        slow = nums[slow];
        fast = nums[nums[fast]];
        if (slow == fast) {
            fast = 0; //去除初始的边界
            while (true) {
                if (slow == fast) {
                    return slow;
                }
                slow = nums[slow];
                fast = nums[fast];
            }
        }
    }
};
