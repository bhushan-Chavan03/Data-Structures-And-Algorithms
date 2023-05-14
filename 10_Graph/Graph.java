import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph{
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    static void BFS(ArrayList<Edge>[] graph){
        Queue <Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[graph.length];
        q.add(0);//source=0

        while(!q.isEmpty()){
            int curr=q.remove();

            if(!vis[curr]){
                System.out.println(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);

                }
            }
        }
    }

      static void DFS(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        System.out.println(curr+" ");
        vis[curr]=true;

        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                DFS(graph,e.dest,vis);
            }

        }

         

      }

    public static void main(String []args){
        int v=5;
        ArrayList <Edge>[]graph=new ArrayList[v];
        for(int i=0;i<v;i++){
            graph[i]=new ArrayList<>();

        }

        //0
        graph[0].add(new Edge(0, 1, 5));

        //1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        //2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 4));

        //3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //4
        graph[4].add(new Edge(4, 2, 1));

        //2's neighbours
        for(int  i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.dest);
        }
        //BFS(graph);
        //DFS(graph,0,new boolean[v]);



    }
}