package practice;

import javafx.print.Collation;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Median of a stream of integers: Algorithm
 *
 *     Process integer from the stream and add it to the max heap.
 *     If the root of max heap greater than the root of the min heap:
 *         Delete the root from the max heap
 *         Add removed integer from the max heap to the min heap
 *     If the size difference between the two heaps is more than 2:
 *         Remove the root of the heap which has more elements.
 *         Add removed node to another heap.
 *     To calculate the median:
 *         If the size of both heaps equal, return average of their roots.
 *         Else, return the root of the heap with more elements.
 */
public class MedianOfIntegerStream {

    private PriorityQueue maxHeap;
    private PriorityQueue minHeap;


    public MedianOfIntegerStream() {
        maxHeap = new PriorityQueue(Collections.reverseOrder());
        minHeap = new PriorityQueue();
    }

    public static void main(String[] args) {
        MedianOfIntegerStream medianOfIntegerStream = new MedianOfIntegerStream();
        medianOfIntegerStream.processIntegers(12);
        medianOfIntegerStream.processIntegers(7);
        medianOfIntegerStream.processIntegers(9);
        medianOfIntegerStream.processIntegers(13);
        medianOfIntegerStream.processIntegers(15);
        System.out.println(medianOfIntegerStream.getMedian());

    }


    // process the integers those are coming from stream
    public void processIntegers(int data) {
        maxHeap.add(data);

        if (maxHeap.size() - minHeap.size() > 1
                || (minHeap.size() > 0
                && (int) maxHeap.peek() > (int) minHeap.peek())) {
            minHeap.add(maxHeap.poll());
        }

        if (minHeap.size() - maxHeap.size() > 1) {
            maxHeap.add(minHeap.poll());
        }
    }

    /**
     * To calculate the median:
     * If the size of both heaps equal, return average of their roots.
     * Else, return the root of the heap with more elements.
     *
     * @return
     */
    public double getMedian() {

        if (maxHeap.size() == minHeap.size())
            return (double) ((int) maxHeap.peek() + (int) minHeap.peek()) / 2;
        else if (minHeap.size() > maxHeap.size())
            return (double) (int) minHeap.peek();

        return (double) (int) maxHeap.peek();
    }
}
