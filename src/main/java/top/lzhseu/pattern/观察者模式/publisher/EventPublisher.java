package top.lzhseu.pattern.观察者模式.publisher;

import top.lzhseu.pattern.观察者模式.event.Event;

/**
 * @author lzh
 * @date 2021/1/5 10:36
 */
public interface EventPublisher {

    void publishEvent(Event event);
}
