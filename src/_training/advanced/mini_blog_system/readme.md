
# Mini Blog System in Java

## Overview
This project simulates a minimal blog platform where users can:
- Create blog posts
- Add comments to existing posts
- View all posts
- Retrieve a post by its ID

## Technologies
- Java 11+
- JUnit 5

## Classes
- `Post`: Represents a blog post with comments
- `Comment`: Represents a comment left by a user
- `BlogService`: Main service managing posts and comments
- `BlogServiceTest`: JUnit test class for validating the logic

## Example Usage

```java
BlogService blog = new BlogService();
Post p = blog.createPost("Intro", "Welcome to my blog", "Alice");
blog.addCommentToPost(p.getId(), "Bob", "Nice article!");
````

## Running Tests

* Maven: `mvn test`
* Gradle: `gradle test`
* Run via IntelliJ/Eclipse IDE

## Author

````
David RATIANDRAIBE