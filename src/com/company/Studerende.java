package com.company;

import java.util.Arrays;

public class Studerende {

    String fornavn;
    String mellemnavn;
    String efternavn;

    int studienr;

    String[] fag = new String[2];

    //Default konstruktør
    Studerende () {} //new Studerende();

    //Konstruktør med parametre
    Studerende (String fornavn, String mellemnavn, String efternavn, int studienr, String fag1, String fag2){

        this.fornavn = fornavn;
        this.mellemnavn = mellemnavn;
        this.efternavn = efternavn;
        this.studienr = studienr;
        this.fag[0] = fag1;
        this.fag[1] = fag2;
    }

    Studerende (String fornavn, String efternavn, int studienr, String [] fag){
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.studienr = studienr;
        this.fag = fag;
    }
    public void setFag (String fag1, String fag2){
        fag[0] = fag1;
        fag[1] = fag2;
    }

    @Override
    public String toString() {
        return "Studerende{" +
                "fornavn='" + fornavn + '\'' +
                ", efternavn='" + efternavn + '\'' +
                ", studienr=" + studienr +
                ", fag=" + Arrays.toString(fag) +
                '}';
    }



    public int compareTo(Studerende anden){
        if (this.studienr == anden.studienr) { //Er de ens?
            return 0;
        }
        else if (this.studienr < anden.studienr){ //Er denne mindre end den anden?
            return -1;
        }
        return 1;  //Er denne større end den anden?
    }
    public boolean equals (Studerende anden){
        if (this.studienr == anden.studienr) {
            return true;
        }
        return false;
    }
}
