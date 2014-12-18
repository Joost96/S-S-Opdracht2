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
            "y22", "y23", "y24", "y25", "Z26", "Z27", "Z28",
            "j29", "j30", "k31", "k32", "j33"};

        double avgNanoTime = 0;
        for (int i = 0; i < 10; i++) {
            EdgeWeightedDigraph EWD = new EdgeWeightedDigraph(fileNames[1]);
            Dijkstra dijkstra = new Dijkstra(EWD, EWD.getStart());
        }
        for (int i = 0; i < fileNames.length; i++) {

            for (int j = 0; j < 10; j++) {

                System.out.print(fileNames[i] + ".png");
                EdgeWeightedDigraph EWD = new EdgeWeightedDigraph(fileNames[i]);
                double start = System.nanoTime();
                Dijkstra dijkstra = new Dijkstra(EWD, EWD.getStart());
                System.out.print("," + dijkstra.count);
                if (dijkstra.hasPathTo(EWD.getEnd())) {
                    EWD.tekenPad(dijkstra.pathTo(EWD.getEnd()));
                    System.out.print("," + dijkstra.distTo(EWD.getEnd()));

                } else {
                    System.out.print(",no path");
                    System.out.print(",no path");
                }
                double end = System.nanoTime();
                double microseconds = (end - start) / 1000;
                avgNanoTime = avgNanoTime + microseconds;

                System.out.print(",\t" + microseconds);
                System.out.print("\t," + dijkstra.edges);
                //EWD.save(fileNames[i]);
                System.out.println("");
                if (j == 9) {
                    System.out.println("\n avg time of " + fileNames[i] + "in nano seconds = " + avgNanoTime / 10 + "\n");
                    avgNanoTime = 0.0;
                }
            }
        }

    }

}
