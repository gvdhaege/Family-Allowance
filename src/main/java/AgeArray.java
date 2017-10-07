public class AgeArray {

    BetaalInt nulTotVijf = new Betaal0Tot5();
    BetaalInt zesTotElf = new Betaal6Tot11();
    BetaalInt twaalfTotZeventien = new Betaal12Tot17();
    BetaalInt achttienPlus = new Betaal18Plus();
    BetaalInt[] ageArray = {nulTotVijf, zesTotElf, twaalfTotZeventien, achttienPlus};

    public BetaalInt[] getAgeArray(){
        return ageArray;
    }
}
