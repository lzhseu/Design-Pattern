package top.lzhseu.pattern.责任链模式.filterchain;


import top.lzhseu.pattern.责任链模式.entity.Request;
import top.lzhseu.pattern.责任链模式.entity.Response;
import top.lzhseu.pattern.责任链模式.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lzh
 * @date 2021/1/5 11:36
 */
public class SimpleFilterChain implements FilterChain {

    /**
     * 过滤器链
     */
    private List<Filter> filters;

    /**
     * 表示获取链中第几个 filter
     */
    private int index;


    public SimpleFilterChain() {
        filters = new ArrayList<Filter>();
        index = 0;
    }

    public SimpleFilterChain addFilter(Filter filter) {
        if (filter == null) {
            throw new IllegalArgumentException("filter can not be null");
        }
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(FilterChain fc, Request request, Response response) {

        // 这个判断是逆序处理的关键。当为 true 时，说明已经完成了对 request 的处理，下面进入对 response 的处理
        if (index == filters.size()) {
            return;
        }

        Filter filter = filters.get(index);
        index++;
        filter.doFilter(fc, request, response);
    }
}
