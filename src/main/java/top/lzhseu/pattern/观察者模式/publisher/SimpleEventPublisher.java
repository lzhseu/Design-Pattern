package top.lzhseu.pattern.观察者模式.publisher;

import top.lzhseu.pattern.观察者模式.event.Event;
import top.lzhseu.pattern.观察者模式.multicaster.EventMulticaster;
import top.lzhseu.pattern.观察者模式.multicaster.SimpEventMulticaster;

/**
 * @author lzh
 * @date 2021/1/5 10:36
 */
public class SimpleEventPublisher implements EventPublisher {

    private EventMulticaster eventMulticaster;

    public SimpleEventPublisher() {
        eventMulticaster = new SimpEventMulticaster();
    }

    public SimpleEventPublisher(EventMulticaster eventMulticaster) {
        this.eventMulticaster = eventMulticaster;
    }


    @Override
    public void publishEvent(Event event) {
        eventMulticaster.notifyListener(event);
    }
}
