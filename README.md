# package

https://stackoverflow.com/questions/4871656/using-gradle-to-build-a-jar-with-dependencies

```
./gradlew fatJar   
```

To execute

```
java -jar build/libs/s3Transfer-1.0.jar $bucket_name $key
```

# inspired by

https://github.com/awsdocs/aws-doc-sdk-examples/tree/main/java/example_code/s3