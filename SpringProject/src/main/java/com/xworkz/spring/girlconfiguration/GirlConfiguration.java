package com.xworkz.spring.girlconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")
public class GirlConfiguration {

    public GirlConfiguration() {
        System.out.println("InternalConfiguration Constructor");
    }

    @Bean
    public String stringBean() {
        System.out.println("Creating String Bean");
        return "Hello";
    }

    @Bean
    public Integer integerBean() {
        System.out.println("Creating Integer Bean");
        return 42;
    }

    @Bean
    public Double doubleBean() {
        System.out.println("Creating Double Bean");
        return 42.0;
    }

    @Bean
    public Boolean booleanBean() {
        System.out.println("Creating Boolean Bean");
        return true;
    }

    @Bean
    public Long longBean() {
        System.out.println("Creating Long Bean");
        return 42L;
    }

    @Bean
    public Float floatBean() {
        System.out.println("Creating Float Bean");
        return 42.0f;
    }

    @Bean
    public Character charBean() {
        System.out.println("Creating Character Bean");
        return 'A';
    }

    @Bean
    public Byte byteBean() {
        System.out.println("Creating Byte Bean");
        return (byte) 1;
    }

    @Bean
    public Short shortBean() {
        System.out.println("Creating Short Bean");
        return (short) 2;
    }

    @Bean
    public BigDecimal bigDecimalBean() {
        System.out.println("Creating BigDecimal Bean");
        return BigDecimal.TEN;
    }

    @Bean
    public BigInteger bigIntegerBean() {
        System.out.println("Creating BigInteger Bean");
        return BigInteger.TEN;
    }

    @Bean
    public Date dateBean() {
        System.out.println("Creating Date Bean");
        return new Date();
    }

    @Bean
    public Calendar calendarBean() {
        System.out.println("Creating Calendar Bean");
        return Calendar.getInstance();
    }

    @Bean
    public TimeZone timeZoneBean() {
        System.out.println("Creating TimeZone Bean");
        return TimeZone.getDefault();
    }

    @Bean
    public Currency currencyBean() {
        System.out.println("Creating Currency Bean");
        return Currency.getInstance("USD");
    }

    @Bean
    public UUID uuidBean() {
        System.out.println("Creating UUID Bean");
        return UUID.randomUUID();
    }

    @Bean
    public Optional<String> optionalBean() {
        System.out.println("Creating Optional Bean");
        return Optional.of("Hello");
    }

    @Bean
    public List<String> listBean() {
        System.out.println("Creating List Bean");
        return new ArrayList<>();
    }

    @Bean
    public Set<String> setBean() {
        System.out.println("Creating Set Bean");
        return new HashSet<>();
    }

    @Bean
    public Map<String, String> mapBean() {
        System.out.println("Creating Map Bean");
        return new HashMap<>();
    }


}
