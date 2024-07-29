package Graph;
import java.util.*;
import java.util.ArrayList;

public class DFS {
    public static void dfs(ArrayList<ArrayList<Integer>> graph,int V,int S,boolean [] visited){
        System.out.println(S+" ");
        visited[S]=true;
        ArrayList<Integer> nbrs=graph.get(S);

        for(Integer nbr:nbrs){
            if(!visited[nbr]){
                dfs(graph,V,nbr,visited);
            }
        }
    }
    // For undirected graph
    public static boolean dfs_checkCycle(ArrayList<ArrayList<Integer>> graph,int V,int S,boolean [] visited,int parent){
        visited[S]=true;
        ArrayList<Integer> nbrs=graph.get(S);

        for(Integer nbr:nbrs){
            if(!visited[nbr]){
                if(dfs_checkCycle(graph,V,nbr,visited,S)){
                    return true;
                }
            }
            else if(nbr!=parent){
                return true;
            }
        }
        return false;
    }

    //For Directed Graph
    public static boolean dfs_checkCycle2(ArrayList<ArrayList<Integer>> graph,int V,int S,boolean [] visited, boolean []inPath){
        visited[S]=true;
        inPath[S]=true;
        ArrayList<Integer> nbrs=graph.get(S);

        for(Integer nbr:nbrs){
            if(!visited[nbr]){
                dfs_checkCycle2(graph,V,nbr,visited,inPath);
            }
            else if(inPath[S]){
                return true;
            }
        }
        inPath[S]=false;
        return false;
    }




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> graph =new ArrayList<>();
        int vertices=sc.nextInt();
        int source=sc.nextInt();
        boolean []visited=new boolean[vertices];
        dfs(graph,vertices,source,visited);


}
}