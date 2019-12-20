package com.xuningchuan.demo.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xuningchuan
 * @Title: Composite 组合 表示树枝
 * @Description:
 * @date 2019/12/20上午10:47
 */
public class Composite extends Component {

    private List<Component> componentList = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentList.remove(component);
    }

    @Override
    public void display(int dept) {
       for(int i = 0; i < dept; i++){
           System.out.print("-");
       }
        System.out.println(super.name);
        componentList.forEach(component -> component.display(dept +1));
    }
}
