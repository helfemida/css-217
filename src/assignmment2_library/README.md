# Library Management System

This task is implemented using SOLID principles

## Single Responsibility Principle (SRP):

Each class has a single responsibility:

Book, CD, and Magazine classes represent specific types of items in the library.
LibraryCatalog class manages the items in the catalog.
CLIManager class handles the command-line interface interactions.
Librarian and Patron classes represent different types of users and their actions.


## Open/Closed Principle (OCP):

The system is open for extension by allowing new types of items (Book, CD, Magazine) to be added without modifying existing code.
For example, a new type like DVD could be added by creating a new class that implements LibraryItem.


## Liskov Substitution Principle (LSP):

Each subclass (Book, CD, Magazine) implements the LibraryItem interface, ensuring that they can be substituted for LibraryItem wherever it's expected. This is seen in methods like addItemToCatalog() in LibraryCatalog, which can accept any LibraryItem.

## Interface Segregation Principle (ISP):

Interfaces such as LibraryItem, LibrarianActions, and PatronActions are specific to the needs of their clients (LibraryCatalog, Librarian, Patron). This helps in keeping interfaces focused and avoids unnecessary methods.

## Dependency Inversion Principle (DIP):

LibraryCatalog class depends on the LibraryItem abstraction, not on concrete implementations. This allows for decoupling between the LibraryCatalog and the specific item types (Book, CD, Magazine).