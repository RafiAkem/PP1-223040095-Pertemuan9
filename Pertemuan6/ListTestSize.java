package Praktikum_Pemrograman.Pertemuan6;

public class ListTestSize {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(7);
        list.addMiddle(6, 2);
        list.addMiddle(4, 3);
        list.addMiddle(2, 4);
        list.addTail(3);
        list.displayElement();
        System.out.println("\n");
        System.out.println(list.size());
    }
}