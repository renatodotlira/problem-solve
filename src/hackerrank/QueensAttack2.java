package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class QueensAttack2 {

        private static int[][] directions = {{ 1,  0}, { 1,  1}, { 1, -1}, {-1, -1}, {-1,  1}, {-1,  0}, { 0, -1}, { 0,  1}};
        private static long numOfMoves = 0;

        public static void main(String[] args) {
            int[][] obstacles = {{1, 1}, {21, 21}, {31, 31}, {1, 201}, {201, 1}};
            queensAttack(100000, 0, 1 , 1, obstacles);
            System.out.println(numOfMoves);
        }

        // Complete the queensAttack function below.
        static long queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
            Map<String, Boolean> obs = new HashMap<>();
            for (int[] v : obstacles)
                obs.put(v[0] +","+ v[1], true);

            for (int[] direction : directions)
                walk(direction, r_q, c_q, n, obs);

            return numOfMoves;
        }

        static void walk(int[] direction, int r, int c, int limit, Map<String, Boolean> obstacles){
            boolean hadCollision = false;
            while(!hadCollision){
                r += direction[0];
                c += direction[1];
                if(isColision(r, c, obstacles, limit))
                    hadCollision = true;
                else {
                    numOfMoves++;
                }
            }
        }

        static boolean isColision(int r, int c, Map<String, Boolean> obstacles, int limit){
            return isColisionLimit(r, c, limit) || isColisionObstacle(r, c, obstacles);
        }

        static boolean isColisionLimit(int r, int c, int limit){
            return r <= 0 || r > limit || c <= 0 || c > limit;
        }

        static boolean isColisionObstacle(int r, int c, Map<String, Boolean> obstacles){
            return obstacles.containsKey(r + "," + c);
        }


}
