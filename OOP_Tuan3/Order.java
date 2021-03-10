package com.company;

public class Order {
    public static final int Max_Numbers_Ordered = 10;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[Max_Numbers_Ordered];
    private int qtyOrdered = 0;

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered>=10){
            System.out.println("Danh sach da qua 10 DVD");
            System.exit(1);
        }
        else{
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered ++;
        }
    }
   public void printDVDlist(){
        if(qtyOrdered ==0){
            System.out.println("Chua co san pham nao!!!");
            System.exit(1);
        }
        else{
        System.out.println("Danh sach DVD: ");
        System.out.printf("%-10s %-25s %-25s %-25s %-25s %-25s\n", "STT", "Tittle", "Category", "Director", "Length", "Cost");
        for(int i=0; i< qtyOrdered;i++) {
            System.out.printf("%-10s %-25s %-25s %-25s %-25s %-25s\n",(i+1),itemsOrdered[i].getTittle(),itemsOrdered[i].getCategory(),itemsOrdered[i].getDirector(),itemsOrdered[i].getLength(),itemsOrdered[i].getCost());
        }
        }
    }
   public void removeDigitalVideoDisc (DigitalVideoDisc disc){
        if(qtyOrdered ==0){
            System.out.println("Danh sach khong ton tai san pham nao!!!");
            System.exit(1);
        }
        else{
            for(int i=0; i<qtyOrdered; i++){
                 if(itemsOrdered[i].equals(disc)){
                    for(int j=i;j<qtyOrdered-1;j++){
                       itemsOrdered[j] = itemsOrdered[j+1];

                                      }
                    qtyOrdered --;
            }

            }
        }
    }


    public float totalCost(){
        float sum =0;
        for(int i=0; i<qtyOrdered; i++){
            sum += itemsOrdered[i].getCost();

        }
        return sum;
    }

}