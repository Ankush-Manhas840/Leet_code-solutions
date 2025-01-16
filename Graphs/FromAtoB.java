package Graphs;
import java.util.*;
import java.util.ArrayList;

public class Graph_implementation {
    static public class Vertex{
        int src;
        int des;
        Vertex(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    static void graph_add(ArrayList<Vertex> graph[],int edge){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for (int i=0;i< edge;i++){
            System.out.println("Enter SOURCE and DESTINATION of the edge");
            int src=sc.nextInt();
            int des=sc.nextInt();
            Vertex obj =new Vertex(src,des);
            graph[src].add(obj);
        }
        displayAscii(graph);
    }
    static void displayAscii(ArrayList<Vertex> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print(i + " -> ");
            for (Vertex vertex : graph[i]) {
                System.out.print(vertex.des + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Total Number Of EDGES");
        int n=sc.nextInt();
        ArrayList<Vertex> graph[] =new ArrayList[n];
        graph_add(graph,n);
    }
}
