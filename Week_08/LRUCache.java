class LRUCache {

    private Map<Integer,ListNode> map;
    private class ListNode{
        private Integer key;
        private Integer value;
        private ListNode pre;
        private ListNode next;
        public ListNode(){}
        public ListNode(Integer key,Integer value){
            this.key = key;
            this.value = value;
        }
    }
    private int capacity;
    private ListNode dummyHead;
    private ListNode dummyTail;
    public LRUCache(int capacity){
        map = new HashMap<>(capacity);
        this.capacity = capacity;
        dummyHead = new ListNode(-1,-1);
        dummyTail = new ListNode(-1,-1);
        dummyHead.next = dummyTail;
        dummyTail.pre = dummyHead;
    }


    
    public int get(int key) {
        if(map.containsKey(key)){
            ListNode node = map.get(key);
            int val = node.value;
            moveNode2Head(key);
            return val;
        }else{
            return -1;
        }

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.get(key).value = value;
            moveNode2Head(key);
            return;
        }
        if (map.size() == capacity) {
            // 如果满了
            ListNode oldTail = removeTail();

            // 设计 key 就是为了在这里删除
            map.remove(oldTail.key);
        }

        // 然后添加元素
        ListNode newNode = new ListNode(key, value);
        map.put(key, newNode);
        addNode2Head(newNode);

    }
    private ListNode removeTail() {
        ListNode oldTail = dummyTail.pre;
        ListNode newTail = oldTail.pre;

        // 两侧结点建立连接
        newTail.next = dummyTail;
        dummyTail.pre = newTail;

        // 释放引用
        oldTail.pre = null;
        oldTail.next = null;

        return oldTail;
    }
       private void moveNode2Head(int key) {
        // 1、先把 node 拿出来
        ListNode node = map.get(key);

        // 2、原来 node 的前驱和后继接上
        node.pre.next = node.next;
        node.next.pre = node.pre;

        // 3、再把 node 放在末尾
        addNode2Head(node);
    }
     private void addNode2Head(ListNode newNode) {
        // 1、当前头结点
        ListNode oldHead = dummyHead.next;

        // 2、末尾结点的后继指向新结点
        oldHead.pre = newNode;

        // 3、设置新结点的前驱和后继
        newNode.pre = dummyHead;
        newNode.next = oldHead;

        // 4、更改虚拟头结点的后继结点
        dummyHead.next = newNode;
    }






}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
