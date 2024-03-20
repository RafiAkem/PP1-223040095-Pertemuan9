package Praktikum_Pemrograman.Pertemuan6;

public class ListTestClear {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(4);
        list.addMiddle(3, 2);
        list.addMiddle(7, 3);
        list.addMiddle(8, 4);
        list.addMiddle(1, 5);
        list.addTail(9);
        list.displayElement();
        list.clear();
        System.out.println("\n");
        list.displayElement();
    }
}
