package Utility;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

public class AsyncWebService {

    public static void main(String[] args) {
        // Perform some initial processing for your web service
        System.out.println("Web service is starting...");

        // Trigger asynchronous HTTP requests
        CompletableFuture<Void> asyncRequests = triggerAsyncRequests();

        // Continue with other tasks while waiting for HTTP requests to complete
        doOtherTasks();

        // Wait for all async requests to complete
        asyncRequests.join();

        // All HTTP requests have completed
        System.out.println("All asynchronous requests have completed. Web service is ready.");
    }

    private static CompletableFuture<Void> triggerAsyncRequests() {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request1 = HttpRequest.newBuilder()
                .uri(URI.create("http://it.mh-hsc.ac.in/Exam/login"))
                .build();
      
        CompletableFuture<HttpResponse<String>> future1 = httpClient.sendAsync(request1, HttpResponse.BodyHandlers.ofString());
       
        return CompletableFuture.allOf(future1);
    }

    private static void doOtherTasks() {
        // Simulate other tasks that your web service might perform
        System.out.println("Performing other tasks while waiting for async requests to complete...");
        try {
            Thread.sleep(2000); // Simulate some processing time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
