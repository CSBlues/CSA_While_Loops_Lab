# Count Factors
Write a static method named `countFactors` that accepts an integer parameter and returns the number of factors. 

### Example Call:
```java
countFactors(24);
```
### Example Output:
```commandline
8
```
# Is Prime
Write a static method named `isPrime` that accepts an integer parameter and returns a boolean whether or not the number is prime. `isPrime` **must use** `countFactors`.

### Example Call:
```java
isPrime(27);
isPrime(47);
```
### Example Output:
```commandline
true
false
```
# Count Primes
Write a static method named `countPrimes` that accepts an integer parameter (n) and returns the number of primes between 2 an n. `countPrims` **must use** `isPrime`.

### Example Call:
```java
countPrimes(24);
```
### Example Output:
```commandline
9
```
> *Note: countPrimes(24) returns 9 because 2,3,5,7,11,13,17,19,23 are all primes.*