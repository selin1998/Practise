import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShoppingCart {

    static class Discount{
        String tag;
        String type;
        String amount;

        public Discount(String tag, String type, String amount) {
            this.tag = tag;
            this.type = type;
            this.amount = amount;
        }
    }



    public static int typeOf(String price, String type,String discount){
        int discountedPrice=0;
        int p=Integer.parseInt(price);
        int d=Integer.parseInt(discount);
        switch(Integer.parseInt(type)){
            case 0:
                discountedPrice=p;
                break;
            case 1:
                discountedPrice=p-(p*d)/100;
                break;
            case 2:
                discountedPrice=p-Integer.parseInt(discount);
                break;
        }
        return discountedPrice;

    }
    public static int findLowestPrice(List<List<String>> products, List<List<String>> discounts) {
        List<Integer> list = new ArrayList<>();
        List<String> flattened = discounts.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
        List<Discount> discountList = IntStream.range(0, flattened.size() / 3).mapToObj(i -> new Discount(flattened.get(i * 3), flattened.get(i * 3 + 1), flattened.get(i * 3 + 2))).collect(Collectors.toList());
        for (int i = 0; i < products.size(); i++) {
            String price=products.get(i).get(0);
            int min=Integer.MAX_VALUE;
            for (int j = 0; j < products.get(i).size(); j++) {

                    if(j!=0){
                        final String str=products.get(i).get(j);
                        Discount discount = discountList.stream().filter(z -> z.tag.equals(str)).findFirst().get();
                        int of = typeOf(price, discount.type, discount.amount);
                        if(of<min){
                            min=of;
                        }

                    }


            }
            list.add(min);


        }

       return list.stream().mapToInt(i->i).sum();
    }

    public static void main(String[] args) {
            
    }
}
