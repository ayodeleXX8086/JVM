package com.ayodele;

import java.util.*;

class Node<T extends Comparable<T>> {
    /** A reference to the Node's left subtree. **/
    Node<T> left;
    /** A reference to the Node's right subtree. **/
    Node<T> right;
    /** The Node's contents. **/
    T data;

    /** Construct a Node object.
        @param data The Node's contents.
    **/
    public Node(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    /** Insert new values into the tree.
        @param value The data value for the node to insert.
    **/
    public void insert(T value) {
        // value <= data
        if(value.compareTo(data) <= 0) {
            if(left == null) {
                // Insert at empty subtree
                left = new Node<T>(value);
            }
            else {
                // Continue searching for empty subtree
                left.insert(value);
            }
        }
        else { // value > data
            if(right == null) {
                // Insert at empty subtree
                right = new Node<T>(value);
            }
            else {
                // Continue searching for empty subtree
                right.insert(value);
            }
        }
    }

    /** Determines if the tree contains a specific value.
        @param value The value to search the tree for.
        @return True if tree contains value; otherwise, false. 
    **/
    public boolean contains(T value) {
        if(value.compareTo(data) == 0) {
            // Value found
            return true;
        }
        else if(value.compareTo(data) < 0) {
            return (left == null) 
                ? false // Not found; there are no more nodes in left subtree to check
                : left.contains(value); // Continue searching left subtree
        }
        else { // data.compareTo(value) > 0
            return (right == null) 
                ? false // Not found; there are no more nodes in right subrtree to check
                : right.contains(value); // Continue searching right subtree
        }
    }

    /** Print InOrder traversal of tree **/
    public void printInOrder() {
        if(left != null) {
            left.printInOrder();
        }

        System.out.print(data + " ");

        if(right != null) {
            right.printInOrder();
        } 
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node<Integer> root = new Node<Integer>(10);
        /*while(scanner.hasNextInt()) {
            int value = scanner.nextInt();
            root.insert(value);
        }*/
        root.insert(2);
        root.insert(3);
        root.insert(1);
        root.insert(6);
        root.insert(4);
        root.insert(5);
        root.insert(7);
        root.insert(9);
        root.insert(8);
        root.insert(23);
        /*scanner.close();*/

        root.printInOrder();
    }
}