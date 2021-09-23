package ALink;

public class LinkTest {
    public Node getHead() {
        return head;
    }

    private Node head;

    public LinkTest(){
        this.head=null;
    }

    public void add(int key,int value){
        if(head==null){
            head=new Node(key,value);
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node(key,value);
        }
    }

    public Node get(int key){
        Node current=head;
        //获取头部是否匹配
        if(head.getKey().equals(key)){
            return current;
        }else{
            //头部不匹配就只能从 头部的下一个，下下一个，下下下一个获取。。。。。
            boolean isContinue=true;
            while(isContinue){
                current=current.next;//不停地的指到下一个节点
                if(current.getKey().equals(key)){
                    isContinue=false;
                }
            }
        }
        return current;
    }

    /**
     * 删除
     * @param key
     * @return
     */
    public boolean remove(int key){
        Node current= head;
        Node parent;
        if(current==null){
            return false;//如果头部为null，说明整个链是空的，无法删除
        }else if(current.getKey().equals(key)){
            head=head.next;//原来的头部其实还在内存里面，只是说我们把它从这个链条里剔除,过段时间java会回收被踢出的head
            return true;//删除成功
        }else{
            parent=head;//记录父节点位置                   1
            boolean isContinue=true;
            while(isContinue){
                current=current.next;
                if(current.getKey().equals(key)){
                    isContinue=false;
                }else{
                    parent=parent.next;
                }
            }
            //如果拿到需要删除的节点
            if(current!=null){
                if(current.next!=null){
                    parent.next=current.next; //老二的next指导 老三的next，老四取代老三的过程
                }else{
                    parent.next=null; //如果没有老四，那就是null来取代老三
                }
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     * 插队
     * @param newNode
     * @param index
     * @return
     */
    public boolean insertBefore(Node newNode,Integer index){
        if(head==null){
            if(index==1){
                head=newNode;
                return true;
            }else{
                System.out.println("该链为空，无法插入大于1的位置");
                return false;
            }
        }else{
            Node pre=head;
            while(pre.next!=null&&--index>1){
                pre=pre.next;
                return true;
            }

            if(pre.next!=null){
                newNode.next=pre.next;
                pre.next=newNode;
                return true;
            }else{
                return false;
            }
        }
    }

    /**
     * 打印所有的节点
     */
    public void log(){
        Node current=head;
        System.out.println(current.getValue());
        while(current.next!=null){
            current=current.next;
            System.out.println(current.getValue());

        }
    }

    //通过下标移除节点
    public void removeByIndex(Integer index){

    }

    //判断链里是否包含key为参数
    public boolean contains(Integer key){
        return true;
    }

    //截取 下标start开始，end结束
    public void cutOut(Integer start ,Integer end){

    }

    //获取整个列的长度
    public Integer size(){
        return null;
    }
}
