package top.lzhseu.pattern.责任链模式;

/**
 * @author lzh
 * @date 2021/1/5 11:47
 *
 * 此处是模仿 Java Web 中的 Filter 实现
 * 该实现有个特点：双向逆序过滤
 * 客户端 -> request -> filter1 -> filter2 -> 服务器 -> response -> filter2 -> filter1 -> 客户端
 */

