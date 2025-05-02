package DSA.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Graph_Imp_Using_AdjacencyList {
    private LinkedList<Integer> adjacency[];
    public Graph_Imp_Using_AdjacencyList(int v){
        adjacency=new LinkedList[v];// array size
        for (int i = 0; i < v; i++) {
            System.out.println(i);
            adjacency[i]=new LinkedList<Integer>();
        }
    }
    private void insertedge(int s, int d) {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    private void bfs(int source){
        boolean vertices_node[]=new boolean[adjacency.length];
        int parent_node[]=new int[adjacency.length];
        Queue<Integer> q=new LinkedList<>();
        vertices_node[source]=true;
        parent_node[source]=-1;
        q.add(source);
        while (!q.isEmpty()){
            int p=q.poll();
            System.out.println("poll: "+p);
            for (int i:adjacency[p]){
                if(vertices_node[i]!=true){
                    vertices_node[i]=true;
                    q.add(i);
                    parent_node[i]=p;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Graph_Imp_Using_AdjacencyList g=new Graph_Imp_Using_AdjacencyList(v);
        System.out.println("Enter the edges");
        for (int i = 0; i < e; i++) {
            System.out.println(i);
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertedge(s,d);
        }
        System.out.println("Enter the source");
        int source=sc.nextInt();
        g.bfs(source);
    }
}
