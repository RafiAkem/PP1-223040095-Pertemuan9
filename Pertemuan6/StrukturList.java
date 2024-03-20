package Praktikum_Pemrograman.Pertemuan6;

public class StrukturList {
    private node HEAD;
    
    //cek apakah linked list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    //fungsi menambahkan data AddHead List
    public void addHead(int data) {
        node newnode = new node(data);
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            newnode.setNext(HEAD);
            HEAD = newnode;
        }
    }
    
    //fungsi menambahkan data di depan
    public void addTail(int data) {
        node newnode = new node(data);
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            node curNode = HEAD;
            node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newnode);
        }
    }

    //fungsi menambahkan data di tengah
    public void addMiddle(int data, int pos) {
        node newnode = new node(data);
        node curNode = HEAD;
        if (isEmpty()) {
            HEAD = newnode;
        } else {
            node posNode = null;
            if (pos == 1) {
                newnode.setNext(HEAD);
                HEAD = newnode;
            } else {
                int i = 1;
                while (curNode != null && i < pos) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newnode);
                newnode.setNext(curNode);
            }
        }
    }

    //fungsi remove Head list
    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List Kosong");
        }
        else {
            node temp = HEAD;
            HEAD = HEAD.getNext();
        }
    }

    //fungsi remove Tail List
    public void removeTail() {
        node preNode = null;
        node lastNode = null;

        if (HEAD != null) {
            if (HEAD.getNext() == null) {
                HEAD = null;
            } else {
                lastNode = HEAD;
                while (lastNode.getNext() != null) {
                    preNode = lastNode;
                    lastNode = lastNode.getNext();
                }
                preNode.setNext(null);
                lastNode.setNext(null);
                lastNode = null;
            }
        }
    }

    //fungsi remove middle list LATIHAN 1
    public void removeMid(int e) {
        node preNode = new node(0);
        node tempNode;
        int i;
        boolean ketemu;

        if (isEmpty()) {
            System.out.println("Elemen list kosong");
        } else {
            ketemu = false;
            i = 1;
            tempNode = HEAD;
            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getdata() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu == true) {
                if (i == 1) {
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                }
            }
        }
    }


    //fungsi find data
    public boolean find(int x) {
        node curNode = HEAD;
        boolean ketemu = false;
        
        while (curNode != null && !ketemu) {
            if (curNode.getdata() == x)
                ketemu = true;
            else
                curNode = curNode.getNext();
        }

        return ketemu;
    }

    //fungsi size list
    public int size() {
        node curNode = HEAD;
        int jumlah = 0;
        while (curNode != null) {
            jumlah = jumlah + 1;
            curNode = curNode.getNext();
        }

        return jumlah;
    }

    //fungsi menghapus semua elemen list
    public void clear() {
        HEAD = null;
    }
    
    // menampilkan isi linked list
    public void displayElement() {
        node curNode = HEAD;

        while(curNode != null) {
            System.out.print(curNode.getdata()+ " ");
            curNode = curNode.getNext();
        }
        if (isEmpty()) {
            System.out.println("List Kosong");
        }
    }
}