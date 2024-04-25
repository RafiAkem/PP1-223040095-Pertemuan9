package Praktikum_Pemrograman.Pertemuan9;

public class StrukturQueue {

    private node FRONT;
    private node REAR;

    //isEmpty()
    public boolean isEmpty() {
        return FRONT == null;
    }

    //menambahkan elemen
    public void enqueue(int data) {
        node newNode = new node(data);
        if (isEmpty()) {
            FRONT = newNode;
            REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }


    //dequeue menghapus elemen pertama
    public void dequeue() {
        node temp;
        if (FRONT != null) {
            if (FRONT == REAR) {
                FRONT = null;
                REAR = null;
            } else {
                temp = FRONT;
                FRONT = FRONT.getNext();
                temp = null;
            }
        }
    }

    //size menghitung jumlah elemen
    public int size() {
        int size = 0;
        node curNode = FRONT;
        while(curNode != null) {
            size++;
            curNode = curNode.getNext();
        }
        return size;
    }

    //front mengambil elemen pertama
    public int front() {
        return FRONT != null ? FRONT.getdata() : -1;
    }

    //display element
    public void displayElement() {
        node curNode = FRONT;
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue Kosong");
        } else {
            System.out.print("Elemen Queue: ");
            while (curNode != null) {
                System.out.print(curNode.getdata() + " ");
                curNode = curNode.getNext();
            }
        }
    }
}
