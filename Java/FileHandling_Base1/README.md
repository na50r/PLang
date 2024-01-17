# File Handling & String Ops: Filter
## Goal
* So I want to implement a little program that takes `.txt` files as input, does something to them and creates a *modified* `txt` as an output.
* This *modiciation* can vary, so we need basically only 3 classes
* `FileToArray`: Turns the `txt` to an `String[]` with which we can work
* `ProcessingFunc`: A function that is used to do some stuff ot the `String[]`, for the time being we stick to some filters, like censorship filters. We can modify part further one.
* `ArrayToFile`: Turns the array of strings back to a file.

### FileToArray
* Implementation works for the most part.
* Here is the thing that is used for file handling
```java
import java.io.*;

...
BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
//Used to figure to get the file
```
* Here is the thing that is used to figure out the length of the array (probably better ways to do this tbh)

```java
int lines= 0;
while(reader.readLine()!=null){lines++}
reader.close()
//Figures out the number of elements needed in the String[] array
```

* Here is the thing that transforms the file to an array
```java
reader = new BufferedReader(new FileReader("file.txt"));
//Resets previous one
String[] data = new String[lines];
int idx = 0;
while((output=reader.readLine())!=null){
    data[idx]=output;
    idx++;
}
reader.close()
return data
```

## ProcessingFunc: Censor1
* A simple implementation of a censor function that bleeps a selected censor of a given array of strings.

```java
String[] words = {"OwO", "OmO", "OuO"};
String curse = "O";
String bleep = "Q";
int n = words.length;
for(int i = 0; i<n; i++){
    if(words[i].toLowerCase().contains(curse.toLowerCase())){
        String replacement = words[i].toLowerCase().replace(curse.toLowerCase(),bleep);
        words[i] = replacement;
    }
}
return words; //[QwQ, QmQ, QuQ]
```

# Usage
* Make a `txt` file with stuff in it
* Pass it's name (string) into a `FileToArray` object
* Perform `Extractor` and store the returned array of strings
* Pass the array of strings, curse and bleep word into a `Censor1` object
* Perform filter and store it and then you can print the filtered array.