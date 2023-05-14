import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class graph1 {

    static class edge{
        int source;
        int dest;
        int wt;

        edge(int source, int dest,int wt){
            this.source=source;
            this.dest=dest;
            this.wt=wt;
        }
    }

    static void BFS(ArrayList<edge> graph[]){
        Queue <Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()){
           int curr=q.remove();

           if(!vis[curr]){
            System.out.println(curr+" ");
            vis[curr]=true;
            for(int i=0;i<graph[0].size();i++){
                edge e=graph[0].get(i);
                q.add(e.dest);
            }
           }
        }
    }

    static void DFS(ArrayList<edge> graph[],int curr,boolean vis[]){
        System.out.println(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                DFS(graph, e.dest, vis);
            }
        }

            
    }



    public static void main(String []args){
        ArrayList<edge> graph[]=new ArrayList[4];

        for(int i=0;i<4;i++){
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 0, 1));

        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        graph[3].add(new edge(3, 1, 1));

        BFS(graph);
        System.out.println();
        DFS(graph,0,new boolean [4]);



    }
    
}
