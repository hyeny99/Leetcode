# ๐บ Hyeny's Leetcode ๐บ 
### ~ inspired by ๐[qiyuangong](https://github.com/qiyuangong/leetcode)'s leetcode page ~

<br />I am currently doing a daily challenge on leetcode. This page is upadated daily.
<br />My solutions are accepted yet might not be the most efficient ones.
<br />Please share with me if you have better solutions or you can improve my codes (space complexity-wise and running time-wise)!
<br />See more about my activities, posts and updates ๐Visit my [leetcode](https://leetcode.com/hyeny99/)!

 Problem Title | Difficulty | Solution | Description 
 --- | --- | --- | ---
 [#1. Two Sum](https://leetcode.com/problems/two-sum/) | easy | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/TwoSum.java) | target - a[i] check if the value is found in the array
 [#3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/Longest.java) | ---
 [#7. Reverse Integer](https://leetcode.com/problems/reverse-integer/) | easy | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/ReverseInteger.java) | read the number backwards(use %) and check if the reverse calculation is equal to the previous value.
 [#45. Jump Game II](https://leetcode.com/problems/jump-game-ii/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/JumpGame2.java) | create an array of farthest indices. How far can it jump from here?
 [#65. Valid Number](https://leetcode.com/problems/valid-number/) | hard | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/ValidNumber.java) | Regex (detailed explanation in the java docs)
 [#102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/BTLevel.java) | Use Queue to store the current root. Pull the first element, offer the root's children nodes if there are any
 [#109. Convert Sorted List to Binary Search Tree](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/) | medium | [java](https://github.com/hyeny99/Leetcode/blob/main/java/List2BST.java) | Recursive function: Find a median and call the function itself with its left subtree and right subtree
 [#114. Flatten Binary Tree to Linked List](https://leetcode.com/problems/flatten-binary-tree-to-linked-list/) | medium | [Java] | Method1) Read the tree in right-left-parent order<br />Method2) Morris Traversal
 [#204. Count Primes](https://leetcode.com/problems/count-primes/) | easy | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/CountPrimes.java) | sieve of Eratosthenes(table of prime numbers) <br /> Running time: O(n log log n)
 [#304. Range Sum Query 2D - Immutable](https://leetcode.com/problems/range-sum-query-2d-immutable/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/NumMatrix.java) | use two for loops(or while loops) to retrieve the matrix's rows and columns
 [#318. Maximum Product of Word Lengths](https://leetcode.com/problems/maximum-product-of-word-lengths/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/MaxProString.java) | Two ways to solve:<br />1. create 2d matrix<br />2. use bitmask (a-0, b-1, c-2,... so on)
 [#583. Delete Operation for Two Strings](https://leetcode.com/problems/delete-operation-for-two-strings/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/Delete4Two.java) | make a table to find the longest common substring (O(m*n))
 [#609. Find Duplicate File in System](https://leetcode.com/problems/find-duplicate-file-in-system/) | medium | [Java] | ---
 [#630. Course Schedule III](https://leetcode.com/problems/course-schedule-iii/) | hard | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/Course3.java) | 1. sort the array by last date of the course <br />2. Implement Priority Queue to construct a maxHeap
 [#665. Non-decreasing Array](https://leetcode.com/problems/non-decreasing-array/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/NonDecreasing.java) | 1. modify the first found element that is violating the order (a[i] > a[i+1]) <br />2. find the pattern: move i by one to the next index. compare a[i-1] to a[i+1] if a[i+1] exists.
 [#709. To Lower Case](https://leetcode.com/problems/to-lower-case/) | easy | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/ToLowerString.java) | ASCII code :<br />Upper case 'A' <= char <= 'Z' to Lower case char + ('a' - 'A')
 [#745. Prefix and Suffix Search](https://leetcode.com/problems/prefix-and-suffix-search/) | hard | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/WordFilter.java) | Tries (tree like structure)
 [#816. Ambiguous Coordinates](https://leetcode.com/problems/ambiguous-coordinates/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/Ambiguous.java) | 1. find all coordinates <br />2. find all combinations with a dot. <br />3. check the validity
 [#890. Find and Replace Pattern](https://leetcode.com/problems/find-and-replace-pattern/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/FRPattern.java) | assign an integer to each character (ex. abb -> 122)
 [#906. Super Palindromes](https://leetcode.com/problems/super-palindromes/) | hard | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/SPalindromes.java) | Break down into a smaller range (avoid running time exceed) Square root: 10^18 -> 10^9 <br />Only need to check the first half of the string (ex. 123 can be 12321 or 123321) 10^9 -> 10^5
 [#1354. Construct Target Array With Multiple Sums](https://leetcode.com/problems/construct-target-array-with-multiple-sums/) | hard | [Java] | 1. Find the max using Priority Queue (Max Heap) <br />2. modulo (ex.[10,3] -> [(10-3),3] -> [4,3] -> [1,3] can be done faster [10%3,3])
 [#1423. Maximum Points You Can Obtain from Cards](https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/) | medium | [Java] | ---
 [#1480. Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | easy | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/OneDArray.java) | Use a for loop to get the sum of the array
 [#1689. Partitioning Into Minimum Number Of Deci-Binary Numbers](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/) | medium | [Java](https://github.com/hyeny99/Leetcode/blob/main/java/DeciBinary.java) | find the max digit!

 
 

 




