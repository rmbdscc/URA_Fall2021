## General info
This project shows the usage of Gradle plugins to pre-process Java comments and generate multi-release jar files.

## Usage
After `./gralew build` it creates hierarchy structure of pre-processed Java files in `build/jcp` and the duplicated files are removed.

## Extend
To build another directory with a different Java version, add another task 
`task compileWithJavaX()` 
with appropriate direction name `def java_dir = 'build/jcp/javaX` and define `vars = [currentJava: 'X']`

## To be done:
Explore the approaches to add build.gradle for sub-projects


