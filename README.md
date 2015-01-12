# swagger-example
Example App with jersey 1.18.2 spring 3.2.9 and swagger for jersey 1.3.12

main purpose is to test swagger-ui functionality

Example Endpoints
-----------------
 * [/rest/string/static/hello](http://localhost:8080/rest/string/static/hello)
 * [/rest/string/static/{string}](http://localhost:8080/rest/string/static/test)

Run example
-----------
 * mvn jetty:run
 * [swagger-ui@localhost](http://localhost:8080/webjars/swagger-ui/2.0.24/index.html)
 * [swagger api-docsi@localhost](http://localhost:8080/api-docs)

used example from : http://www.mkyong.com/webservices/jax-rs/jersey-spring-integration-example/
