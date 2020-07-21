# Homework

TDD a `Library` class with a collection of `Book`s.

## MVP
* `Book`s should have title, author and genre.
* Write a method to count the number of books in the `Library`.
* Write a method to add a `Book` to the `Library` stock.
* Add a capacity to the `Library` and write a method to check if stock is full before adding a `Book`.

## Extensions:
* Add a `Borrower` class which interacts with the other two. The `Library` loans a `Book` to a `Borrower` -
  - a `Borrower` would add a `Book` to their collection once the `Library` has checked the stock

## Advanced Extension
* The `Library` wants to keep track of it's number of `Book`s by genre. Using a `HashMap`, store the genre of each `Book` as the key - and a count of how many `Book`s of that genre as the value.
