package top.lzhseu.pattern.观察者模式.listener.impl;


import top.lzhseu.pattern.观察者模式.event.Event;
import top.lzhseu.pattern.观察者模式.listener.Listener;

/**
 * @author lzh
 * @date 2021/1/5 10:14
 */
public class FeedDogListener implements Listener {

    @Override
    public void actionToEvent(Event event) {
        System.out.println(event);
        System.out.println("It's time to feed dog");
    }
}
