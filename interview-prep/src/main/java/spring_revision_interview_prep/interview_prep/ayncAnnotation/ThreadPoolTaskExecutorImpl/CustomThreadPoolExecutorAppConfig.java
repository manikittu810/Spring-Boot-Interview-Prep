package spring_revision_interview_prep.interview_prep.ayncAnnotation.ThreadPoolTaskExecutorImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@Configuration
//-------------------------------------------------------
//public class CustomThreadPoolExecutorAppConfig {
//    @Bean(name = "myThreadPoolTaskExecutor")
//    public Executor poolTaskExecutor(){
//        int minPoolSize = 2;
//        int maxPoolSize = 4;
//        int maxQueueCapacity = 2;
//
//        ThreadPoolTaskExecutor poolTaskExecutor = new ThreadPoolTaskExecutor();
//        poolTaskExecutor.setCorePoolSize(minPoolSize);
//        poolTaskExecutor.setMaxPoolSize(maxPoolSize);
//        poolTaskExecutor.setQueueCapacity(maxQueueCapacity);
//        poolTaskExecutor.setThreadNamePrefix("My-Thread-");
//        poolTaskExecutor.initialize();
//        return poolTaskExecutor;
//    }
//}
//--------------------------------------------------------------

public class CustomThreadPoolExecutorAppConfig implements AsyncConfigurer{
    private ThreadPoolExecutor pool;
    @Bean(name  = "myThreadPoolExecutor")
    public synchronized Executor threadPoolExecutor(){
        pool = new ThreadPoolExecutor(2,4,1, TimeUnit.SECONDS,new ArrayBlockingQueue<>(2), new CustomThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
        return pool;
    }
    static class CustomThreadFactory implements ThreadFactory{
 private final AtomicInteger threadNumber= new AtomicInteger(1);
        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r);
            t.setName("My-Thread-" + threadNumber.getAndIncrement());
            return t;
        }
    }
}