package searchingalgo;

public class FindSqureRootUsingBS {
    public static int findSqurRoot(int x) {
        int s = 0;
        int e = x;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (mid == x/mid) {
                return mid;
            } else if (mid > x/mid) {
                e = mid - 1;
            } else {
                ans = mid;
                s = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(findSqurRoot(214739560));
    }
}
