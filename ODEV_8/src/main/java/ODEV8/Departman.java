package ODEV8;

import java.util.ArrayList;
import java.util.List;
public class Departman {
    Personel teamlead;
    List<Personel> personelList;
    List<String> atananListesi;

    public Departman(Personel teamlead){
        this.teamlead=teamlead;
        this.personelList= new ArrayList<>();
        this.atananListesi= new ArrayList<>();
    }
    public void takimLideriDegistir(Personel newTeamLead) {
        this.teamlead = newTeamLead;
    }
    public void personelEkle(Personel person) {
        personelList.add(person);
    }
    public void personelListele(){
        for(int i =0; i< personelList.size();i++){
            System.out.println(personelList.get(i).personelAdi + " " + personelList.get(i).personelSoyadi + " personeli listeye eklendi.");
        }
    }
    public void personelSil(Personel person){
        personelList.remove(person);
        System.out.println(person.personelAdi + " " + person.personelSoyadi + " isimli Personel listeden kaldırıldı.");
    }
    public void personelDegistir(Personel eskiPersonel,Personel yeniPersonel){
        int index = personelList.indexOf(eskiPersonel);
        if(index !=-1){
        personelList.set(index,yeniPersonel);
    }}
    public void gorevEkle(String assignment) {
        atananListesi.add(assignment);
    }
    public void gorevIsaretle(String assignment) {
        atananListesi.remove(assignment);
    }
}
