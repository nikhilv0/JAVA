package com.xworkz.spring.internalconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")
public class InternalConfiguration {

    public InternalConfiguration() {
        System.out.println("InternalConfiguration Constructor");
    }

    @Bean
    public Queue<String> queueBean() {
        System.out.println("Creating Queue Bean");
        return new LinkedList<>();
    }

    @Bean
    public Deque<String> dequeBean() {
        System.out.println("Creating Deque Bean");
        return new ArrayDeque<>();
    }

    @Bean
    public Stack<String> stackBean() {
        System.out.println("Creating Stack Bean");
        return new Stack<>();
    }

    @Bean
    public Properties propertiesBean() {
        System.out.println("Creating Properties Bean");
        return new Properties();
    }

    @Bean
    public Hashtable<String, String> hashtableBean() {
        System.out.println("Creating Hashtable Bean");
        return new Hashtable<>();
    }

    @Bean
    public TreeMap<String, String> treeMapBean() {
        System.out.println("Creating TreeMap Bean");
        return new TreeMap<>();
    }

    @Bean
    public TreeSet<String> treeSetBean() {
        System.out.println("Creating TreeSet Bean");
        return new TreeSet<>();
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMapBean() {
        System.out.println("Creating LinkedHashMap Bean");
        return new LinkedHashMap<>();
    }

    @Bean
    public LinkedHashSet<String> linkedHashSetBean() {
        System.out.println("Creating LinkedHashSet Bean");
        return new LinkedHashSet<>();
    }

    @Bean
    public Vector<String> vectorBean() {
        System.out.println("Creating Vector Bean");
        return new Vector<>();
    }

    @Bean
    public BitSet bitSetBean() {
        System.out.println("Creating BitSet Bean");
        return new BitSet();
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
    public File fileBean() {
        System.out.println("Creating File Bean");
        return new File("example.txt");
    }

    @Bean
    public FileInputStream fileInputStreamBean() throws FileNotFoundException {
        System.out.println("Creating FileInputStream Bean");
        return new FileInputStream("example.txt");
    }

    @Bean
    public FileOutputStream fileOutputStreamBean() throws FileNotFoundException {
        System.out.println("Creating FileOutputStream Bean");
        return new FileOutputStream("example.txt");
    }

    @Bean
    public FileReader fileReaderBean() throws IOException {
        System.out.println("Creating FileReader Bean");
        return new FileReader("example.txt");
    }

    @Bean
    public FileWriter fileWriterBean() throws IOException {
        System.out.println("Creating FileWriter Bean");
        return new FileWriter("example.txt");
    }

    @Bean
    public BufferedReader bufferedReaderBean() throws IOException {
        System.out.println("Creating BufferedReader Bean");
        return new BufferedReader(new FileReader("example.txt"));
    }

    @Bean
    public BufferedWriter bufferedWriterBean() throws IOException {
        System.out.println("Creating BufferedWriter Bean");
        return new BufferedWriter(new FileWriter("example.txt"));
    }

    @Bean
    public PrintWriter printWriterBean() throws IOException {
        System.out.println("Creating PrintWriter Bean");
        return new PrintWriter("example.txt");
    }

    @Bean
    public Object objectBean() {
        System.out.println("Creating Object Bean");
        return new Object();
    }

}
