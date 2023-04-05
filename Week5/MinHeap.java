import java.util.ArrayList;

public class MinHeap {
    ArrayList<Integer> heap;
    
    public MinHeap(){
        //the constructor accepts an integer arrays and transforms it into an Arraylist<Integer>
        heap = new ArrayList<>();
    }

    public void insert(int input){
        heap.add(input);
        int input_index = heap.size() - 1;

        while(input_index > 0 && (heap.get(input_index) < heap.get(getParentIndex(input_index)))){
            int temp = heap.get(input_index);
            heap.set(input_index, heap.get(getParentIndex(input_index)));
            heap.set(getParentIndex(input_index), temp);
            input_index = getParentIndex(input_index);
        }
    }

    public int delete(){
        int minVal = heap.get(0);
        int index_to_remove;

        if (heap.size() > 1){
            index_to_remove = heap.size() - 1;
            heap.set(0, heap.remove(index_to_remove));
        }else{
            heap.remove(0);
        }

        
        int index = 0;

        while(hasSmallerChild(index)){
            int smaller_child_idx = getSmallerChildIndex(index);
            int temp = heap.get(index);
            heap.set(index, heap.get(getSmallerChildIndex(index)));
            heap.set(getSmallerChildIndex(index), temp);
            index = smaller_child_idx;
        }
        return minVal;
    }

    public boolean hasSmallerChild(int idx){
        return ((getLeftChildIndex(idx) < heap.size() && heap.get(getLeftChildIndex(idx)) < heap.get(idx)) ||  ((getRightChildIndex(idx) < heap.size()) && (heap.get(getRightChildIndex(idx)) < heap.get(idx))));
    }

    public int getSmallerChildIndex(int idx){
        if(getRightChildIndex(idx) >= heap.size()){
            return getLeftChildIndex(idx);
        }

        if(heap.get(getRightChildIndex(idx)) < heap.get(getLeftChildIndex(idx))){
            return getRightChildIndex(idx);
        }else{
            return getLeftChildIndex(idx);
        }
    }

    public int getLastNode(){
        return heap.get(heap.size() - 1);
    }

    public int getParentIndex(int idx){
        return (idx -1 ) / 2;
    }

    public int getLeftChildIndex(int idx){
        return (idx * 2) + 1;
    }

    public int getRightChildIndex(int idx){
        return (idx * 2) + 2;
    }

    public String toString(){
        return heap.toString();
    }

    public int size(){
        return heap.size();
    }
}
