import java.util.*;
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        // b -> a
        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }
        int[] state = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (state[i] == 0) {
                if (hasCycle(graph, state, i)) {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean hasCycle(List<List<Integer>> graph, int[] state, int node) {
        if (state[node] == 1)
            return true;
        if (state[node] == 2)
            return false;
        state[node] = 1;
        for (int next : graph.get(node)) {
            if (hasCycle(graph, state, next))
                return true;
        }
        state[node] = 2;
        return false;
    }
}