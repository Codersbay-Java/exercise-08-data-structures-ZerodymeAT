# Abstrakte Datenstrukturen

## Part 1 und 2
Part 1 und Part 2 findest du in den jeweiligen packages. Für den zweiten Teil gibt es wieder Softwaretests.
Die genauen Anforderungen sind in den jeweiligen READMEs und TODOs.

## Part 3
Beantworte folgende Fragen in eigenen Worten. Es ist eine Wiederholung und Auffrischung. Mit dieser Übung wird die
iterative Programmierung abgeschlossen. Die Beantwortung kann direkt im Markdown erfolgen. Achte auf eine entsprechende
Formatierung. Syntax highlighting wird auch unterstützt und soll entsprechend anwendet werden [markdownguide.org](https://www.markdownguide.org/extended-syntax/#syntax-highlighting).

### Recap Basics

1. Which data types do you know and how are they to be declared?  
***[1] 
int(eger) Ganzzahl <br>
double = Gleitkommazahl mit 16 Kommastellen (doppel so viel bei float)<br>
boolean = True/False<br>
char(acter) = Einzelnes Element aus der Ascii Tbl<br>
String = eigentlich ein Array aus einzelnen Char<br>
byte, short, long***

2. Declare and initialise a variable with a certain value (pay attention to the correct syntax). Overwrite the value with another value.<br>
***[2] int i = 0; 
int j = 2;
i=j+1;***
3. Which operators do you know in detail (logical, relational, and mathematical)?<br>
***[3] Mathe: + - * / % (Modulo - Rest einer Division 12%5=2) <br>
logical: || = Oder, && = Und, ! = nicht
relational: == = Gleich, != = Ungleich, < = Kleiner, <= Kleinergleich, > = Größer, >= = Größergleich***
4. What are the main differences between the if branch and the switch branch?<br>
***[4] If ist eine Prüfung und Switch wechselt lediglich hardgecodete Inhalte***
5. Which loops do you know? Brief description of the differences.<br>
***[5] while{} wird so lange wiederholt bis die Abbruchbedingung am ANFANG erreicht ist.<br>
do{}while{} wie while, jedoch ist die Abburchbedingung am ENDE angegeben und wird min. 1x durchlaufen.<br>
for{i=0; i<=n;i++} verwendet eine Variable um die Durchgänge zu zählen (erster Wert), Abbruchbedingung (zweiter Wert),Was am Ende gemacht wird (dritter Wert) 
for(each){Datentyp : Array} Ähnlich for, greift aber nur lesend auf ein Array zu***
6. Describe the syntax in detail of the for loop and the while loop, what's the main difference? Are they equally powerful?<br>
***[6] bei der while, muss die Variable außerhalb deklariert werden (mehr Zeilen), allerdings auch schneller, sollte die Abbruchbedingung direkt erfüllt sein.<br>*** 
7. Print the numbers 1 to 10 with a specific loop that you can choose yourself.<br>
***[7] <br>`int number = 1; int max = 10;` <br>
`for(i = 0, i <= max, i++ ){`<br>
`System.out.println(i);`<br>
`}`<bR>***


#### Methods
1. Why should we use methods? <br>
***[1] Zum Zerlegen des Codes, macht Elemente auch leicht wiederverwendbar***
2. Declare a simple method and describe the structure in detail. Which keywords are important?<br>
***[2] `public boolean theEasyWay();` <br>erstellt eine öffentliche Methode in der ein Wahr/Falsch wert returniert werden muss.***
3. Which return types do you know?<br>
***[3] void oder ohne = muss keinen Wert retournieren, sonst halt die Datentypen, welche ein return forcen***
4. Declare a method with every return type you know.<br>
***[4]wurde in Frage 3 beantwortet.<br>
`public static int question(){`<br>
`int i = 2;`<br>
`return i;}`<br>***

#### Arrays
1. What is an array? 
***[1]<br> Eine Ansammlung von Elementen eines Datentypes***
2. Are arrays dynamic? <br> 
***[2]Jein - Ein normales Array hat eine fixe Strukturvorgabe, ein ArrayList, wie in Part1 verwendet, ist allerdings dynamisch.***
3. Can arrays have more than one dimension? <br> ***[3] Ja***
4. Do you need to know the size of arrays during compile time?<br> ***[4] Ja***
5. Which types can arrays have?<br> ***[5] Nur ein Datentyp je Array***
6. Declare arrays in two different ways. At least one one-dimensional and one multidimensional array.<br>
***[6]<br>
`int[] oneDimension = new int[3];`<br>
`oneDimension[0] = 0;`<br>
`oneDimension[1] = 8;`<br>
`oneDimension[2] = 15;`  <br>***
`int[][] twoDimension = {{1,20, 23},{0,8,15}}`<br>
7. Sort an arbitrary integer array. Use any algorithm you like.
***[7] <br>
`static void bubbleSort(int[] arr) {`<br>
`int n = arr.length;`<br>
`int temp = 0;`<br>
`for(int i=0; i < n; i++){`<br>
`for(int j=1; j < (n-i); j++){`<br>
`if(arr[j-1] > arr[j]){`<br>
`temp = arr[j-1];`<br>
`arr[j-1] = arr[j];`<br>
`arr[j] = temp;`<br>`}}}`
8. Print out a two-dimensional array.
`int[][] twoDimension = {{1,20, 23},{0,8,15}};`<br>
`for (int i = 0; i < twoDimension.length; ++i) {`<br>
`for(int j = 0; j < twoDimension[i].length; ++j) {`<br>
`System.out.print(twoDimension[i][j] + " ");}}`<br>

---
>WICHTIG: Nicht auf das SonarLint Plugin vergessen und entsprechend sauber programmieren. <br>
**Do not repeat yourself**.