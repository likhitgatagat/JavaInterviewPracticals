package com.likhit.basic.implementation;

/**
 * 
 * @author GatagatL
 *Bob and Alphabet
Bob has arranged 
N
N boxes in a straight line. Each box has a Latin Character 
(
′
a
′
−
′
z
′
)
(′a′−′z′) written on it. He wants to chain 
26
26 boxes in such a way that the chain starts from box with alphabet 
′
a
′
′a′ and contains all Latin Characters exactly once in increasing lexicographic order, ending at 
′
z
′
′z′. In other words, the chain must form the following sequence: 
 ′
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z
′
′abcdefghijklmnopqrstuvwxyz′

To join a box 
b
i
bi and 
b
j
bj with chain, the length of the chain to be used is 
|
i
−
j
|
|i−j|. 
Help Bob to minimize the total length of the chain used to make the desired sequence.

Input Format:
First line of input contains of a single integer 
T
T - the number of testcases.
Each testcase consists of a single line, which contains a string made up of lowercase Latin Characters - 
′
a
′
′a′ to 
′
z
′
′z′. The string may have one or more occurrences of each character.

Output Format:
For each testcase, print a single integer - the minimum length of chain required to make the required sequence.

Input Constraints:
 1
≤
T
≤
10
1≤T≤10 
 26
≤
|
S
|
≤
10
6
26≤|S|≤106
All 26 characters ('a' - 'z') are present in 
S
S at least once.

Sample Input(Plaintext Link)
 2
abcdefghijklmnopqrstuvwxyz
ceaabcdefghijklmnopqrstuvwxyz
Sample Output(Plaintext Link)
 25
25
Explanation
Testcase 1:
There is only one way to connect the chain for this sequence. The chain starts from 
S
0
S0, then connects to 
S
1
S1, then 
S
2
S2, ... , 
S
25
S25, which creates the sequence 
′
a
b
c
d
e
f
g
h
i
j
k
l
m
n
o
p
q
r
s
t
u
v
w
x
y
z
′
′abcdefghijklmnopqrstuvwxyz′. Hence, the answer for testcase 1 is 
25
25 as the total length of the chain used is:
 (
b
0
−
>
b
1
)
+
(
b
1
−
>
b
2
)
+
.
.
.
+
(
b
24
−
>
b
25
)
=
|
0
−
1
|
+
|
1
−
2
|
+
.
.
.
+
|
24
−
25
|
=
1
+
1
+
.
.
.
+
1
=
25.
(b0−>b1)+(b1−>b2)+...+(b24−>b25)=|0−1|+|1−2|+...+|24−25|=1+1+...+1=25.

Testcase 2:
There are several chain sequences that can possibly be made from the given sequence.
A few of them are:
1. 
S
2
−
>
S
4
−
>
S
0
−
>
S
6
−
>
S
7
−
>
S
8
−
>
.
.
.
−
>
S
25
S2−>S4−>S0−>S6−>S7−>S8−>...−>S25 
2. 
S
3
−
>
S
4
−
>
S
5
−
>
S
6
−
>
.
.
.
−
>
S
25
S3−>S4−>S5−>S6−>...−>S25 
Among the possible chain sequences, the sequence 2. listed above provides the minimum length of chain used.
 */
public class BobAndAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
