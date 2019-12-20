package com.xuningchuan.demo.designpatterns.composite;

/**
 * @author xuningchuan
 * @Title: CompositeDemo  组合模式  将对象组合成树形结构以表示“部分-整体”的层次结构，用户对单个对象和组合对象的使用具有一致性  --结构型模式
 * @Description:
 * @date 2019/12/20上午10:40
 */
public class CompositeDemo {


    /**
     * Description:  组合模式-- 透明模式   branch leaf 实现公共接口 将单个对象和组合对象的使用具有一致性
     *               适用于 树形结构的系统 可用于递归表示
     * @author xuningchuan[xu_nc@suixingpay.com>]
     * @param
     * @return
     * @date 2019/12/20 下午1:55
     */
    public static void main(String[] args) {
        // 根节点
        Composite root = new Composite("root");
        root.add(new Leaf("Leaf A"));  // 第一层树叶
        root.add(new Leaf("Leaf B"));

        // 第一层枝干
        Composite branchX = new Composite("Branch X");
        branchX.add(new Leaf("Leaf XA")); // 第二层树叶
        branchX.add(new Leaf("Leaf XB"));

        // 第二层枝干
        Composite branchY = new Composite("Branch Y");
        branchY.add(new Leaf("Leaf YA"));  // 第三层树叶
        branchY.add(new Leaf("Leaf YB"));

        branchX.add(branchY);

        root.add(branchX);

        root.display(1);

    }
}
