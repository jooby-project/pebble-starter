package starter.pebble;

import org.jooby.Jooby;
import org.jooby.Results;
import org.jooby.pebble.Pebble;

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
