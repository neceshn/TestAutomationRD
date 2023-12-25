package org.example;

import java.util.ArrayList;

public class Departman {
    String adi;
    ArrayList<Personel> personels = new ArrayList<Personel>();

    public void PersonelEkle(Personel personel){
        personels.add(personel);
    }
    public void PersonelListele(){
        for(int i =0; i< personels.size();i++){
            System.out.println(personels.get(i).ad);
        }
    }
    public ArrayList<Personel> PersonelDondur(){
        return personels;
    }
}
