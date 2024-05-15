package xuan.demo07泛型接口;

public interface MyList<E> {
    public abstract void remove(E e);

    public abstract E set(int index, E e);
}
