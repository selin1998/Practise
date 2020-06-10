public class Cartridge {

    public static int maxPerksItems(int cartridges, int dollars, int recycleReward, int perksCost) {
        int numOfPerks = Math.min(cartridges, dollars / perksCost);
        int cash=dollars%perksCost;
        int diff=cartridges-numOfPerks;
        if(diff==0) return numOfPerks;
        while(diff-- >0){
            cash+=recycleReward;
            if(cash>=diff*perksCost){
                numOfPerks+=diff;
                break;
            }
        }
        return  numOfPerks;


    }
    public static void main(String[] args) {
        System.out.println(maxPerksItems(10,10,2,2));
        System.out.println(maxPerksItems(4,8,3,4));
    }
}
