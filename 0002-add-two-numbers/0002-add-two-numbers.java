/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
/*        ListNode result;

        int nums1 = 0;
        int nums2 = 0;

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for (int i = 0; i < l1.size(); i++) {
            str1.append(l1.get(i).toString());
        }
        for (int x = 0; x < l1.size(); x++) {
            str2.append(l2.get(x).toString());
        }

        nums1 += Integer.parseInt(String.valueOf(str1));
        nums2 += Integer.parseInt(String.valueOf(str2));

        int numResult = nums1 + nums2;

        String strResult = String.valueOf(numResult);

        for (int g = 0; g < strResult.length(); g++) {
            result.add(Integer.valueOf(strResult.substring(g, g + 1)));
        }

        return result;
*/
     ListNode result = new ListNode(0);
    ListNode ptr = result;

    int carry = 0;    // Set default carry

    while (l1 != null || l2 != null) {

      int sum = 0 + carry;    // Initialize sum

      if (l1 != null) {    // Use number from first list
        sum += l1.val;
        l1 = l1.next;
      }

      if (l2 != null) {    // Use number from 2nd list
        sum += l2.val;
        l2 = l2.next;
      }

      carry = sum / 10;    // Get sum and carry
      sum = sum % 10;
      ptr.next = new ListNode(sum);
      ptr = ptr.next;
    }

    if (carry == 1) ptr.next = new ListNode(1);

    return result.next;
    }
}