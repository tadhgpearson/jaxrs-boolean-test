Tadhg's Boolean Test
====================

Quick test to compare the behaviour of boolean primitives vs objects on Jersey + JAX-RS with Hibernate Validator.

Based on [Pierre Roudier's JaxRS-Jersey-Tomcat](https://github.com/proudier/jaxrs-jersey-tomcat) - thanks!

To test

1. Build with Maven.
2. Deploy the WAR.
3. Call the endpoint like so `curl -X POST http://localhost:8080/jaxrs-jersey-tomcat/booleans -H 'content-type: application/json' -d '{ "primitive": true, "object": true }'`.

Modify `src/main/java/ie/tadhgpearson/jaxrsbooleans/BooleanTest.java` to change the behaviour
