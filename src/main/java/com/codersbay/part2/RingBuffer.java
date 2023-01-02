package com.codersbay.part2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * The RingBuffer class represents a first-in-first-out (FIFO) circular queue of
 * elements. It has a maximum capacity of elements it can hold. If more elements
 * are added, the last element will overwrite the first one.
 * <p>
 * Originally derived from
 * http://www.cs.princeton.edu/introcs/43stack/RingBuffer.java.html
 */
public class RingBuffer {
    private String[] queue;
    private int numberOfElementsOnQueue = 0;
    private int first = 0; // index of first element of queue
    private int last = -1; // index of next available slot

    public RingBuffer(int capacity) {
        if (capacity < 1) {
            throw new IllegalArgumentException("Initial capacity is less than one");
        }
        queue = new String[capacity];
    }

    /**
     * TODO: capacity Returns the number of elements the buffer can hold.
     */
    public int capacity() {
        return queue.length;
    }

    /**
     * TODO: size Returns the number of elements in the buffer.
     */
    public int size() {
        return numberOfElementsOnQueue;
    }

    /**
     * TODO: isEmpty Returns true if the buffer contains no elements.
     */
    public boolean isEmpty() {
        return numberOfElementsOnQueue == 0;
    }

    /**
     * TODO: isFull Returns true if the buffer has reached its capacity, which is
     * the maximum number of elements it can hold, before overwriting elements.
     */
    public boolean isFull() {
        return numberOfElementsOnQueue == queue.length;
    }

    /**
     * TODO: enqueue Appends the specified element to the end of the buffer. If the
     * buffer has already reached its capacity, appending overwrites the first
     * element in the buffer.
     *
     * @param item to be appended to the buffer.
     */
    public void enqueue(String item) {
        if (numberOfElementsOnQueue < queue.length) {
            numberOfElementsOnQueue++;
        }else {
            if (first == queue.length) {
                first =0;
            }else {
                first++;
            }
        }
        last++;

        if (last == queue.length) {
            last = 0;
        }
        queue[last] = item;
    }

    /**
     * TODO: peek Returns the first element from the buffer without removing it.
     *
     * @throws a RuntimeException if the buffer is empty.
     */
    public String peek() {
        return queue[last];
    }

    /**
     * @return an iterator over the elements in the buffer.
     */
    public Iterator<String> iterator() {
        return new RingBufferIterator();
    }

    private class RingBufferIterator implements Iterator<String> {
        private int i = first;

        private int sumelementcounter = 0;

        public boolean hasNext() {
            return sumelementcounter < numberOfElementsOnQueue;
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ++sumelementcounter;
            if (i == numberOfElementsOnQueue){
                i=0;
            }

            return queue[i++];
        }
    }
}