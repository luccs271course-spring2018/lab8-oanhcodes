## COMP 271 002 F17 Lab 8 (Week 10)

#### Top 10 Words in lesmisrables01unkngoog_djvu.txt

1. the = 33278
2. of = 18012
3. and = 12845
4. a = 12449
5. to = 12449
6. in = 9386
7. was = 7788
8. that = 6601
9. he = 6202
10. his = 5529

#### Try using a TreeMap instead of a HashMap. Does this make any difference?
No, there was no difference when I used a TreeMap instead of a HashMap.

#### What happens if you invoke countWords multiple times for different String iterators?

Calling the method countWords with different iterators will create new keys and value pairs in the map. If the a string is not already a key in the map, a new key will be created with a default value of 1. If the string matches an existing key in the map, its value will be incremented by 1.

#### What crucial role does the Iterator abstraction play in making WordCounter testable?

It allows use test our methods without requiring input from the user. We can create many different types of lists and still iterate through the same way to get the word counts. It also allows us to control our test data and ensure that our assertions are correct.