package com.byonecup.proxy.service;

/**
 * @Title Spring6_Stu OrderServiceImpl
 * @Description TODO
 * @Author Turbo
 * @Date 2022/11/23 22:07
 * @Version 1.0
 */
public class OrderServiceImpl implements OrderService { // 目标对象

    /**
     * 项目经理提出一个新的需求：要统计所有业务接口中每一个业务方法的耗时。
     * 解决方案一：硬编码，在每一个业务接口中的每一个业务方法中直接添加统计耗时的程序。
     *      缺点：1. 违背OCP开闭原则
     *           2. 代码没有得到复用。
     *
     * 解决方案二：编写业务类的子类，让子类继承业务类，对每个业务方法进行重写。
     *      缺点：1. 虽然解决了OCP开闭原则，但是这种方式会导致耦合度很高，因为采用了继承关系。继承关系是一种耦合度非常高的关系，不建议使用。
     *           2. 代码没有得到复用。
     *
     * 解决方案三：代理模式。
     *      优点：1. 解决了OCP问题。
     *           2. 采用代理模式的has a，可以降低耦合度。
     *
     * 目前我们使用的是静态代理，静态代理的缺点是什么？
     *      类爆炸。假设系统中有1000个接口，那么每个接口都需要对应代理类，这样类会急剧膨胀，不好维护。
     *      怎么解决类爆炸问题？
     *          可以使用动态代理来解决这个问题。
     *
     *      动态代理还是代理模式，只不过添加了字节码生成技术，可以在内存中为我们动态的生成一个class字节码，这个字节码就是代理类。
     *      在内存中动态的生成字节码代理类的技术，叫做：动态代理。
     */

//    @Override
//    public void generate() {
//        long begin = System.currentTimeMillis();
//        // 模拟生成订单的耗时
//        try {
//            Thread.sleep(1234);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("订单已生成...");
//        long end = System.currentTimeMillis();
//        System.out.println("耗时" + (end - begin) + "毫秒");
//    }
//
//    @Override
//    public void modify() {
//        long begin = System.currentTimeMillis();
//        // 模拟修改订单的耗时
//        try {
//            Thread.sleep(456);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("订单已修改...");
//        long end = System.currentTimeMillis();
//        System.out.println("耗时" + (end - begin) + "毫秒");
//    }
//
//    @Override
//    public void detail() {
//        long begin = System.currentTimeMillis();
//        // 模拟查看订单详情的耗时
//        try {
//            Thread.sleep(111);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("订单详情...");
//        long end = System.currentTimeMillis();
//        System.out.println("耗时" + (end - begin) + "毫秒");
//    }

    @Override
    public void generate() {
        // 模拟生成订单的耗时
        try {
            Thread.sleep(1234);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已生成...");
    }

    @Override
    public void modify() {
        // 模拟修改订单的耗时
        try {
            Thread.sleep(456);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单已修改...");
    }

    @Override
    public void detail() {
        // 模拟查看订单详情的耗时
        try {
            Thread.sleep(111);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("订单详情...");
    }
}
