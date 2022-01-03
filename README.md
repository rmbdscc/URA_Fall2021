# URA_Fall2021

## General info
This project shows the usage of Gradle plugins to pre-process Java comments and generate multi-release jar files.

## Usage
After `./gralew build` it creates hierarchy structure of pre-processed Java files in `build/jcp` and the duplicated files are removed.

## Extend
To build another directory with a different Java version, add another task 
`task compileWithJavaX()` 
with appropriate direction name `def java_dir = 'build/jcp/javaX` and define `vars = [currentJava: 'X']`

## To be done
Explore the approaches to add build.gradle for sub-projects

## References
1.  Java Comment Preprocess (JCP): https://github.com/raydac/java-comment-preprocessor
2.  Multi-release Jar: https://github.com/melix/mrjar-gradle
3.  Multi-release JARs - Good or bad idea? https://blog.gradle.org/mrjars
4.  Working With Files https://docs.gradle.org/current/userguide/working_with_files.html#sec:locating_files
5.  Build Cache https://docs.gradle.org/current/userguide/build_cache.html

