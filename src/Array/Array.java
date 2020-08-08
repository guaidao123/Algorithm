package Array;

import java.util.Objects;

public class Array<T> {
    private T[] data;
    private  int size;

//    数组初始化
    public Array(int capacity){
        data = (T[]) new Object[capacity];
        size = 0;
    }

    public Array(){
        this(10);
    }

//    获取数组元素
    public int getSize(){
        return this.size;
    }

//    获取数组容量
    public int getCapacity(){
        return data.length;
    }

//    判断数组是否为空
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }

//    尾部添加元素
    public void addList(T e){
//        System.out.println(getCapacity());
//        System.out.println(data.length);
        if(size==getCapacity()){
            throw new IllegalArgumentException("Array is Full");
        }
        add(e,size);
    }

//    头部添加元素
    public void addFirst(T e){
        add(e,0);
    }

//    获取数组元素
    public T getData(int index){
        if(index<0 || index >= size){
            throw new IllegalArgumentException("Get Failed");
        }

        return data[index];
    }

//    获取尾元素
    public T getLast(){
        return getData(size-1);
    }

//    获取头元素
    public T getFirst(){
        return getData(0);
    }



//    修改数组元素
    public void setData(int index, T e){
        if(index<0 || index >= size){
            throw new IllegalArgumentException("Set Failed");
        }
        data[index] = e;
    }

//    是否包含元素
    public boolean contain(T e){
        for(int i=0;i<size;i++){
            if(data[i]==e){
                return true;
            }
        }
        return false;
    }


//    查找元素所在的索引
    public int find(T e){
        for(int i=0;i<size;i++){
            if(data[i]==e){
                return i;
            }
        }
        return -1;
    }


//    删除目标位置的元素，返回删除的元素
    public T remove(int index){
        if(index<0||index>getSize()){
            throw new IllegalArgumentException("Add Failed， index should >=0 and <=data.size()");
        }

        T ret = data[index];
        for(int i=index;i<size;i++)
        {
            data[i] = data[i+1];
        }
        size--;
//        垃圾回收
        data[size]=null;

        if(size == data.length/4 && data.length/2!=0){
            resize(data.length/2);
        }

        return ret;
    }

//    删除第一个元素
    public T removeFirst(){
        return remove(0);
    }

//删除最后一个元素
    public T removeLast(){
        return remove(size-1);
    }

//    删除某个元素
    public void removeElement(T e){
        int index = find(e);
        if(index!=-1){
            remove(index);
        }
    }

//    某个位置添加元素
    public void add(T e, int index){
        if(index<0||index>getSize()){
            throw new IllegalArgumentException("Add Failed， index should >=0 and <=data.size()");
        }

        if(size==getCapacity()){
            resize(2*data.length);
        }


        for(int i=size-1;i>=index;i--){
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;

    }

    private void resize(int newCapacity) {
        T[] newData = (T[]) new Object[newCapacity];
        for(int i=0;i<size;i++){
            newData[i] = data[i];
        }
        data = newData;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array size: %d, capacity:%d\n",size,getCapacity()));
        sb.append('[');
        for(int i=0;i<size;i++){
            sb.append(data[i]);
            if(i!=size-1){
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
