TDD by Example
==============

Code for Section 3 "Test Driven Development by Example" in "Testing Spring Boot" course.

History
-------
* Multi-Currency Money
    * Technical Requirements (need to be able):
        * to add amounts in 2 different currencies and convert result given a set of exchange rates
        * to multiply an amount by a number and receive an amount
* Degenerate Objects
    * Testing side effects
        * Create immutable objects
* Test Equality
* Implement privacy
* Add another currency - Franc
    * need: 
        * eliminate Dollar/Franc duplication
        * common equals()/times() methods
* Implement common equality in abstract super class
    * need:
        * compare Francs with Dollars
* Use getClass() to compare Francs with Dollars
* Make objects using factory methods
    * Reduce the direct references to subclasses
* Add currency property to Money
* Eliminate duplication of method times(int)
* Get rid of subclasses
* Make minimum implementation of addition to have green test
    * add Expression and Bank
* Implement Bank reduce method without conversion yet
    * refactor method reduce to Expression interface
    * add Sum as implementation of Expression
* Implement reducing with conversion
    * add Pair to represent currency pairs within Bank
    * add conversion rate to Bank
    * change reduce method to accept Bank
* Implement mixed addition
    * reduce operands in Sum before addition
    * move method plus to Expression
* Implement plus() on Sum
* Add times() to Expression, implement times() on Sum
