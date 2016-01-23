package fixtures.url;

import fixtures.url.models.ErrorException;
import fixtures.url.models.UriColor;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class QueriesTests {
    private static AutoRestUrlTestService client;

    @BeforeClass
    public static void setup() {
        client = new AutoRestUrlTestServiceImpl("http://localhost.:3000");
    }

    @Test
    public void getBooleanTrue() throws Exception {
        client.getQueriesOperations().getBooleanTrue(true);
    }

    @Test
    public void getBooleanFalse() throws Exception {
        client.getQueriesOperations().getBooleanFalse(false);
    }

    @Test
    public void getBooleanNull() throws Exception {
        client.getQueriesOperations().getBooleanNull(null);
    }

    @Test
    public void getIntOneMillion() throws Exception {
        client.getQueriesOperations().getIntOneMillion(1000000);
    }

    @Test
    public void getIntNegativeOneMillion() throws Exception {
        client.getQueriesOperations().getIntNegativeOneMillion(-1000000);
    }

    @Test
    public void getIntNull() throws Exception {
        client.getQueriesOperations().getIntNull(null);
    }

    @Test
    public void getTenBillion() throws Exception {
        client.getQueriesOperations().getTenBillion(10000000000L);
    }

    @Test
    public void getNegativeTenBillion() throws Exception {
        client.getQueriesOperations().getNegativeTenBillion(-10000000000L);
    }

    @Test
    public void getLongNull() throws Exception {
        client.getQueriesOperations().getLongNull(null);
    }

    @Test
    public void floatScientificPositive() throws Exception {
        client.getQueriesOperations().floatScientificPositive(1.034E+20);
    }

    @Test
    public void floatScientificNegative() throws Exception {
        client.getQueriesOperations().floatScientificNegative(-1.034E-20);
    }

    @Test
    public void floatNull() throws Exception {
        client.getQueriesOperations().floatNull(null);
    }

    @Test
    public void doubleDecimalPositive() throws Exception {
        client.getQueriesOperations().doubleDecimalPositive(9999999.999);
    }

    @Test
    public void doubleDecimalNegative() throws Exception {
        client.getQueriesOperations().doubleDecimalNegative(-9999999.999);
    }

    @Test
    public void doubleNull() throws Exception {
        client.getQueriesOperations().doubleNull(null);
    }

    @Test
    public void stringUrlEncoded() throws Exception {
        client.getQueriesOperations().stringUrlEncoded("begin!*'();:@ &=+$,/?#[]end");
    }

    @Test
    public void stringEmpty() throws Exception {
        client.getQueriesOperations().stringEmpty("");
    }

    @Test
    public void stringNull() throws Exception {
        try {
            client.getQueriesOperations().stringNull(null);
        } catch (ErrorException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter stringPath is required"));
        }
    }

    @Test
    public void enumValid() throws Exception {
        client.getQueriesOperations().enumValid(UriColor.GREEN_COLOR);
    }

    @Test
    public void enumNull() throws Exception {
        try {
            client.getQueriesOperations().enumNull(null);
        } catch (ErrorException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter enumPath is required"));
        }
    }

    @Test
    public void byteMultiByte() throws Exception {
        client.getQueriesOperations().byteMultiByte("啊齄丂狛狜隣郎隣兀﨩".getBytes("UTF-8"));
    }

    @Test
    public void byteEmpty() throws Exception {
        client.getQueriesOperations().byteEmpty("".getBytes("UTF-8"));
    }

    @Test
    public void byteNull() throws Exception {
        try {
            client.getQueriesOperations().byteNull(null);
        } catch (ErrorException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter bytePath is required"));
        }
    }

    @Test
    public void dateValid() throws Exception {
        client.getQueriesOperations().dateValid(new LocalDate(2012, 1, 1));
    }

    @Test
    public void dateNull() throws Exception {
        try {
            client.getQueriesOperations().dateNull(null);
        } catch (ErrorException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter datePath is required"));
        }
    }

    @Test
    public void dateTimeValid() throws Exception {
        client.getQueriesOperations().dateTimeValid(new DateTime(2012, 1, 1, 1, 1, 1, DateTimeZone.UTC));
    }

    @Test
    public void dateTimeNull() throws Exception {
        try {
            client.getQueriesOperations().dateTimeNull(null);
        } catch (ErrorException ex) {
            Assert.assertTrue(ex.getMessage().contains("Parameter dateTimePath is required"));
        }
    }

    @Test
    public void arrayStringCsvValid() throws Exception {
        List<String> query = new ArrayList<>();
        query.add("ArrayQuery1");
        query.add("begin!*'();:@ &=+$,/?#[]end");
        query.add(null);
        query.add("");
        client.getQueriesOperations().arrayStringCsvValid(query);
    }

    @Test
    public void arrayStringCsvNull() throws Exception {
        client.getQueriesOperations().arrayStringCsvNull(null);
    }

    @Test
    public void arrayStringCsvEmpty() throws Exception {
        client.getQueriesOperations().arrayStringCsvEmpty(new ArrayList<String>());
    }

    @Test
    public void arrayStringSsvValid() throws Exception {
        List<String> query = new ArrayList<>();
        query.add("ArrayQuery1");
        query.add("begin!*'();:@ &=+$,/?#[]end");
        query.add(null);
        query.add("");
        client.getQueriesOperations().arrayStringSsvValid(query);
    }

    @Test
    public void arrayStringTsvValid() throws Exception {
        List<String> query = new ArrayList<>();
        query.add("ArrayQuery1");
        query.add("begin!*'();:@ &=+$,/?#[]end");
        query.add(null);
        query.add("");
        client.getQueriesOperations().arrayStringTsvValid(query);
    }

    @Test
    public void arrayStringPipesValid() throws Exception {
        List<String> query = new ArrayList<>();
        query.add("ArrayQuery1");
        query.add("begin!*'();:@ &=+$,/?#[]end");
        query.add(null);
        query.add("");
        client.getQueriesOperations().arrayStringPipesValid(query);
    }
}
