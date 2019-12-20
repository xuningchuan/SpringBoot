package com.xuningchuan.demo.designpatterns.composite;

/**
 * @author xuningchuan
 * @Title: Leaf   叶子
 * @Description:
 * @date 2019/12/20上午10:51
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display(int dept) {
        for(int i = 0; i < dept; i++){
            System.out.print("-");
        }
        System.out.println(super.name);
    }
}
