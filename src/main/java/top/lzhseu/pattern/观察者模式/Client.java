package top.lzhseu.pattern.观察者模式;

import top.lzhseu.pattern.观察者模式.event.impl.WakeUpEvent;
import top.lzhseu.pattern.观察者模式.listener.Listener;
import top.lzhseu.pattern.观察者模式.listener.impl.FeedDogListener;
import top.lzhseu.pattern.观察者模式.multicaster.EventMulticaster;
import top.lzhseu.pattern.观察者模式.multicaster.SimpEventMulticaster;
import top.lzhseu.pattern.观察者模式.publisher.EventPublisher;
import top.lzhseu.pattern.观察者模式.publisher.SimpleEventPublisher;

/**
 * @author lzh
 * @date 2021/1/5 10:21
 */
public class Client {

    /**
     * 有点模仿 Spring，实现的稍微有点复杂
     * 比如，事件广播器主要进行监听器的管理和通知，事件发布器通过广播器的代理完成事件的发布
     *
     * 以下自然是通过 new 来实例化对象的
     * 如果配合 Spring 做成一个小框架，那会更加灵活
     * 用户只需要：1.自定义事件 2.自定义监听器 3.从框架获得发布器发布事件
     * 至于注册，只要检测到实现了 Listener，就会实例化监听器，并注册到事件广播器，事件广播器也是通过配置或者直接使用框架默认的来实例化
     */
    public static void main(String[] args) {

        // 监听器
        Listener feedDogListener = new FeedDogListener();

        // 事件广播器
        EventMulticaster eventMulticaster = new SimpEventMulticaster();
        eventMulticaster.registerListener(feedDogListener);

        // 事件发布器
        EventPublisher eventPublisher = new SimpleEventPublisher(eventMulticaster);

        // 发布事件
        eventPublisher.publishEvent(new WakeUpEvent("大王"));
    }
}
