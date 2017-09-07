package Listy;

public class MyList <T>{
    private Element<T> _head;
    private Element<T> _tail;
    private int _counter;

    public Element<T> getElementForward(T data){
        Element<T> p = _head;
        while (p._next != null){
            if(p._data == data){
                break;
            }
            p = p._next;
        }
        return p;
    }
    public Element<T> getElementBack(T data){
        Element<T> p = _tail;
        while (p._prev != null) {
            if(p._data == data){
                break;
            }
            p = p._prev;
        }
        return p;
    }
    public void printAllElement(){
        Element<T> p = _head;
        while (p !=null){
            System.out.println(p._data);
            p = p._next;
        }
    }
    public void addElementAtBeginning(T data){
        Element<T> p = new Element();
        p._data = data;
        p._prev = null;
        p._next = _head;
        _head = p;
        _counter++;

        if(p._next != null){
            Element nextOfP = p._next;
            nextOfP._prev = p;
        }
        else{
            _tail = p;
        }
    }
    public void addElementAtEnd (T data){
        Element<T> p = new Element();
        p._data = data;
        p._prev = _tail;
        p._next = null;
        _tail = p;
        _counter++;

        if(p._prev != null){
            p._prev._next = p;
        }
        else{
            _head = p;
        }
    }
    public void addElementAtAfter(T elementToAdd, T elementWeWantToAddAfter){
        Element<T> after = getElementForward(elementWeWantToAddAfter);

        if(after == _tail){
            addElementAtEnd(elementToAdd);
        }else{
            Element<T> p = new Element();
            p._data = elementToAdd;
            p._prev = after;
            p._next = after._next;

            Element nextAfter = after._next;
            nextAfter._prev = p;
            after._next = p;
            _counter++;

        }
    }
}
