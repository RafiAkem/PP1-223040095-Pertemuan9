package Praktikum_Pemrograman.Pertemuan10;

public class Stack {

    private int[] array;
    private int capacity;
    private int TOP;

    public final int MIN = -1;

    // cek apakah stack kosong
    public boolean isEmpty() {
        return TOP == MIN;
    }

    // cek apakah stack penuh
    public boolean isFull() {
        return TOP == capacity - 1;
    }

    // konstruktor untuk inisialisasi array dan TOP
    public Stack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    //function size
    public int size() {
        return TOP + 1;
    }

    //function TOP
    public int TOP() {
        if (isEmpty()) {
            return -1;
        } else {
            return array[TOP];
        }
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    //function pop
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            TOP--;
        }
    }

    //display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Element From TOP : ");
        } else {
            System.out.print("Element From TOP : ");
            for (int i = 0; i <= TOP; i++) {
                System.out.print(array[i] + " ");
            }
        }
    } 
}
