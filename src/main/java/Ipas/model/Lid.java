package Ipas.model;


import java.util.ArrayList;

public class Lid extends Acount {

    static int ledenAantalAanwezig = 0;
    static ArrayList<String> ledenn = new ArrayList<>();



    public  Lid(String acountNaam, String eMail , String wachtwoord , String rangKeuze, String privateKeyNummer) {

        super(acountNaam, eMail, wachtwoord, rangKeuze, privateKeyNummer);

        this.rangKeuze = "Lid";

        ledenAantalAanwezig++;

       Lid lis = new Lid(this.acountNaam,  this.eMail ,  this.wachtwoord ,  this.rangKeuze, this.privateKeyNummer);

        if ( !ledenn.contains(lis) ){
            ledenn.add(String.valueOf(lis));


    }}

public ArrayList<String> getLedden(){
        return ledenn;
}



    @Override
    public String getAcountNaam()  {
        return acountNaam;
    }
}