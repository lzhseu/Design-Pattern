package top.lzhseu.pattern.观察者模式.listener;


import top.lzhseu.pattern.观察者模式.event.Event;

/**
 * 监听器
 * @author lzh
 * @date 2021/1/5 10:02
 */
public interface Listener {
    void actionToEvent(Event event);
}
