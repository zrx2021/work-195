package xuan.demo11手动创建线程池;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
目标：手动创建线程池

目标：研究线程池的原理（如何工作的）
目标：研究线程池拒绝策略
    AbortPolicy：处理不了就抛异常
    DiscardPolicy：抛弃处理不了的任务
    DiscardOldestPolicy：抛弃等待最长的任务
    CallerRunsPolicy：让提交任务的线程来处理
 */
public class Demo11 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,// 核心线程数量/正式员工数量
                6,// 最大线程数量/最大员工数量
                100,
                TimeUnit.SECONDS,// 临时线程100秒没有任务就会销毁/临时员工100秒没事做就会被解雇
                new ArrayBlockingQueue<>(4),// 任务队列存4个任务/烧饼店有4张椅子让4人等待
                Executors.defaultThreadFactory(),// 现成工厂，负责创建线程/人事招人的
                new ThreadPoolExecutor.CallerRunsPolicy()// 拒绝策略，任务满了处理不了时的方案/客人太多了怎么处理
        );

        LongTimeRunnable ltr = new LongTimeRunnable();

        // 提交任务，交给核心线程处理，会随着任务的数量逐渐创建线程
        pool.submit(ltr);
        pool.submit(ltr);
        pool.submit(ltr);

        // 提交任务，核心线程都在忙，放到任务队列
        pool.submit(ltr);
        pool.submit(ltr);
        pool.submit(ltr);
        pool.submit(ltr);

        // 提交任务，核心线程都在忙，任务队列满啦，创建临时线程处理
        pool.submit(ltr);
        pool.submit(ltr);
        pool.submit(ltr);

        // 提交任务，核心线程都在忙，任务队列满啦，临时线程都在忙，处理不了了，执行拒绝策略
        pool.submit(ltr);

        pool.shutdown();
    }
}
