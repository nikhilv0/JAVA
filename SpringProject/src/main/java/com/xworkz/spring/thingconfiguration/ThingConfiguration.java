package com.xworkz.spring.thingconfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.net.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")
public class ThingConfiguration {
    public ThingConfiguration() {
        System.out.println("ThingConfiguration Constructor");
    }

    @Bean
    public InputStream inputStreamBean() {
        System.out.println("Creating InputStream Bean");
        return new ByteArrayInputStream("example".getBytes());
    }

    @Bean
    public OutputStream outputStreamBean() {
        System.out.println("Creating OutputStream Bean");
        return new ByteArrayOutputStream();
    }

    @Bean
    public Reader readerBean() {
        System.out.println("Creating Reader Bean");
        return new StringReader("example");
    }

    @Bean
    public Writer writerBean() {
        System.out.println("Creating Writer Bean");
        return new StringWriter();
    }

    @Bean
    public URL urlBean() throws MalformedURLException {
        System.out.println("Creating URL Bean");
        return new URL("https://example.com");
    }

    @Bean
    public URI uriBean() throws URISyntaxException, URISyntaxException {
        System.out.println("Creating URI Bean");
        return new URI("https://example.com");
    }

    @Bean
    public HttpURLConnection httpURLConnectionBean() throws IOException {
        System.out.println("Creating HttpURLConnection Bean");
        return (HttpURLConnection) new URL("https://example.com").openConnection();
    }

    @Bean
    public Charset charsetBean() {
        System.out.println("Creating Charset Bean");
        return StandardCharsets.UTF_8;
    }

    @Bean
    public Formatter formatterBean() {
        System.out.println("Creating Formatter Bean");
        return new Formatter();
    }

    @Bean
    public Scanner scannerBean() {
        System.out.println("Creating Scanner Bean");
        return new Scanner(System.in);
    }

    @Bean
    public UUID uuidBean() {
        System.out.println("Creating UUID Bean");
        return UUID.randomUUID();
    }

    @Bean
    public Base64.Encoder base64EncoderBean() {
        System.out.println("Creating Base64.Encoder Bean");
        return Base64.getEncoder();
    }

    @Bean
    public Base64.Decoder base64DecoderBean() {
        System.out.println("Creating Base64.Decoder Bean");
        return Base64.getDecoder();
    }

    @Bean
    public Optional<String> optionalBean() {
        System.out.println("Creating Optional Bean");
        return Optional.of("default");
    }

    @Bean
    public CompletableFuture<String> completableFutureBean() {
        System.out.println("Creating CompletableFuture Bean");
        return CompletableFuture.completedFuture("done");
    }

    @Bean
    public ExecutorService executorServiceBean() {
        System.out.println("Creating ExecutorService Bean");
        return Executors.newFixedThreadPool(2);
    }

    @Bean
    public ScheduledExecutorService scheduledExecutorServiceBean() {
        System.out.println("Creating ScheduledExecutorService Bean");
        return Executors.newScheduledThreadPool(1);
    }

    @Bean
    public Timer timerBean() {
        System.out.println("Creating Timer Bean");
        return new Timer();
    }

    @Bean
    public TimerTask timerTaskBean() {
        System.out.println("Creating TimerTask Bean");
        return new TimerTask() {
            @Override
            public void run() {
                System.out.println("TimerTask running");
            }
        };
    }

    @Bean
    public StringBuilder stringBuilderBean() {
        System.out.println("Creating StringBuilder Bean");
        return new StringBuilder("default");
    }

}
