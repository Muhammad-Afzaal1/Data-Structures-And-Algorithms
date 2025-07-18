public class SinglyLinkedList <E>{
    private class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E element, Node<E> next){
            this.element = element;
            this.next = next;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public void setNext(Node<E> next){
            this.next = next;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedList(){ };

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public E first(){
        if(isEmpty()) return null;
        return head.getElement();
    }
    public E last(){
        if(isEmpty()) return null;
        return tail.getElement();
    }
    public void addFirst(E element){
        head = new Node<>(element, head);
        if(size== 0){
            tail = head;
        }
        size++;
    }
    public void addLast(E element){
        Node<E> newNest = new Node<>(element, null);
        if(size==0){
            head = newNest;
        }else{
            tail.setNext(newNest);
        }
        tail = newNest;
        size++;
    }
    public E removeFirst(){
        if(isEmpty()) return  null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return answer;
    }

}
