package searchingalgo;

public class FindSqureRootUsingBS {
    public static int findSqurRoot(int x) {
        int s = 1;
        int e = x;
        double ans = -1;

        if (x == 0) {
            return 0;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid > x / mid) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }

        double factor = 1;
        int totalPrecsion = 3;
        for (int round = 1; round <= totalPrecsion; round++) {
            factor = factor / 10;
            for (int i = 1; i <= 10; i++) {
                double newAns = ans + factor;
                // if (newAns * newAns == x) {
                //     return -1;
                // } 
                if (newAns * newAns < x) {
                    ans = newAns;
                } else {
                    break;
                }
            }
            System.out.println("For The First Round Ans: "+ ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSqurRoot(56));
    }
}
