package leetcode75;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Kids with the greatest number of candies
public class Leet75_1431 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }

        return result;
    }

    // public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    //     int maxNum = Arrays.stream(candies).max().getAsInt();

    //     List<Integer> candiesObj = Arrays.stream(candies)
    //                                 .boxed()
    //                                 .collect(Collectors.toList());

    //     List<Boolean> result = candiesObj.stream().map(
    //         x -> (x + extraCandies) >= maxNum
    //     )
    //     .collect(Collectors.toList());
    //     return result;
    // }
}

/*
 * Có n đứa trẻ với nhiều cái kẹo
 * Bạn được đưa cho một arr kẹo, mỗi candies[i] đại diện cho số kẹo đứa trẻ thứ i có
 *  và một số nguyên extraCandies, biểu thị cho số kẹo thêm mà bạn có
 * Return arr boolean có length n, result[i] == true khi sau khi đưa cho đứa trẻ thứ i 
 *  toàn bộ extraCandies, nó sẽ có số kẹo lớn nhất trong đám trẻ, ngược lại thì là false
 * Lưu ý: nhiều đứa trẻ có thể có số lượng kẹo lớn
 */
