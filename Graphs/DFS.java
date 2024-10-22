package Graphs;

import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    static class node{
        int src;
        int des;
        node(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    static void Add_Graph(ArrayList<node> graph[], int n){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int j=0;j<n;j++){
            int src,des;
            System.out.print("Enter Source and Destination: ");
            src=sc.nextInt();
            des=sc.nextInt();
            node n1= new node(src,des);
            graph[src].add(n1);
        }

    }
    static void DF_S(ArrayList<node>[] graph,int current ,boolean[] visited){

        System.out.println(current);
        visited[current]=true;
        for(int i=0;i<graph[current].size();i++){
            int edge=graph[current].get(i).des;
            if(!visited[edge]){
            DF_S(graph,edge,visited);}
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of edges: ");
        int n=sc.nextInt();
        boolean[] visited = new boolean[n+1];
        ArrayList<node>[] graph =new ArrayList[n];
        Add_Graph(graph,n);
        DF_S(graph,0,visited);
    }
}
