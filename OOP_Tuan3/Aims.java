package com.company;

public class Aims {

    public static void main(String[] args){
        Order order1 = new Order();  //create new order

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Con cho","Truyen tranh","Kim Dong",30,30);
        order1.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Con meo","Truyen cuoi","NXB tre",20,10);
        order1.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Con vit","Tieu thuyet","NXB BachKhoa",60,50);
        order1.addDigitalVideoDisc(dvd3);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Con cho","Tieu thuyet","Giao Duc",30, 10);
        order1.addDigitalVideoDisc(dvd4);
        order1.removeDigitalVideoDisc(dvd1);
        order1.printDVDlist();
        System.out.println("Tong tien la: ");
        System.out.println(order1.totalCost());
    }
}
