class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer> al=new ArrayList<>();
        boolean[]visited=new boolean[V];
        f(0,visited,al,adj);
        return al;
        
    }
    public void f(int node,boolean[] visited,ArrayList<Integer>al,ArrayList<ArrayList<Integer>>adj){
        visited[node]=true;
        al.add(node);
        for(int i:adj.get(node)){
            if(visited[i]==false){
                f(i,visited,al,adj);
            }
        }
        
    }
}
