package com.smn.codes.ds.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinkedListTest {

    private LinkedList<Integer> integerLinkedList;

    @Before
    public void setup() {
        integerLinkedList = new LinkedList<>();
    }

    @Test
    public void add_AddNewElement_SizeIsIncreasedBy1() {
        int expectedSize = integerLinkedList.size() + 1;
        integerLinkedList.add(1);

        int actualSize = integerLinkedList.size();

        assertThat(actualSize).isEqualTo(expectedSize);
    }

    @Test
    public void get_QueryForAnElementAtAnIndex_ShouldReturnAnElement() {
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);

        Integer actual = integerLinkedList.get(2);

        assertThat(actual).isEqualTo(3);
    }

    @Test
    public void get_DeleteAnElementAtAnIndex_ShouldReturnAnElement() {
        integerLinkedList.add(1);
        integerLinkedList.add(2);
        integerLinkedList.add(3);

        integerLinkedList.delete(0);

        assertThat(integerLinkedList.get(0)).isNotEqualTo(1);
    }
}