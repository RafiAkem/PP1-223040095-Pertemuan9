package Praktikum_Pemrograman.Pertemuan9;

public class node {
    private int data;
    private node next;

    public node(int data) {
        this.data = data;
    }

    // Setter dan Getter
    public void setNext(node next) {
        this.next = next;
    }

    public int getdata() {
        return data;
    }

    public node getNext() {
        return next;
    }
}
