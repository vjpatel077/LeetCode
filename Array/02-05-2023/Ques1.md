# [1828. Queries on Number of Points Inside a Circle](https://leetcode.com/problems/queries-on-number-of-points-inside-a-circle/description/)

You are given an array `points` where `points[i] = [x<sub>i</sub>, y<sub>i</sub>]` is the coordinates of the `i^th` point on a 2D plane. Multiple points can have the **same**  coordinates.

You are also given an array `queries` where `queries[j] = [x<sub>j</sub>, y<sub>j</sub>, r<sub>j</sub>]` describes a circle centered at `(x<sub>j</sub>, y<sub>j</sub>)` with a radius of `r<sub>j</sub>`.

For each query `queries[j]`, compute the number of points **inside**  the `j^th` circle. Points **on the border**  of the circle are considered **inside** .

Return an array `answer`, where `answer[j]` is the answer to the `j^th` query.

**Example 1:** 
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/25/chrome_2021-03-25_22-34-16.png" style="width: 500px; height: 418px;">

```
Input: points = [[1,3],[3,3],[5,3],[2,2]], queries = [[2,3,1],[4,3,1],[1,1,2]]
Output: [3,2,2]
<b>Explanation: </b>The points and circles are shown above.
queries[0] is the green circle, queries[1] is the red circle, and queries[2] is the blue circle.
```

**Example 2:** 
<img alt="" src="https://assets.leetcode.com/uploads/2021/03/25/chrome_2021-03-25_22-42-07.png" style="width: 500px; height: 390px;">

```
Input: points = [[1,1],[2,2],[3,3],[4,4],[5,5]], queries = [[1,2,2],[2,2,2],[4,3,2],[4,3,3]]
Output: [2,3,2,4]
<b>Explanation: </b>The points and circles are shown above.
queries[0] is green, queries[1] is red, queries[2] is blue, and queries[3] is purple.
```

**Constraints:** 

- `1 <= points.length <= 500`
- `points[i].length == 2`
- `0 <= x<sub>​​​​​​i</sub>, y<sub>​​​​​​i</sub> <= 500`
- `1 <= queries.length <= 500`
- `queries[j].length == 3`
- `0 <= x<sub>j</sub>, y<sub>j</sub> <= 500`
- `1 <= r<sub>j</sub> <= 500`
- All coordinates are integers.

**Follow up:**  Could you find the answer for each query in better complexity than `O(n)`?


# [Solution](https://github.com/vjpatel077/LeetCode/blob/master/Array/02-05-2023/Sol1.java)
