package Praktikum_Pemrograman.Pertemuan5;

public class ListHead {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        System.out.println("LATIHAN 4");
        list.addHead(2);
        list.addMiddle(6, 2);
        list.addMiddle(3, 3);
        list.addMiddle(5, 4);
        list.addTail(1);
        list.displayElement();
        System.out.println("\nHapus elemen di akhir list : ");
        list.removeTail();
        list.displayElement();
        System.out.println("\nHapus elemen di depan list : ");
        list.removeHead();
        list.displayElement();
    }
}
