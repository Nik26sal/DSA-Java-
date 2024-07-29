package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_in_Matrix {
    static void findPath(int[][]mat,int row,int col,int x,int y) {

        boolean [][]visited=new boolean[row][col];
        Queue<int[]> q=new LinkedList<>();

        //mark visited
        visited[x][y]=true;
        q.add(new int[]{x,y});

        while(!q.isEmpty()){
            int[] curr=q.poll();
            int curr_x=curr[0];
            int curr_y=curr[1];
            System.out.print(mat[curr_x][curr_y]+" ");
            int[] dx={0,1};
            int[]dy={1,0};

            for(int i=0;i<2;i++){
                int nbr_x=curr_x+dx[i];
                int nbr_y=curr_y+dy[i];
                if(nbr_x>=0 && nbr_x<row && nbr_y>=0 && nbr_y<col && !(visited[nbr_x][nbr_y])){
                    visited[nbr_x][nbr_y]=true;
                    q.add(new int[]{nbr_x,nbr_y});
                }
            }
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int m = 3;
        int[][] matrix = {{1, 2, 3},
                {4,5, 6},
                {7,8,9}};

        findPath(matrix, 3, 3,0,0);
    }
}