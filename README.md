# htmltohiccup

Web application to convert HTML to Hiccup, inspired by http://html2haml.heroku.com/ 

## Prerequisites

You will need [Leiningen][1] 2.0.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein run

### Running with Docker

Since htmltohiccup depends on older versions of Java, Clojure and Leiningen, you
might not want to change your existing environment to run htmltohiccup. In order
to workaround this, you can use the Dockerfile in this repository to build and
run the service in a container.

    docker build -t htmltohiccup .
    docker run -it -p 3005:8080 htmltohiccup

Once you see the message `Started on port 8080`, the application is ready to
respond on `localhost:3005` (port defined in the `docker run` command)

## License

Copyright © 2013 Sean Brewer

Distributed under the Eclipse Public License, the same as Clojure.
