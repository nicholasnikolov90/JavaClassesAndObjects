# Tile report
Author: Nick Nikolov

## UML class diagram
```plantuml
@startuml

+class Tile{
~letter : char
~value : int

~Tile()
~Tile(l : char, v : int)

+toString() : String
+equals(b : Tile): boolean
+main(args : String[]) : void
}
@enduml
```


## Specification
The class Tile represents a tile used in the board game scrabble, each tile contains a letter and a point value and allows for the comparison between two tiles to check for equivalence


## Execution and Testing
This screenshot shows successful execution and test of the Tile class
![Example screenshot](TileScreenshot.png)


This screenshot shows the UML diagram of the Tile class
![Example screenshot](TileUML.png)


# Reflection
I didn't understand clearly the purpose of the Tile program. The temperature program was much clearer about the objective of the program. I would have liked Tile better if I understood the purpose.
