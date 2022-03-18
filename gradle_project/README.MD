## General info
This folder contains all files needed to run this project

## Usage
To creates pre-processed Java files in `build/jcp`, run `./gradlew build` or `./gradlew assemble`<br />
To clean the generated files, run `./gradlew clean` pre-processed Java files<br />
To execute the generated multi-release jar, run the command:<br />
`java -jar build/libs/jar_file_name.jar`<br />
The source Java files can be found in `src/main/java` folder

## References
1.  Java Comment Preprocess (JCP): https://github.com/raydac/java-comment-preprocessor
2.  Multi-release Jar: https://github.com/melix/mrjar-gradle
3.  Multi-release JARs - Good or bad idea? https://blog.gradle.org/mrjars
4.  Working With Files https://docs.gradle.org/current/userguide/working_with_files.html#sec:locating_files
5.  Build Cache https://docs.gradle.org/current/userguide/build_cache.html
