import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.io.IOException;
import java.util.Scanner;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.JSONObject;
public class TestAPICall {
    public static void main(String[] args) {
        try {
            //Change the URL to specify category number of questions, difficulty etc.
            URL url = new URL("https://opentdb.com/api.php?amount=10&category=19&difficulty=easy");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("HttpResponseCode" + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    informationString.append(line);
                }
                scanner.close();
                System.out.println(informationString);

                String s = String.valueOf(informationString);
                String[] parts = s.split(":");
//                for (int i = 0; i<parts.length; i++){
//                    System.out.println(parts[i]);
//                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
    }
    }
}
