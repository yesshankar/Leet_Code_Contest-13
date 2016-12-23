/**
 * Created by Shankar on 12/17/2016.
 *
 *
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.

 Note:
 0 ≤ x, y < 231.

 Example:

 Input: x = 1, y = 4

 Output: 2

 Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
 ↑   ↑

 The above arrows point to positions where the corresponding bits are different.
 */
public class Solution1 {

    public static void main(String[] args) {

        System.out.println(hammingDistance(15,65));

    }
    public static int hammingDistance(int x, int y) {

        String xx = Integer.toBinaryString(x);
        String yy = Integer.toBinaryString(y);

        char[] cx = xx.toCharArray();
        char[] cy = yy.toCharArray();

        System.out.println(xx);
        System.out.println(yy);

        int i,j;
        int count = 0;

        if(cx.length < cy.length){

            for (i = cx.length-1, j = cy.length-1; i >=0 ; i--, j--) {
                if(cx[i] != cy[j])
                    count++;

            }

            for (int k = j; k >= 0 ; k--) {
                if(cy[k] == '1')
                    count++;
            }
        }else if(cx.length == cy.length){
            for (int k = 0; k < cx.length; k++) {
                if(cx[k] != cy[k])
                    count++;
            }
        }else{
            for (i = cy.length-1, j = cx.length-1; i >=0 ; i--, j--) {
                if(cy[i] != cx[j])
                    count++;

            }

            for (int k = j; k >= 0 ; k--) {
                if(cx[k] == '1')
                    count++;
            }
        }

        return count;

    }
}
