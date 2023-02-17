# Lemonize Programming Challenge

Run the web server with `docker compose up`.

The server can be accessed at http://localhost:9000/ and has the following endpoints:
  * `GET /` &nbsp; "Hello World" html endpoint
  * `GET /yarn` &nbsp; list of all resources
  * `GET /yarn/:id` &nbsp; specific resource, items with ids 1 through 7 exist, any other id will produce a 404