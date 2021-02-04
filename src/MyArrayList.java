import java.util.ArrayList;

public class MyArrayList<E> extends ArrayList<E> {
    private ArrayList<E> storage;

    public MyArrayList() {
        storage = new ArrayList<>();
        // assert postcondition
        assert storage != null : "Postcondition: STORAGE == NULL.";
    }

    @Override
    public int size() {
        int size = storage.size();
        // assert postcondition
        assert size >= 0 : "Postcondition: Size is less than 0.";
        // code
        return size;
    }

    // Insert e as a new first element to mal
    public void insertFirst(E e) {
        // assert precondition
        int size = storage.size();
        assert e != null : "Precondition: We cannot add null as a valid element.";
        // code
        storage.add(0,e);
        // assert postcondition
        assert size + 1 == storage.size() : "Postcondition: The size was not increased by 1.";
        assert storage.get(0) == e : "Postcondition: The element e wasn't inserted in the beginning of the list.";
    }

    // Insert e as a new last element
    public void insertLast(E e) {
        // assert precondition
        int size = storage.size();
        assert e != null : "Precondition: We cannot add null as a valid element";
        // code
        storage.add(e);
        // assert postcondition
        assert size + 1 == storage.size() : "Postcondition: The size was not increased by 1.";
        assert storage.get(storage.size()-1) == e : "Postcondition: The element e wasn't inserted at the end of the list.";
    }

    // Delete my first element
    public void deleteFirst() {
        // assert precondition
        int size = storage.size();
        E removed = storage.get(0);
        assert storage.size()>0 : "Precondition: Cannot remove element from an empty list.";
        // code
        storage.remove(0);
        // assert postcondition
        assert size == storage.size()+1 : "Postcondition: The size was not decreased by 1.";
        assert removed != storage.get(0);
    }

    // Delete my last element
    public void deleteLast() {
        // assert precondition
        int size = storage.size();
        assert storage.size()>0 : "Precondition: Cannot remove element from an empty list.";
        // code
        storage.remove(size-1);
        // assert postcondition
        assert size == storage.size()+1 : "Postcondition: The size was not decreased by 1.";
    }

    public void show() {
        for (E e : storage) {
            System.out.println(e);
        }
    }
}