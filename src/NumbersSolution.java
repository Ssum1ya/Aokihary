import javax.lang.model.type.NullType;
import java.lang.reflect.Array;
import java.util.ArrayList;

class ListNode {
    public Integer val;
    ListNode next;

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class NumbersSolution {
    private static ArrayList<Integer> ListNodeToArrayList(ListNode l){
        ArrayList<Integer> answer = new ArrayList<Integer>();
        ListNode cur = l;
        while (true) {
            try {
                answer.add(cur.val);
            } catch (Exception e) {
                break;
            }
            cur = cur.next;
        }
        return answer;
    }

    public static ListNode ArrayListToNodeList(ArrayList<Integer> arrayList){
        ListNode answer = new ListNode(arrayList.get(0), null);
        ListNode cur = answer;
        for (int i = 1; i < arrayList.size(); i++) {
            cur.next = new ListNode(arrayList.get(i), null);
            cur = cur.next;
        }
        return answer;
    }

    public static ArrayList<Integer> addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> array1 = ListNodeToArrayList(l1);
        ArrayList<Integer> array2 = ListNodeToArrayList(l2);
        while (!(array1.size() == array2.size())) {
            if (array1.size() < array2.size()) {
                array1.add(0);
            } else if (array2.size() < array1.size()) {
                array2.add(0);
            }
        }

        ArrayList<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < array1.size(); i++) {
            answer.add((array1.get(i) + array2.get(i)) % 10);
            try {
                array1.set(i + 1, array1.get(i + 1) + ((array1.get(i) + array2.get(i)) / 10));
            } catch (Exception e) {
                if (!(((array1.get(i) + array2.get(i)) / 10) == 0)) {
                    answer.add(((array1.get(i) + array2.get(i)) / 10));
                }
            }
        }
       return answer;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, null))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ArrayList<Integer> arrayList = addTwoNumbers(l1, l2);
        ListNode listNode = ArrayListToNodeList(arrayList);
        System.out.println(arrayList);
        System.out.println(ListNodeToArrayList(listNode));
    }
}