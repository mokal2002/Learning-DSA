package ekospoj;

public class Tree{

    public static int maxtree(int trees[]){
        int n = trees.length;
        int s=0;
        int max= -1;
        for (int i = 0; i < n; i++) {
            if (trees[i] > max) {
                max = trees[i];
            }
        }
        int e = max;
        int ans =-1;

        while (s <= e) {
            int mid = s + (e-s)/2;

            int m = 7;
            if (validAns(trees,m,mid)) {
                ans = mid;
                s = mid +1;
            }else{
                e = mid - 1;
            }
            
        }
        return ans;
    }
    public static boolean validAns(int[] trees,int m,int mid) {
        int totalWoodCollected = 0;
        for (int i = 0; i < trees.length; i++) {
            if (trees[i] > mid) {
                int currentTreeWood = trees[i];
                totalWoodCollected += currentTreeWood;
            }
        }
        if (totalWoodCollected >= m) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int[] trees = {20,15,10,14};
        System.out.println(maxtree(trees));
    }
}