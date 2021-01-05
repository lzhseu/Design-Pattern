package top.lzhseu.pattern.责任链模式.filter;


import top.lzhseu.pattern.责任链模式.entity.Request;
import top.lzhseu.pattern.责任链模式.entity.Response;
import top.lzhseu.pattern.责任链模式.filterchain.FilterChain;

/**
 * @author lzh
 * @date 2021/1/5 11:25
 */
public interface Filter {

    void doFilter(FilterChain fc, Request request, Response response);
}
