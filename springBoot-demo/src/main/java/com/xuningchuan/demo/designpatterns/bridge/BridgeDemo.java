package com.xuningchuan.demo.designpatterns.bridge;

/**
 * @author xuningchuan
 * @Title: BridgeDemo 桥接模式: 抽象化与实现化解耦，使得二者可以独立变化 -- 结构型模式
 *
 * @Description:  “桥接模式是一种很实用的结构型设计模式，如果软件系统中某个类存在两个独立变化的维度，通过该模式可以将这两个维度分离出来，使两者可以独立扩展"
 * @date 2019/12/17上午10:40
 */
public class BridgeDemo {

    /**
     * Description: 手机内存和手机品牌是两个变化的维度 分离出来 涉及 将变化的抽取出来 使用桥接关联 将多重继承关系改善为聚合模式
     *              以后扩展 CPU 再建立一个 CPU 的桥接 等等
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/12/17 上午11:02
     */
    public static void main(String[] args) {
        System.out.println("===============Xiaomi=======");
        Phone xiaoMi = new PhoneXiaoMi(new Memory4G());
        xiaoMi.addPhone();
        System.out.println("===============HuaWei=======");
        Phone huaWei = new PhoneHuaWei(new Memory8G());
        huaWei.addPhone();
    }
}
