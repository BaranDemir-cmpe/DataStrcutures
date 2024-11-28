package graph;

public class Main {

	public static void main(String[] args) {
		int V = 8; 
        int E = 14; 
        Graph graph = new Graph(V, E);
        

        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 12;


        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 17;


        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 20;


        graph.edge[3].src = 1;
        graph.edge[3].dest = 2;
        graph.edge[3].weight = 21;

        graph.edge[4].src = 1;
        graph.edge[4].dest = 7;
        graph.edge[4].weight = 19;


        graph.edge[5].src = 2;
        graph.edge[5].dest = 3;
        graph.edge[5].weight = 4;

        graph.edge[6].src = 2;
        graph.edge[6].dest = 4;
        graph.edge[6].weight = 88;

        graph.edge[7].src = 2;
        graph.edge[7].dest = 6;
        graph.edge[7].weight = 6;

        graph.edge[8].src = 3;
        graph.edge[8].dest = 5;
        graph.edge[8].weight = 15;

        graph.edge[9].src = 3;
        graph.edge[9].dest = 6;
        graph.edge[9].weight = 13;

        graph.edge[10].src = 4;
        graph.edge[10].dest = 5;
        graph.edge[10].weight = 30;

        graph.edge[11].src = 4;
        graph.edge[11].dest = 6;
        graph.edge[11].weight = 37;

        graph.edge[12].src = 4;
        graph.edge[12].dest = 7;
        graph.edge[12].weight = 19;

        graph.edge[13].src = 5;
        graph.edge[13].dest = 6;
        graph.edge[13].weight = 44;


        graph.KruskalMST();

	}

}
