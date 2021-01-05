package top.lzhseu.pattern.责任链模式.filter.impl;


import top.lzhseu.pattern.责任链模式.entity.Request;
import top.lzhseu.pattern.责任链模式.entity.Response;
import top.lzhseu.pattern.责任链模式.filter.Filter;
import top.lzhseu.pattern.责任链模式.filterchain.FilterChain;

/**
 * @author lzh
 * @date 2021/1/5 11:54
 */
public class AppleFilter implements Filter {

    @Override
    public void doFilter(FilterChain fc, Request request, Response response) {
        request.setRequestStr(request.getRequestStr().replace("apple", "*****"));
        System.out.println("Apple Filter Request");

        // 放行。让它去执行下一个 Filter 的 doFilter 方法, 处理 response 的代码将被挂起
        fc.doFilter(fc, request, response);

        System.out.println("Apple Filter Response");
    }
}
