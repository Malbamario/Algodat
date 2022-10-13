package com.malba.algodat.kelas.tugas1;

public class McDonalds {
    DriveThruCustomer driveThruList, temp=null;

    MCDMenu[] menus = {
            new MCDMenu("Burger Cheese",35000),
            new MCDMenu("Apple Pie", 12000)
    };

    int income=0;

    public void makeOrder(DriveThruCustomer customer, int order, int amount){
        customer.setOrder(menus[order-1].name);
        customer.setAmount(amount);
        if(driveThruList==null) driveThruList = customer;
        else{
            do{
                if(temp==null) temp = driveThruList;
                else temp = temp.getNext();
                if(temp.isTail()){
                    temp.setNext(customer);
                    break;
                }
            }
            while(true);
        }

    }

    public void takeOrder(){
        for(MCDMenu menu: menus){
            if(menu.name.equals(driveThruList.getOrder())){
                income += menu.price*driveThruList.getAmount();
            }
        }
        driveThruList = driveThruList.getNext();
    }
}
