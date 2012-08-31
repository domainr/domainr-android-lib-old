package io.nb.domainr.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.nb.domainr.api.model.InfoResult;
import io.nb.domainr.api.model.SearchResult;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Domainr {

    public static SearchResult search(String query) throws IOException, JSONException {
        JSONObject result = request("http://domai.nr/api/json/search?q=", query);

        ObjectMapper objectMapper = new ObjectMapper();
        SearchResult searchResult = objectMapper.readValue(result.toString(), SearchResult.class);

        return searchResult;
    }

    public static InfoResult info(String query) throws IOException, JSONException {
        JSONObject result = request("http://domai.nr/api/json/info?q=", query);

        ObjectMapper objectMapper = new ObjectMapper();
        InfoResult infoResult = objectMapper.readValue(result.toString(), InfoResult.class);

        return infoResult;
    }

    private static JSONObject request(String url, String query) throws IOException, JSONException {

        HttpURLConnection connection = null;
        BufferedReader bufferedReader = null;
        StringBuilder stringBuilder = null;
        String line = null;
        JSONObject response = null;

        try {
            // Connect to the server and fetch the response
            URL address = new URL(url + query);
            connection = (HttpURLConnection) address.openConnection();
            bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            stringBuilder = new StringBuilder();

            // Convert the response to a string
            while ((line = bufferedReader.readLine()) != null)
                stringBuilder.append(line);

            // Convert the string response to a JSONObject
            response = new JSONObject(stringBuilder.toString());
        }

        // Close up the connection, and release all buffers
        finally {
            bufferedReader = null;
            stringBuilder = null;
            if (connection != null)
                connection.disconnect();
            connection = null;
        }

        // Return the response parsed to json
        return response;
    }
}
