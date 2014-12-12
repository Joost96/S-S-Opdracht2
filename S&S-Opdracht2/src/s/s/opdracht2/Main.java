package s.s.opdracht2;

import PO2Library.EdgeWeightedDigraph;
import nl.hva.dmci.ict.inf.ads.lib.Stopwatch;


/**
 *
 * @author Joost
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        EdgeWeightedDigraph EWD = new EdgeWeightedDigraph("i1");
        Stopwatch stpw = new Stopwatch();
        Dijkstra dijkstra = new Dijkstra(EWD, EWD.getStart());
        System.out.println(dijkstra.distTo(EWD.getEnd()));
        EWD.tekenPad(dijkstra.pathTo(EWD.getEnd()));
        System.out.println(stpw.elapsedTime());
        EWD.save("i1-1");
        System.out.println(dijkstra.count);
        
        
        
    }
    
}
