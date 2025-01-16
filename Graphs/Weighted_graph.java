package Practice_self;
import java.util.*;
public class Weighted_graph {

    static public class vertex{
        int source;
        int weight;
        int destination;
        vertex(int src,int des,int wt){
            source=src;
            destination=des;
            weight=wt;
        }
    }
    static void add_graph( ArrayList<vertex> graph[],int edge){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<edge;i++){
            System.out.println("Enter SOURCE ,DESTINATION and WEIGHT of the edge");
            int src=sc.nextInt();
            int des=sc.nextInt();
            int wei=sc.nextInt();
            vertex obj=new vertex(src,des,wei);
            graph[src].add(obj);
        }
        displayAscii(graph);
    }
    static void displayAscii(ArrayList<vertex> graph[]) {
        System.out.println("Adjacency List of the Graph:");
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int j = 0; j < graph[i].size(); j++) {
                vertex edge = graph[i].get(j);
                System.out.print("(Dest: " + edge.destination + ", Weight: " + edge.weight + ") ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of Edge");
        int Edge=sc.nextInt();
        //arraylist of edges;
        ArrayList<vertex> graph[]=new ArrayList[Edge];
        add_graph(graph,Edge);
    }
}
