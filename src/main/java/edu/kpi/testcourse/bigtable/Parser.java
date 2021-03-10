package edu.kpi.testcourse.bigtable;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.nimbusds.jose.shaded.json.parser.JSONParser;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Parser {
  public Root parse(){

    Root root = new Root();
    JSONParser parser = new JSONParser();

    try (FileReader reader = new FileReader("user.json")){
      ;

      JSONObject rootJsonObject = (JSONObject) parser.parse(reader);

      String name = (String) rootJsonObject.get("name");

      root.setName(name);

      return root;
    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }
}
