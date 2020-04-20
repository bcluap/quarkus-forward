


import static io.restassured.RestAssured.given;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@QuarkusTest
public class MyTest {

    private static final Logger log = LoggerFactory.getLogger(MyTest.class);


    @Test
    public void testFilter() {

        given().get("/test").then().statusCode(200);
        given().get("/a.html").then().statusCode(200);
        given().get("/forward?to=/a.html").then().statusCode(200);
        
        // Should work but gets 404
        given().get("/forward?to=/test").then().statusCode(200);
        
    }

}
