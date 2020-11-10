# 

We use the integers **_a_**, **_b_**, and **_n_**  to create the following series:

**_(a + 2<sup>0</sup> . b), (a + 2<sup>0</sup> . b + 2<sup>1</sup> . b),....., (a + 2<sup>0</sup> . b + 2<sup>1</sup> . b + 2<sup>1</sup> . b + .... + 2<sup>n-1</sup> . b)_** 

You are given **_q_** queries in the form of **_a_**, **_b_**, and **_n_**. For each query, print the series corresponding to the given , , and  values as a single line of **_n_** space-separated integers.

## Input Format

The first line contains an integer, **_q_**, denoting the number of queries.

Each line **_i_** of the **_q_** subsequent lines contains three space-separated integers describing the respective $a^2$, , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values.