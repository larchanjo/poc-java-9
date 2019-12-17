//package com.example;
//
//import java.io.IOException;
//import java.net.URI;
//import java.net.URISyntaxException;
//import jdk.incubator.http.HttpClient;
//import jdk.incubator.http.HttpRequest;
//import jdk.incubator.http.HttpResponse;
//import jdk.incubator.http.HttpResponse.BodyHandler;
//
//public class HttpClientTest {
//
//  public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
//    HttpRequest httpRequest = HttpRequest.newBuilder()
//        .uri(new URI("https://postman-echo.com/get"))
//        .GET()
//        .build();
//
//    HttpResponse<String> httpResponse = HttpClient.newHttpClient()
//        .send(httpRequest, BodyHandler.asString());
//
//    System.out.println(httpResponse);
//  }
//
//}
