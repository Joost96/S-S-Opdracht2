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

        String[] fileNames = {"i1", "i2", "i3", "i4", "i5", "i6", "i7", "i8", "i9", "i10", "i11", "i12", "i13", "i14", "i15", "i16", "i17", "i18", "i19", "i20", "i21",
            "y22", "y23",
            "y24", 
            "y25",
            "Z26",
            "Z27",
            "Z28",};
        for (int i = 0; i < fileNames.length; i++) {
            System.out.print(fileNames[i] + ".png");
            EdgeWeightedDigraph EWD = new EdgeWeightedDigraph(fileNames[i]);
            Stopwatch stpw = new Stopwatch();
            Dijkstra dijkstra = new Dijkstra(EWD, EWD.getStart());
            System.out.print(","+dijkstra.count);
            if (dijkstra.hasPathTo(EWD.getEnd())) {
                EWD.tekenPad(dijkstra.pathTo(EWD.getEnd()));
                System.out.print(","+dijkstra.distTo(EWD.getEnd()));

            } else {
                System.out.print(",no path");
                System.out.print(",no path");
            }
            System.out.print(","+stpw.elapsedTime());
            System.out.print(","+dijkstra.edges);
            EWD.save(fileNames[i]);
            System.out.println("");
        }

    }

}
