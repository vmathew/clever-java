/*
 * Clever API
 * The Clever API
 *
 * OpenAPI spec version: 2.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.ApiException;
import io.swagger.client.model.EventResponse;
import io.swagger.client.model.EventsResponse;
import io.swagger.client.model.NotFound;
import io.swagger.client.auth.OAuth;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventsApi Classes
 */
public class EventsApiClassTest {

    private final ApiClient client = Configuration.getDefaultApiClient();
    private final EventsApi api = new EventsApi();

    @Test
    public void getEventsClassTest() throws ApiException {
        OAuth oauth = (OAuth) client.getAuthentication("oauth");
        oauth.setAccessToken("TEST_TOKEN");
        Integer limit = 1;
        String startingAfter = null;
        String endingBefore = null;
        String school = null;
        List<String> recordType = null;
        EventsResponse response = api.getEvents(limit, startingAfter, endingBefore, school, recordType);
        for (EventResponse eventResp : response.getData()) {
            String eventClass = eventResp.getData().getClass().toString();
            boolean match = eventClass.matches(".*Created") || eventClass.matches(".*Updated") || eventClass.matches(".*Deleted");
            assertTrue(String.format("Event object class is not expected: %s", eventClass), match);
        }
    }

}
