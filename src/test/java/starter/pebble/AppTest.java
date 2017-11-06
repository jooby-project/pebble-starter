package starter.pebble;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import org.jooby.test.JoobyRule;
import org.junit.ClassRule;
import org.junit.Test;

public class AppTest {

  /**
   * One app/server for all the test of this class. If you want to start/stop a new server per test,
   * remove the static modifier and replace the {@link ClassRule} annotation with {@link Rule}.
   */
  @ClassRule
  public static JoobyRule app = new JoobyRule(new App());

  @Test
  public void integrationTest() {
    get("/")
        .then()
        .assertThat()
        .body(equalTo("<html>\n"
            + "<head>\n"
            + "    <title>Pebble Starter: Home</title>\n"
            + "</head>\n"
            + "<body>\n"
            + "<div id=\"content\">\n"
            + "    <h1> Home </h1>\n"
            + "<p>This is the <a href=\"http://www.mitchellbosecke.com/pebble/home\">Pebble</a> starter project.</p>\n"
            + "</div>\n"
            + "<div id=\"footer\">\n"
            + "        <a href=\"http://jooby.org/doc/pebble\">http://jooby.org/doc/pebble</a>\n"
            + "    </div>\n"
            + "</body>\n"
            + "</html>\n"))
        .statusCode(200)
        .contentType("text/html;charset=UTF-8");
  }
}
