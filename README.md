[![Build Status](https://travis-ci.org/jooby-project/pebble-starter.svg?branch=master)](https://travis-ci.org/jooby-project/pebble-starter)
# pebble starter

[Pebble](http://www.mitchellbosecke.com/pebble/home) template engine starter project.

## quick preview

This project contains a simple application that:

* Render a HTML page using [Pebble](http://www.mitchellbosecke.com/pebble/home) template engine

[App.java](https://github.com/jooby-project/pebble-starter/blob/master/src/main/java/starter/pebble/App.java):

```java
/**
 * Pebble starter project.
 */
public class App extends Jooby {

  {
    /** Template engine: */
    use(new Pebble("templates", ".html"));

    /** Render home: */
    get(() -> Results.html("home")
        .put("name", "Pebble"));

  }

  public static void main(final String[] args) {
    run(App::new, args);
  }

}
```

## run

    mvn jooby:run

## help

* Read the [pebble documentation](http://jooby.org/doc/pebble)
* Join the [channel](https://gitter.im/jooby-project/jooby)
* Join the [group](https://groups.google.com/forum/#!forum/jooby-project)
