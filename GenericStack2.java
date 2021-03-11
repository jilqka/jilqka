import java.util.ArrayList;

public class GenericStack2<E>extends ArrayList {

    public Object peek(){
        return get(size()-1);
    }
    public void push(E o){
        add(o);
    }
    public E pop(){
        Object o= get(size()-1);
        remove(size()-1);
        return (E) o;
    }
    public String toString(){
        return "stack"+super.toString();
    }
}
