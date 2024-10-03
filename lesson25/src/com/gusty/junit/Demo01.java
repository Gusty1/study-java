package com.gusty.junit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Demo01 {

  @Test
  public void testMain() {
//        Assertions.assertEquals(rob(new int[]{2,3,2}),3);
//        System.out.println("Hello World");
    System.out.println();
    countSegments("    foo    bar");
  }

  public int countSegments(String s) {
    s = s.trim();
    if (s.isEmpty()) {
      return 0;
    }
    while (s.contains("  ")) {
      s = s.replaceAll("  ", " ");
    }
    System.out.println(s);
    String[] newStrAry = s.split(" ");
    System.out.println(Arrays.toString(newStrAry));
    System.out.println(newStrAry.length);
    return newStrAry.length;
//    return 0 ;
  }

  public class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}
