package com.wyn.top100;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node {
        int key;
        int value;
        Node prev;
        Node next;
        public Node() {}
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer, Node> map;
    private int capacity;
    private Node head, tail;

    public LRUCache(int capacity) {
        map = new HashMap<>(capacity);
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    private void addFirst(Node node) {
        Node firstNode = head.next;
        node.next = firstNode;
        firstNode.prev = node;
        node.prev = head;
        head.next = node;
    }

    private void addLast(Node node) {
        Node lastNode = tail.prev;
        node.prev = lastNode;
        lastNode.next = node;
        node.next = tail;
        tail.prev = node;
    }

    private void removeLast() {
        Node lastNode = tail.prev;
        lastNode.prev.next = tail;
        tail.prev = lastNode.prev;
        map.remove(lastNode.key);
    }

    public int get(int key) {
        Node node = map.get(key);
        if (node == null) {
            return -1;
        }
        node.prev.next = node.next;
        node.next.prev = node.prev;
        addFirst(node);
        System.out.println("get:" + node.key + ":" + node.value);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node(key, value);
            if (map.size() + 1 > capacity) {
                removeLast();
            }
            map.put(key, node);
            addFirst(node);
        } else {
            node.value = value;
            map.put(key, node);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            addFirst(node);
        }
        print();
    }
    private void print() {
        Node node = head.next;
        while (node.next != null) {
            System.out.print("[" + node.key + ":" + node.value + "]");
            System.out.print(",");
            node = node.next;
        }
        System.out.println();
    }
}
