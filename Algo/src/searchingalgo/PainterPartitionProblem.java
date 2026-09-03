package searchingalgo;

public class PainterPartitionProblem {

    static boolean isValidAnswer(int[] boards, int k, int maxLength) {

        int painterCount = 1;
        int paintedLength = 0;

        for (int i = 0; i < boards.length; i++) {

            // A single board itself cannot be painted
            // within the allowed maximum.
            if (boards[i] > maxLength) {
                return false;
            }

            // Give board to current painter
            if (paintedLength + boards[i] <= maxLength) {
                paintedLength += boards[i];
            } 
            // Need another painter
            else {
                painterCount++;
                paintedLength = boards[i];

                if (painterCount > k) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int painterPartition(int[] boards) {

        int sum = 0;

        // Calculate total board length
        for (int i = 0; i < boards.length; i++) {
            sum += boards[i];
        }

        int s = 0;
        int e = sum;
        int ans = -1;

        int k = 3;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            if (isValidAnswer(boards, k, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] boards = {5, 10, 30, 20, 15};

        System.out.println(painterPartition(boards));
    }
}