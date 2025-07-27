package com.xworkz.spring.personconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.nio.file.Path;
import java.time.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")
public class PersonConfiguration {

    public PersonConfiguration() {
        System.out.println("InternalConfiguration Constructor");
    }


    @Bean
    public Instant instantBean() {
        System.out.println("Creating Instant Bean");
        return Instant.now();
    }

    @Bean
    public LocalDate localDateBean() {
        System.out.println("Creating LocalDate Bean");
        return LocalDate.now();
    }

    @Bean
    public LocalTime localTimeBean() {
        System.out.println("Creating LocalTime Bean");
        return LocalTime.now();
    }

    @Bean
    public LocalDateTime localDateTimeBean() {
        System.out.println("Creating LocalDateTime Bean");
        return LocalDateTime.now();
    }

    @Bean
    public ZonedDateTime zonedDateTimeBean() {
        System.out.println("Creating ZonedDateTime Bean");
        return ZonedDateTime.now();
    }

    @Bean
    public OffsetDateTime offsetDateTimeBean() {
        System.out.println("Creating OffsetDateTime Bean");
        return OffsetDateTime.now();
    }

    @Bean
    public OffsetTime offsetTimeBean() {
        System.out.println("Creating OffsetTime Bean");
        return OffsetTime.now();
    }

    @Bean
    public Duration durationBean() {
        System.out.println("Creating Duration Bean");
        return Duration.ofMinutes(5);
    }

    @Bean
    public Period periodBean() {
        System.out.println("Creating Period Bean");
        return Period.ofDays(10);
    }

    @Bean
    public Locale localeBean() {
        System.out.println("Creating Locale Bean");
        return Locale.getDefault();
    }

    @Bean
    public Thread threadBean() {
        System.out.println("Creating Thread Bean");
        return new Thread();
    }

    @Bean
    public Runtime runtimeBean() {
        System.out.println("Creating Runtime Bean");
        return Runtime.getRuntime();
    }


    @Bean
    public EnumSet<DayOfWeek> enumSetBean() {
        System.out.println("Creating EnumSet Bean");
        return EnumSet.allOf(DayOfWeek.class);
    }

    @Bean
    public EnumMap<DayOfWeek, String> enumMapBean() {
        System.out.println("Creating EnumMap Bean");
        return new EnumMap<>(DayOfWeek.class);
    }

    @Bean
    public Path pathBean() {
        System.out.println("Creating Path Bean");
        return java.nio.file.Paths.get("example.txt");
    }

    @Bean
    public Pattern patternBean() {
        System.out.println("Creating Pattern Bean");
        return Pattern.compile("\\d+");
    }

    @Bean
    public Matcher matcherBean() {
        System.out.println("Creating Matcher Bean");
        return Pattern.compile("\\d+").matcher("12345");
    }

    @Bean
    public ThreadGroup threadGroupBean() {
        System.out.println("Creating ThreadGroup Bean");
        return new ThreadGroup("ExampleGroup");
    }

    @Bean
    public AtomicInteger atomicIntegerBean() {
        System.out.println("Creating AtomicInteger Bean");
        return new AtomicInteger(1);
    }

}