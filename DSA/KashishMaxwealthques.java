package DSA;

public class KashishMaxwealthques {
    public static void main(String[] args) {
        int[][] accounts={{1,5,3},{3,2,1}};
        System.out.println(maximumwealth(accounts));
    }
    public static int maximumwealth(int[][] accounts){
//        person - row
//        account - col
        int ans=Integer.MIN_VALUE;
        for (int person=0;person<accounts.length;person++){
//            while starting new col, take sum for that row
            int sum=0;
            for (int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
    }

}
