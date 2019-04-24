class Node { 							// 定义一个节点
    private String data; 					// 要保存的数据
    private Node next; 					// 要保存的下一个节点
    public Node(String data) { 				// 每一个Node类对象都必须保存相应的数据
        this.data = data;
    }
    public void setNext(Node next) {
        this.next = next;
    }
    public Node getNext() {
        return this.next;
    }
    public String getData() {
        return this.data;
    } 
    /**
     * 实现节点的添加（递归调用，目的是将新节点保存到最后一个节点之后）
     * 第一次调用（Link）：this = Link.root
     * 第二次调用（Node）：this = Link.root.next
     * 第三次调用（Node）：this = Link.root.next.next
     * @param newNode 新节点，节点对象由Link类创建
     */
    public void addNode(Node newNode) {
        if (this.next == null) { 				// 当前节点的下一个为null
        this.next = newNode; 			// 保存新节点
        } else { 						// 当前节点之后还存在节点
        this.next.addNode(newNode);		// 当前节点的下一个节点继续保存
        }
    }
    /**
     * 递归的方式输出每个节点保存的数据
     * 第一次调用（Link）：this = Link.root
     * 第二次调用（Node）：this = Link.root.next
     * 第三次调用（Node）：this = Link.root.next.next
     */
    public void printNode() {
        System.out.println(this.data); 		// 输出当前节点数据
        if (this.next != null) { 				// 还有下一个节点
         this.next.printNode(); 			// 找到下一个节点继续输出
        }
    }
}
class Link { 							// 负责数据的设置和输出
    private Node root; 					// 根节点
    /**
     * 向链表中增加新的数据，如果当前链表没有节点则将第一个数据作为节点
     * 如果有节点则使用Node类将新节点保存到最后一个节点之后
     * @param data 要保存的数据
*/
public void add(String data) { 
    Node newNode = new Node(data);		// 设置数据的先后关系，所以将data包装在一个Node类对象中
    if (this.root == null) { 				// 一个链表只有一个根节点
     this.root = newNode; 			// 将新的节点设置为根节点
    } else { 						// 根节点已经存在
     this.root.addNode(newNode);		// 交由Node类来进行节点保存
    }
}
/**
 * 使用递归方式，输出节点中的全部数据
 */
public void print() { 					// 输出数据
    if (this.root != null) { 				// 存在根节点
    this.root.printNode(); 			// 交给Node类输出
    }
}
}
public class linkDemo {
public static void main(String args[]) {
    Link link = new Link(); 				// 由这个类负责所有的数据操作
    link.add("Hello"); 					// 存放数据
    link.add("MLDN"); 				// 存放数据
    link.add("YOOTK"); 				// 存放数据
    link.add("李兴华"); 				// 存放数据
    link.print(); 						// 展示数据
}
}