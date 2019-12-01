package z.learn;

public class QLCP3Robot {

    public static void main(String[] args) {
        QLCP3Robot qlcp3Robot = new QLCP3Robot();
        System.out.println(qlcp3Robot.robot("RRU", new int[][]{{6, 4}}, 1486, 743));
        System.out.println(qlcp3Robot.robot("URR", new int[][]{}, 3, 2));
    }

    public boolean robot(String command, int[][] obstacles, int x, int y) {
        int xLocation = 0;
        int yLocation = 0;

        int maxX = 0;
        int minX = Integer.MAX_VALUE;
        int maxY = 0;
        int minY = Integer.MAX_VALUE;
        for (int[] obstacle : obstacles) {
            maxX = Math.max(obstacle[0], maxX);
            minX = Math.min(obstacle[0], minX);
            maxY = Math.max(obstacle[1], maxY);
            minY = Math.min(obstacle[1], minY);
        }

        while (true)
            for (char c : command.toCharArray()) {
                switch (c) {
                    case 'U':
                        yLocation++;
                        if (checkEqual(x, y, xLocation, yLocation)) {
                            return true;
                        } else if (yLocation > y) {
                            return false;
                        }
                        if (yLocation <= maxY && yLocation >= minY) {
                            for (int[] obstacle : obstacles) {
                                if (checkEqual(obstacle[0], obstacle[1], xLocation, yLocation)) {
                                    return false;
                                }
                            }
                        }
                        break;
                    case 'R':
                        xLocation++;
                        if (checkEqual(x, y, xLocation, yLocation)) {
                            return true;
                        } else if (xLocation > x) {
                            return false;
                        }
                        if (xLocation <= maxX && xLocation >= minX) {
                            for (int[] obstacle : obstacles) {
                                if (checkEqual(obstacle[0], obstacle[1], xLocation, yLocation)) {
                                    return false;
                                }
                            }
                        }
                        break;
                    default:
                        throw new RuntimeException("wrong command ex");
                }
            }
    }

    private boolean checkEqual(int x, int y, int robotX, int robotY) {
        return x == robotX && y == robotY;
    }
}
