package supports;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;

public class LeitorJson {

    private static final String JSONFILEPATH = "/src/test/java/jsondatas/";
    private final JSONParser parser = new JSONParser();
    private JSONObject jsonDataObject = null;

    public Object getJsonFileName(String jsonFileName) throws IOException, ParseException {

        Object jsonFileObject = parser
                .parse(new FileReader(System.getProperty("user.dir") + JSONFILEPATH + jsonFileName));
        jsonDataObject = (JSONObject) jsonFileObject;

        assert jsonDataObject != null;
        return jsonFileObject;
    }

    public JSONObject getJsonDataObject(String dataGroup) {
        return (JSONObject) jsonDataObject.get(dataGroup);
    }
}
