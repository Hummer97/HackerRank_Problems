# Java If-else


In this challenge, we test your knowledge of using if-else conditional statements to automate decision-making processes. An if-else statement has the following logical flow:

Images
![If-else](https://s3.amazonaws.com/hr-challenge-images/13689/1446563087-4ec019a919-332px-If-Then-Else-diagram.svg.png)


### Task
Given an integer, **_n_**, perform the following conditional actions:

* If **_n_** is odd, print Weird
* If **_n_** is even and in the inclusive range of _2_ to _5_, print Not Weird
* If **_n_** is even and in the inclusive range of _6_ to _20_, print Weird
* If **_n_** is even and greater than _20_, print Not Weird
* Complete the stub code provided in your editor to print whether or not **_n_** is weird.

### Input Format

A single line containing a positive integer, **_n_**.

## Constraints
```java
1<= n <= 100
```
### Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

**Sample Input 0**
```java
3
```
**Sample Output 0**
```java
Weird
```
**Sample Input 1**
```java
24
```
**Sample Output 1**
```java
Not Weird
```
### Explanation

Sample Case 0: **_n = 3_**

 **_n_** is odd and odd numbers are weird, so we print Weird.

Sample Case 1: **_n = 24_**

 **_n > 20_** and **_n_** is even, so it isn't weird. Thus, we print Not Weird.
