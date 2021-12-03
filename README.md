TDD by Example
==============

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
