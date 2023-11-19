package com.chat.serveur;
import java.util.ArrayList;

import com.chat.commun.net.Connexion;

public class Invitation {
    private String aliasHote;
    private String aliasInvite;
    private SalonPrive salonPrive;



    public String getAliasInvite() {

        return aliasInvite;
    }
    public String getAliasHote() {
        return aliasHote;
    }
    public String InvitePersonne(String aliasInvite){

        String msg= "VOULEZ VOUS CHATTEZ AVEC " + aliasInvite;

        System.out.println(msg);

        return msg;
    }




}