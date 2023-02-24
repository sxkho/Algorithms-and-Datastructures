public class Heap {

    public Integer depthPush = 0;
    public Integer depthAdd = 0;
    Node root;

    public class Node {

        public int branches;
        public Integer value;
        public Node left, right;

        public Node(Integer value) {
            this.value = value;
            this.left = this.right = null;
        }

        public Integer add(Integer data) {
            depthAdd++;
            Node currentNode = this;
            currentNode.branches++;
            Integer temp;
            if (data < currentNode.value) {
                temp = currentNode.value;
                currentNode.value = data;
                depthAdd--;

            } else {
                temp = data;
            }
            if (currentNode.left == null) {
                currentNode.left = new Node(temp);

            } else if (currentNode.right == null) {
                currentNode.right = new Node(temp);

            } else if (currentNode.left.branches < currentNode.right.branches) {
                currentNode.left.add(temp);

            } else if (currentNode.left.branches > currentNode.right.branches) {
                currentNode.right.add(temp);

            } else {
                currentNode.left.add(temp);
            }
            return depthAdd;
        }

        public Node remove() {
            Node currentNode = this;
            if (currentNode.left == null) {
                currentNode.branches--;//
                currentNode.value = currentNode.right.value;//
                if (currentNode.right.branches == 0) {//
                    currentNode.right = null;//
                }//
                else {//
                    currentNode.right = currentNode.right.remove();//
                }//
                return currentNode;
            } else if (currentNode.right == null) {
                currentNode.branches--; //
                currentNode.value = currentNode.left.value;//
                if (currentNode.left.branches == 0) {//
                    currentNode.left = null;//
                }//
                else {//
                    currentNode.left = currentNode.left.remove();//
                }//
                return currentNode;
            } else if (currentNode.right.value < currentNode.left.value) {
                currentNode.value = currentNode.right.value;
                currentNode.branches--;
                if (currentNode.right.branches == 0) {
                    currentNode.right = null;
                } else {
                    currentNode.right = currentNode.right.remove();
                }
                return currentNode;
            } else {
                currentNode.value = currentNode.left.value;
                currentNode.branches--;
                if (currentNode.left.branches == 0) {
                    currentNode.left = null;
                } else {
                    currentNode.left = currentNode.left.remove();
                }
                return currentNode;
            }
        }


        public Integer push() {
            Node currentNode = this;
            depthPush++;
            if (currentNode.left == null && currentNode.right == null) {
                return depthPush;
            }
            else if (currentNode.left != null && currentNode.left.value < currentNode.value) {
                if (currentNode.right != null && currentNode.right.value < currentNode.left.value) {
                    Integer temp = currentNode.value;
                    currentNode.value = currentNode.right.value;
                    currentNode.right.value = temp;
                    // depth++;
                    currentNode.right.push();
                }
                else {
                    Integer temp = currentNode.value;
                    currentNode.value = currentNode.left.value;
                    currentNode.left.value = temp;
                    // depth++;
                    currentNode.left.push();
                }
            }
            else if (currentNode.right != null && currentNode.right.value < currentNode.value) {
                if (currentNode.left != null && currentNode.left.value < currentNode.right.value) {
                    Integer temp = currentNode.value;
                    currentNode.value = currentNode.left.value;
                    currentNode.left.value = temp;
                    // depth++;
                    currentNode.left.push();
                }
                else {
                    Integer temp = currentNode.value;
                    currentNode.value = currentNode.right.value;
                    currentNode.right.value = temp;
                    // depth++;
                    currentNode.right.push();
                }
            }
            return depthPush;
        }
    }

    public Integer add(Integer data) {
        depthAdd = 1;
        if (root == null) {
            root = new Node(data);
            return depthAdd;
        } else {
            return root.add(data);
        }
    }

    public Integer remove() {
        if (root.branches == 0) {
            Integer temp = root.value;
            root = null;
            return temp;
        } else {
            Integer temp = root.value;
            root.remove();
            return temp;
        }
    }

    public Integer push(Integer incr) {
        if (root != null) {
            root.value += incr;
            return root.push();
        }
        return null;
    }

    public Heap() {
        root = null;
    }
}
