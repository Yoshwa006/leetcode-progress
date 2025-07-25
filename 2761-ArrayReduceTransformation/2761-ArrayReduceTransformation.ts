// Last updated: 7/25/2025, 8:49:21 AM
type Fn = (accum: number, curr: number) => number

function reduce(nums: number[], fn: Fn, init: number): number {
    let val = init
    nums.forEach((v:number, i:number) => {
        val = fn(val, v)
    })
    return val
};