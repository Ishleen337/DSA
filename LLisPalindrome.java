public class LLisPalindrome{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    static boolean isPalindrome(Node head){
        int[] arr=new int[100];
        int size=0;
        Node current=head;

        while(current!=null){
            arr[size++]=current.data;
            current=current.next;
        }
        int left=0;
        int right=size-1;
        while(left<right){

            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(20);
        head.next.next.next.next=new Node(10);

        System.out.println(isPalindrome(head));
    }
}