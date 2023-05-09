/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author vanna
 */
public interface MyList<E> extends Iterable<E>{
    void add(E e);
    void add (int index, E e);
    void clear();
    boolean countains(E e);
    E get(int index);
    int indexOf(E e);
    int indexOf(E e, int from);
    int lastIndexOf(E e);
    boolean isEmpty();
    boolean remove(E e);
    E remove(int index);
    Object set(int index, E e);
    int size();
}
