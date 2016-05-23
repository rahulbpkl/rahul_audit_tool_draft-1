## RAT

This package contains a jar file which checks the given code satisfies CERT coding standard. RAT.jar is used to process large number of source code written in java. It won't compile and generate the class file, it will only verifies the coding standard violation. So input should be an error free(completed successful compilation) java file.


 

## Rules Implemented

*   [DCL00-J. Prevent class initialization cycles](https://www.securecoding.cert.org/confluence/display/java/DCL00-J.+Prevent+class+initialization+cycles)
*   [DCL01-J. Do not reuse public identifiers from the Java Standard Library](https://www.securecoding.cert.org/confluence/display/java/DCL01-J.+Do+not+reuse+public+identifiers+from+the+Java+Standard+Library)
*   [DCL02-J. Do not modify the collection's elements during an enhanced for statement](https://www.securecoding.cert.org/confluence/display/java/DCL02-J.+Do+not+modify+the+collection%27s+elements+during+an+enhanced+for+statement)
*   [MSC00-J. Use SSLSocket rather than Socket for secure data exchange](https://www.securecoding.cert.org/confluence/display/java/MSC00-J.+Use+SSLSocket+rather+than+Socket+for+secure+data+exchange)
*   [MSC01-J. Do not use an empty infinite loop](https://www.securecoding.cert.org/confluence/display/java/MSC01-J.+Do+not+use+an+empty+infinite+loop)
*   [MSC02-J. Generate strong random numbers](https://www.securecoding.cert.org/confluence/display/java/MSC02-J.+Generate+strong+random+numbers)
*   [EXP02-J. Do not use the Object.equals() method to compare two arrays](https://www.securecoding.cert.org/confluence/display/java/EXP02-J.+Do+not+use+the+Object.equals%28%29+method+to+compare+two+arrays)
*   [SER05-J. Do not serialize instances of inner classes](https://www.securecoding.cert.org/confluence/display/java/SER05-J.+Do+not+serialize+instances+of+inner+classes)


## Auto Fixes Implemented
*   [MSC01-J. Do not use an empty infinite loop](https://www.securecoding.cert.org/confluence/display/java/MSC01-J.+Do+not+use+an+empty+infinite+loop)
*   [MSC02-J. Generate strong random numbers](https://www.securecoding.cert.org/confluence/display/java/MSC02-J.+Generate+strong+random+numbers)
*   [EXP02-J. Do not use the Object.equals() method to compare two arrays](https://www.securecoding.cert.org/confluence/display/java/EXP02-J.+Do+not+use+the+Object.equals%28%29+method+to+compare+two+arrays)
*   [SER05-J. Do not serialize instances of inner classes](https://www.securecoding.cert.org/confluence/display/java/SER05-J.+Do+not+serialize+instances+of+inner+classes)


## Dependency

Compiled on 

```
openjdk version "1.8.0_45-internal"
```

## Project Structure

* Download the .tar file of latest version from here and unzip the file
* The project file contains three directories.
* config - which contains all the configuration files.
* Sample - which contains some examples of both noncompliant and complaint code.
* output - contains the errorlog file
* rat.jar - which is the actual executable file of the project.
* Before running verify all the four are present.
 

## How To use

Open terminal and type
```
rat -h
```
You will get man page

For detailed information please go to the [wiki page](https://github.com/rahulbpkl/rahul_audit_tool_draft-1/wiki)

 

 
