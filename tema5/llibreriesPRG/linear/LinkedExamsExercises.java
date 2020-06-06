package linear;

/**
 * Exercicis d'examen sobre seqüencies enllaçades..
 *
 * @author PRG
 * @version 2020
 */
public class LinkedExamsExercises {
    /** Hidden Constructor for utility class */
    private LinkedExamsExercises() { }

    /**  P2 - Curs 17/18:2.5 punts Es  demana: implementar  un  mètode  estàtic  tal  que,  donat  un String s,  el  
     * convertisca  en  una  seqüència enllaçada  de  caràcters  on  el  primer  element  de  la  seqüència  ha  de  ser  el  primer
     * caràcter  de  l’String s.   Si l’String s està buit o  és null, la seqüència resultant
     * serà també null; si no, retornarà el primer node de la seqüència.  
     * Per a aix`o,  es suposa accessible una classe Node Char idèntica a la clase NodeInt 
     * utilitzada en el paquet linear, excepte en el tipus de la dada. Per exemple, donat 
     * l’String s = "Examen", la seqüència serà:
     *  → ‘E’ → ‘x’ → ‘a’ → ‘m’ → ‘e’ → ‘n’
     */
    public static NodeChar stringToCharSeq(String s) {
        NodeChar res = null;
        for (int i = s.length() - 1; i >= 0; i--) {
            res = new NodeChar(s.charAt(i), res);
        }
        return res;
    }
    
    
    /**
     * mateix mètode però recursiu
     */
    
    public static NodeChar stringToCharSeqREC(String s) {
        NodeChar res = null;
        if (s.length() == 0) {
            return res;
        } else {
            res = new NodeChar(s.charAt(0), stringToCharSeqREC(s.substring(1)));
        }
        return res;
    } 
    /**
     * RecP2 - Curs 17/18: 2.5 punts 
     * Es demana: implementar un mètode estàtic que reba una seqüència enllaçada NodeInt i 
     *  retorne una altra seqüència enllaçadacada NodeInt que continga solament les dades 
     *  parelles de la seqüència rebuda. Per exemple, si la seqüència rebuda contè les 
     *  següents dades: 4 7 2 8 9 3 6 , s'ha de retornar la següent seqüència: 4 2 8 6.
     *  S'ha de tindre en compte que si la seqüència rebuda é null o si no conté dades 
     *  parelles, s'ha de retornar null.
     */
    public static NodeInt selectEvenNumbers(NodeInt seq) {        
        NodeInt res = null;
        NodeInt aux = seq;
        NodeInt ultim = null;
        while (aux != null) {  
            if (aux.data % 2 == 0) {
                if (res == null) {
                    res = new NodeInt(aux.data);
                    ultim = res;
                } else {
                    ultim.next = new NodeInt(aux.data);
                    ultim = ultim.next;
                }
            }
            aux = aux.next;
        }
        return res;
    }
}
