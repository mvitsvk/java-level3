package ru.l3.less1.fruit;

public class Fruit<Q, W> {
    private Q Name;
    private W weigth;

    public Fruit(Q name, W weigth) {
        Name = name;
        this.weigth = weigth;
    }

    public Q getName() {
        return Name;
    }

    public W getWeigth() {
        return weigth;
    }

//    public void setName(Q name) {
//        Name = name;
//    }
//
//    public void setWeigth(W weigth) {
//        this.weigth = weigth;
//    }
}
