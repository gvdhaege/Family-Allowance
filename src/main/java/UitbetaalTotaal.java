public class UitbetaalTotaal {


    int aantalKeerUitbetaald;


//    for each loop met kinderen(?)

    BetaalInt betaalInt = new BetaalBasis();

    AgeArray ageArrayObject = new AgeArray();
    BetaalInt[] leeftijdArray = ageArrayObject.getAgeArray();

    public double betaal(){
        aantalKeerUitbetaald++;

//        for each loop met elementen van array

        int totaal = betaalInt.betaalUit(aantalKeerUitbetaald);


//                  Array[0----]

        return totaal/100.0;
    }
}


