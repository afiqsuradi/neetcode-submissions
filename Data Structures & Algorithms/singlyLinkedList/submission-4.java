class LinkedList {
    class Node{
        private Integer value;
        private Node next;

        public Node(int v){
            this.value = v;
        }

        public boolean hasNext(){
            return this.next != null;
        }

        public Integer getValue(){
            return this.value;
        }

        public Node getNext(){
            return this.next;
        }

        public void setNext(Node node){
            this.next = node;
        }
    }
    private Node head;

    public LinkedList() {
    }

    public int get(int index) {
        if(head == null) return -1;
        Node curr = this.head;
        for(int i = 0; i < index; i++){
            if(curr.hasNext()){
                curr = curr.getNext();
            } else {
                return -1;
            }
        }
        return  curr.getValue();
    }

    public void insertHead(int val) {
        if(this.head == null){
            this.head = new Node(val);
        } else {
            Node newHead = new Node(val);
            newHead.setNext(this.head);
            this.head = newHead;
        }
    }

    public void insertTail(int val) {
        if(head == null){
            this.head = new Node(val);
        } else {
            Node newNode = new Node(val);
            Node curr = this.head;
            while(curr.hasNext()){
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
        
    }

    public boolean remove(int index) {
        if(head == null) return false;
        Node prev = null;
        Node curr = this.head;

        // [] -> [] -> [] -> [](idx: 3)
        for(int i = 0; i < index; i++){
            if(i == index) break;
            if(!curr.hasNext()) return false;
            prev = curr;
            curr = curr.getNext();
        }

        // If idx 0
        if(index == 0){
            if(curr.hasNext()){
                this.head = curr.getNext();
            } else{
                this.head = null;
            }
            return true;
        }

        
        if(curr.hasNext()){
            // Has Next
            prev.setNext(curr.getNext());
        } else {
            // No Next
            prev.setNext(null);
        }
        return true;

    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        Node curr = this.head;
        while(curr != null){
            values.add(curr.getValue());
            curr = curr.getNext();
        }
        return values;
    }
}
