
# CS301 Module 7 — Skills Demonstration

## Question 1: What are three examples of problems in NP?

NP stands for nondeterministic polynomial time. These are decision problems where, if someone gives us a proposed solution, we can check whether it is correct in polynomial time.

### 1. Boolean Satisfiability Problem (SAT)

SAT asks whether we can assign true or false values to variables in a Boolean expression so that the entire expression becomes true.

For example:

(A OR B) AND (NOT A OR C)

If A = true and C = true, the expression is satisfied.

SAT is in NP because we can quickly substitute the proposed values into the expression and check whether it evaluates to true.

### 2. Traveling Salesperson Problem (TSP)

The decision version of TSP asks whether a salesperson can visit every city exactly once, return to the starting city, and travel a total distance no greater than a given limit.

For example, suppose there are five cities and a distance limit of 100 miles. The question is whether a complete tour exists that stays within that limit.

TSP is in NP because, given a proposed route, we can check that every city was visited exactly once and calculate the total distance efficiently.

### 3. Subset Sum Problem

Subset Sum asks whether some numbers from a given set can add up to a specific target.

For example:

Numbers: {3, 7, 10, 15}
Target: 20

A valid solution is 3 + 7 + 10 = 20.

Subset Sum is in NP because, if someone provides a subset, we can add its numbers and quickly check whether the sum equals the target.


## Question 2: What is the difference between universality, computability, and intractability?

### 1. Universality

Universality means that a general-purpose computer can perform any computation that is possible for a computer to perform, as long as it has enough time and memory.

For example, the same computer can run a calculator, a video game, or a Java program. We do not need a completely different computer for each task.

### 2. Computability

Computability is about whether a problem can be solved by an algorithm at all.

A problem is computable if an algorithm can produce the correct answer and eventually finish for every valid input.

For example, sorting a list of numbers is computable because we can write an algorithm that always sorts the list correctly.

Some problems, such as the Halting Problem, are not computable in general.

### 3. Intractability

Intractability describes problems that can be solved in theory but may require too much time or too many resources to solve efficiently.

For example, finding an exact solution to a large Traveling Salesperson Problem can become extremely difficult as the number of cities increases.

Even though a computer could eventually find an answer using exhaustive search, the amount of time required may make that approach impractical.

### Summary

The main difference is:

- **Universality:** What kinds of computations can a general-purpose computer perform?
- **Computability:** Is there an algorithm that can solve the problem?
- **Intractability:** Can we solve the problem using a practical amount of time and resources?

In my own words, universality is about what a computer is capable of doing, computability is about whether a solution is possible, and intractability is about how difficult it is to find that solution.
