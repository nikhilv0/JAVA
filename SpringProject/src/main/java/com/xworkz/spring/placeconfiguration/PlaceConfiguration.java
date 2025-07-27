package com.xworkz.spring.placeconfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.*;

@Configuration
@ComponentScan(basePackages = "com.xworkz.spring")
public class PlaceConfiguration {
    public PlaceConfiguration() {
        System.out.println("PlaceConfiguration Constructor");
    }

    @Bean
    public AtomicLong atomicLongBean() {
        System.out.println("Creating AtomicLong Bean");
        return new AtomicLong(100L);
    }

    @Bean
    public Semaphore semaphoreBean() {
        System.out.println("Creating Semaphore Bean");
        return new Semaphore(3);
    }

    @Bean
    public ReentrantLock reentrantLockBean() {
        System.out.println("Creating ReentrantLock Bean");
        return new ReentrantLock();
    }

    @Bean
    public CountDownLatch countDownLatchBean() {
        System.out.println("Creating CountDownLatch Bean");
        return new CountDownLatch(1);
    }

    @Bean
    public CyclicBarrier cyclicBarrierBean() {
        System.out.println("Creating CyclicBarrier Bean");
        return new CyclicBarrier(2);
    }

    @Bean
    public Exchanger<String> exchangerBean() {
        System.out.println("Creating Exchanger Bean");
        return new Exchanger<>();
    }

    @Bean
    public Phaser phaserBean() {
        System.out.println("Creating Phaser Bean");
        return new Phaser();
    }

    @Bean
    public AtomicBoolean atomicBooleanBean() {
        System.out.println("Creating AtomicBoolean Bean");
        return new AtomicBoolean(true);
    }

    @Bean
    public ReadWriteLock readWriteLockBean() {
        System.out.println("Creating ReadWriteLock Bean");
        return new ReentrantReadWriteLock();
    }

    @Bean
    public BlockingQueue<String> blockingQueueBean() {
        System.out.println("Creating BlockingQueue Bean");
        return new LinkedBlockingQueue<>();
    }

    @Bean
    public PriorityQueue<Double> priorityQueueBean() {
        System.out.println("Creating PriorityQueue Bean");
        return new PriorityQueue<>();
    }

    @Bean
    public Deque<Character> dequeBean() {
        System.out.println("Creating Deque Bean");
        return new ArrayDeque<>();
    }

    @Bean
    public Vector<Float> vectorBean() {
        System.out.println("Creating Vector Bean");
        return new Vector<>();
    }

    @Bean
    public Stack<Long> stackBean() {
        System.out.println("Creating Stack Bean");
        return new Stack<>();
    }

    @Bean
    public Properties propertiesBean() {
        System.out.println("Creating Properties Bean");
        return new Properties();
    }

    @Bean
    public File fileBean() {
        System.out.println("Creating File Bean");
        return new File("data.txt");
    }

    @Bean
    public FileInputStream fileInputStreamBean() throws FileNotFoundException {
        System.out.println("Creating FileInputStream Bean");
        return new FileInputStream("data.txt");
    }

    @Bean
    public FileOutputStream fileOutputStreamBean() throws FileNotFoundException {
        System.out.println("Creating FileOutputStream Bean");
        return new FileOutputStream("data.txt");
    }

    @Bean
    public BufferedReader bufferedReaderBean() throws FileNotFoundException {
        System.out.println("Creating BufferedReader Bean");
        return new BufferedReader(new FileReader("data.txt"));
    }

    @Bean
    public BufferedWriter bufferedWriterBean() throws IOException {
        System.out.println("Creating BufferedWriter Bean");
        return new BufferedWriter(new FileWriter("data.txt"));
    }

}
