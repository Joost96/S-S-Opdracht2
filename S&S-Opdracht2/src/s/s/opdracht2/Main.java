package s.s.opdracht2;

import PO2Library.EdgeWeightedDigraph;

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
        Dijkstra dijkstra = new Dijkstra(EWD, EWD.getStart());
        System.out.println(dijkstra.distTo(EWD.getEnd()));
        EWD.tekenPad(dijkstra.pathTo(EWD.getEnd()));
        EWD.save("i1-1");
        System.out.println(dijkstra.count);
        
    }
    
}
