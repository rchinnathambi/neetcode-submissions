/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Map<Node, Node> copyMap = new HashMap<>();
        //copyMap.put(null, null);

        Node copyNodes = head;
        while(copyNodes != null) {
            Node copy = new Node(copyNodes.val);
            copyMap.put(copyNodes, copy);
            copyNodes = copyNodes.next;
        }

        copyNodes = head;
        while(copyNodes != null) {
            Node copy = copyMap.get(copyNodes);
            copy.next = copyMap.get(copyNodes.next);
            copy.random = copyMap.get(copyNodes.random);
            copyNodes = copyNodes.next;
        }

        return copyMap.get(head);
    }
}
