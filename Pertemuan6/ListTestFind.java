package Praktikum_Pemrograman.Pertemuan6;

public class ListTestFind {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addTail(5);
        list.addTail(4);
        list.addTail(6);
        list.displayElement();
        System.out.println();
        System.out.println(list.find(6));
    }
}