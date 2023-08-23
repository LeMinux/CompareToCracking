# CompareToCracking
I had an idea that if a comparision method returned the subtracted indecies directly that it could be used to crack passwords. Java compareTo() does this unlike C strcmp which just returns 0 or 1.

I have only tested with digits, but this can probably work (with some changes) if characters are involved.
Zero was little bit tricky since if the password already contained it, and zero was used as a "distance" measurement it measured the next index.
This was easily fixable though since this would cause the guess to go past in "distance" immediatly and could simply change the previous index to 0.
Any "distance" past or equal to 10 was also determined to be zero.
