class Solution {
    public int countRestrictedPaths(int n, int[][] edges) {
        // public int countRestrictedPaths(int n, int[][] edges) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
        int[] dist = new int [n+1];
        long[] restrictedPathCount = new long[n+1];
        boolean[] visited = new boolean[n+1];
        restrictedPathCount[n] = 1;
        
        for(int[] e : edges){
            graph.computeIfAbsent(e[0], x -> new ArrayList<>()).add(new int[] { e[1], e[2] });
            graph.computeIfAbsent(e[1], x -> new ArrayList<>()).add(new int[] { e[0], e[2] });
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0, n});    //{distance, nodeNum}
        while(n > 0){
           int[] curr = pq.poll();
           if(visited[curr[1]]) continue;
           n--;  visited[curr[1]] = true;   dist[curr[1]] = curr[0];
            
            for(int[] edge : graph.get(curr[1])){
                if(visited[edge[0]] && dist[curr[1]] > dist[edge[0]])
                    restrictedPathCount[curr[1]] = ( restrictedPathCount[curr[1]]+restrictedPathCount[edge[0]] )%1_000_000_007;
                else if(!visited[edge[0]])
                    pq.offer(new int[]{dist[curr[1]]+edge[1], edge[0]});
            }
        }
        return (int)restrictedPathCount[1];
    }
        
    }
