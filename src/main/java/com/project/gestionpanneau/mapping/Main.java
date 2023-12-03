package com.project.gestionpanneau.mapping;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        get pointage of all past days  for  each salle in sector
/*   String dateString = "2023-12-30";
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate localDate = LocalDate.parse(dateString, formatter);
    Date date = new Date(Date.valueOf(localDate).getTime());

    Salle salle = new Salle();
    Salle[] listSalle = salle.getSalleInSector("SEC0001");

    Object object = new Object();

    Pointage pointage = new Pointage();
    double[] avgArrayAllSalle = new double[listSalle.length];

    for (int i = 0; i < listSalle.length; i++) {
    Pointage[] pointageList = pointage.getPointageDay(listSalle[i].getId(),date);
    double[] avgsSalle = new double[listSalle.length];
        for (int j = 0; j < pointageList.length; j++) {
            double avgPointage = pointageList[j].getAvg(); /// maka ilay avg rehetra ana salle
            avgsSalle[j] = avgPointage;
        }
//        System.out.println("length " +avgsSalle.length);
    double avgSalle = object.sum(avgsSalle)/avgsSalle.length; /// avg par salle
    avgArrayAllSalle[i] = avgSalle;
    System.out.println("avg pointage salle " +avgSalle);
    }
    double avgSecteur = object.sum(avgArrayAllSalle)/avgArrayAllSalle.length; // avg secteur
    System.out.println("avg secteur " +avgSecteur);
*/

//        --------------- get luminosite  per hour of the day
/*        Meteo meteo = new Meteo();
        String date = "2023-12-23";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(date, formatter);
        Meteo[] listMeteo = meteo.getMeteoDay(Date.valueOf(localDate));
        for (int i = 0; i < listMeteo.length; i++) {
            System.out.println("Heure " +listMeteo[i].getDate() +" Luminosite "+listMeteo[i].getLuminosite());
        }
*/


//        ---------- to get capacity secteur -----------

/*
        Panneau panneau = new Panneau();
        Batterie batterie = new Batterie();

        Source source = new Source();
        Source[] secteurInfo = source.getInfoSecteur("SEC0001");
        double[] listPanneau = new double[secteurInfo.length];
        double[] listBatterie = new double[secteurInfo.length];

        for (int i = 0; i < secteurInfo.length; i++) {
            double capacitePanneau =  panneau.getInfoPanneau(secteurInfo[i].getPanneau()).getCapacite();
            listPanneau[i] =  capacitePanneau;

            double capaciteBatterie = batterie.getInfoBatterie(secteurInfo[i].getBatterie()).getPuissance();
            listBatterie[i] = capaciteBatterie;
        }
        double capacitySecteur = source.capacitySecteur(listPanneau, listBatterie) ;
        System.out.println("capacity secteur " +capacitySecteur); */
    }
}
