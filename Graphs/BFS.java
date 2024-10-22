package Practice_self;
import java.util.*;
public class BFS {
    public static class node{
        int src;
        int des;
        node(int src,int des){
            this.src=src;
            this.des=des;
        }
    }
    static void Add_Graph(ArrayList<node> graph[],int n){
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

    static void BF_S(ArrayList<node> graph[],int n){
        Queue<Integer> ab=new ArrayDeque<>();
        boolean [] Visited_arr=new boolean[n+1];
        ab.add(0);
        int count=0;
        while(!ab.isEmpty()) {
            int cur = ab.remove();
            if (!Visited_arr[cur]) {
                System.out.print(cur+" ");
                Visited_arr[cur] = true;
                count++;
                int edge=0;
                for(int i=0;i<graph[cur].size();i++){
                    edge=graph[cur].get(i).des;
                    ab.add(edge);
                }

            }

        }


    }



    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of edges: ");
        int n=sc.nextInt();
        ArrayList<node> graph[] =new ArrayList[n];
        Add_Graph(graph,n);
        BF_S(graph,n);

    }
}
